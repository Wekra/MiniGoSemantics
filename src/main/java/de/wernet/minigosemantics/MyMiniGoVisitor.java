package de.wernet.minigosemantics;

import com.sun.istack.internal.NotNull;
import de.wernet.minigosemantics.antlr.MiniGoBaseVisitor;
import de.wernet.minigosemantics.antlr.MiniGoParser;
import de.wernet.minigosemantics.antlr.MiniGoVisitor;
import de.wernet.minigosemantics.semanticrules.State;
import de.wernet.minigosemantics.semanticrules.Statement;
import de.wernet.minigosemantics.semanticrules.Variable;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.AbstractMap;
import java.util.List;

/**
 * Created by Christian on 14.06.2016.
 */
public class MyMiniGoVisitor extends MiniGoBaseVisitor implements MiniGoVisitor {

    private State state;

    public MyMiniGoVisitor(State _state) {
        this.state = _state;
    }


    @Override
    public Object visitProg(@NotNull MiniGoParser.ProgContext ctx) {
        System.out.println("Prog: " + ctx.getText());
        return super.visit(ctx.block());
    }

    @Override
    public AbstractMap.SimpleImmutableEntry<State, List<Statement>> visitBlock(MiniGoParser.BlockContext ctx) {
        System.out.println("Block: " + ctx.getText());
        return (AbstractMap.SimpleImmutableEntry<State, List<Statement>>) super.visitBlock(ctx);
    }

    @Override
    public AbstractMap.SimpleImmutableEntry<State, List<Statement>> visitStatementSequence(MiniGoParser.StatementSequenceContext ctx) {
        System.out.println("Statement: " + ctx.getText());
        super.visitStatementSequence(ctx);
        return null;
    }

    @Override
    public Object visitVariableDeclaration(MiniGoParser.VariableDeclarationContext ctx) {
        //Child(1) can be ignored as it is the declaration-sign ':='
        System.out.println("VariableDeclaration: ");
        String variableName = ctx.getChild(0).getText();
        String child2 = ctx.getChild(2).getText();
        if (child2.contains("true") || child2.contains("false")) {
            boolean resultBool = (boolean) super.visit(ctx.getChild(2));
            System.out.println("Variable: " + variableName + " Value: " + resultBool + "\n");
            state.addBooleanVariable(variableName, resultBool);
            return resultBool;
//            return (boolean) super.visit(ctx.getChild(2));
        } else {
            try {
                int resultInt = (int) super.visit(ctx.getChild(2));
                System.out.print("Variable: " + variableName + " Value: " + resultInt + "\n");
                state.addIntegerVariable(variableName, resultInt);
                return resultInt;
            }catch(ClassCastException e){
                boolean resultBool = (boolean) super.visit(ctx.getChild(2));
                System.out.println("Variable: " + variableName + " Value: " + resultBool + "\n");
                state.addBooleanVariable(variableName, resultBool);
                return resultBool;
            }
//            return (int) super.visit(ctx.getChild(2));
        }

//        Variable v = new Variable(ctx.getChild(0).getText(), ctx.getChild(2).getText());
//        state.addVariable(ctx.getChild(0).getText(), v);
    }

    @Override
    public Object visitVariableAssignement(MiniGoParser.VariableAssignementContext ctx){
        String variableName = ctx.getChild(0).getText();
        if(state.getBooleanVariables().containsKey(variableName)){
            try {
                state.addBooleanVariable(variableName, (boolean) super.visit(ctx.getChild(2)));
            }catch(ClassCastException e){
                System.out.println("ERROR: An Integer can't be assigned to the boolean variable '" + variableName + "'.");
                System.exit(1);
            }
        } else if(state.getIntegerVariables().containsKey(variableName)){
            try {
                state.addIntegerVariable(variableName, (int) super.visit(ctx.getChild(2)));
            }catch(ClassCastException e){
                System.out.println("ERROR: A boolean value can't be assigned to the integer variable '" + variableName + "'.");
                System.exit(1);
            }
        } else {
            System.out.println("ERROR: Variable '" + variableName + "' has not been declared!");
            System.exit(1);
        }
        return null;
    }

    @Override
    public Object visitWhile(MiniGoParser.WhileContext ctx){

        return null;
    }

    @Override
    public Object visitIfElse(MiniGoParser.IfElseContext ctx){
        //evaluate BExp
        boolean bexp = false;
        try {
            bexp = (boolean) super.visit(ctx.getChild(1));
        }catch(ClassCastException e){
            System.out.println("ERROR: Expression '" + ctx.getChild(1).getText() + "' couldn't be evaluated to a boolean.");
            System.exit(1);
        }
        if(bexp){
            //execute if statement (child 2)
            super.visit(ctx.getChild(2));
        } else {
            //execute else statement (child 4)
            super.visit(ctx.getChild(4));
        }

        return null;
    }

    @Override
    public Object visitBexp(MiniGoParser.BexpContext ctx) {
        String storedValue = ctx.getText();
        System.out.println("BEXP: " + storedValue);
        if (ctx.children.size() > 1 || storedValue.contains("true") || storedValue.contains("false")) {
            boolean returnBool = true;
            for (ParseTree t : ctx.children) {
                returnBool &= (boolean) super.visit(t);
            }
            return returnBool;
        } else {
            try {
                int returnInt = (int) super.visit(ctx.getChild(0));
                return returnInt;
            } catch (ClassCastException e) {
                return super.visit(ctx.getChild(0));
            } catch (NullPointerException e) {
                System.out.println("Nullpointerexception @ BEXP: " + ctx.getText());
//                System.exit(1);
                return null;
            }
        }

//        System.out.println("Bexp: " + ctx.getText());
    }

    @Override
    public Object visitOnlyCTerm(MiniGoParser.OnlyCTermContext ctx) {
        System.out.println("Only CTerm: " + ctx.getText());
//        super.visitCexp(ctx);
        return super.visitOnlyCTerm(ctx);
    }

    @Override
    public Object visitEvaluation(MiniGoParser.EvaluationContext ctx) {
        return super.visit(ctx.getChild(0)) == super.visit(ctx.getChild(2)) ? true : false;
    }

    @Override
    public Object visitOnlyAExp(MiniGoParser.OnlyAExpContext ctx) {
        System.out.println("Only AExp: " + ctx.getText());
        return super.visitOnlyAExp(ctx);
//        return 6;
    }

    @Override
    public Object visitGreaterThan(MiniGoParser.GreaterThanContext ctx){
        try {
            int leftSide = (int) super.visit(ctx.getChild(0));
            int rightSide = (int) super.visit(ctx.getChild(2));
            return leftSide > rightSide ? true : false;
        } catch (ClassCastException e){
            System.out.println("ERROR: Expression '" + ctx.getText() + "' couldn't be evaluated to a boolean because one side is not an integer.");
            System.exit(1);
            return null;
        }
    }

    @Override
    public Object visitAexp(MiniGoParser.AexpContext ctx) {
        if (ctx.getChildCount() > 1) {
            System.out.println("Aexp multiple children: " + ctx.getText());
            int result = 0;
            for (int i = 0; i < ctx.getChildCount(); i++) {
                if (i == 0) {
                    result = (int) super.visit(ctx.getChild(0));
                } else {
                    if(ctx.getChild(i).getText().equals("+")){
                        i++;
                        result += (int) super.visit(ctx.getChild(i));
                    } else {
                        i++;
                        result -= (int) super.visit(ctx.getChild(i));
                    }
                }
            }
            System.out.println("AEXP multiple children result: " + result);
            return result;
        }else{
            System.out.println("Aexp one child: " + ctx.getText());
            return super.visitAexp(ctx);
        }

//        return 7;
    }

    @Override
    public Object visitTerm(MiniGoParser.TermContext ctx) {
        if (ctx.getChildCount() > 1) {
            System.out.println("Term multiple children: " + ctx.getText());
            int result = 0;
            for (int i = 0; i < ctx.getChildCount(); i++) {
                if (i == 0) {
                    result = (int) super.visit(ctx.getChild(0));
                } else {
                    if (ctx.getChild(i).getText().equals("*")) {
                        i++;
                        result *= (int) super.visit(ctx.getChild(i));
                    } else {
                        i++;
                        try {
                            result /= (int) super.visit(ctx.getChild(i));
                        } catch (ArithmeticException e) {
                            System.out.println("Division by zero @ TERM: " + ctx.getText());
                        }
                    }
                }
            }
            System.out.println("Term multiple children result: " + result);
            return result;
        } else {
            System.out.println("Term one child: " + ctx.getText());
            return super.visitTerm(ctx);
        }

//        return 8;
    }

//    @Override
//    public Object visitFactor(MiniGoParser.FactorContext ctx) {
//        System.out.println("Factor: " + ctx.getText());
//        super.visitFactor(ctx);
//        return 9;
//    }

    @Override
    public Object visitNot(MiniGoParser.NotContext ctx){

        try{
            boolean evaluation = (boolean) super.visit(ctx.getChild(1));
            return !evaluation;
        } catch(ClassCastException e){
            System.out.println("ERROR: Expression '" + ctx.getChild(1).getText() + "' can't be negotiated as it is no boolean expression.");
            System.exit(1);
            return null;
        }
    }

    @Override
    public Object visitInts(MiniGoParser.IntsContext ctx) {
        String storedValue = ctx.getText();
        System.out.println("INT: " + storedValue);
        return Integer.parseInt(storedValue);
    }

    @Override
    public Object visitBools(MiniGoParser.BoolsContext ctx) {
        String storedValue = ctx.getText();
        System.out.println("BOOL: " + storedValue);
        return Boolean.parseBoolean(storedValue);
//        super.visitBools(ctx);
//        return 11;
    }

    @Override
    public Object visitVars(MiniGoParser.VarsContext ctx) {
        String variableName = ctx.getText();
        System.out.println("Vars: " + variableName);
        if(state.getBooleanVariables().containsKey(variableName)){
            return state.getBooleanVariable(variableName);
        } else if(state.getIntegerVariables().containsKey(variableName)){
            return state.getIntegerVariable(variableName);
        } else {
            return ctx.getText();
        }
//        return new Variable("x", null);
    }

    @Override
    public Object visitBoolean(MiniGoParser.BooleanContext ctx) {
        return super.visitBoolean(ctx);
    }

    @Override
    public Object visitParantheses(MiniGoParser.ParanthesesContext ctx){
        //First child (0) is '(' and third child (2) is ')'
        return super.visit(ctx.getChild(1));
    }

    public State getState() {
        return this.state;
    }
}
