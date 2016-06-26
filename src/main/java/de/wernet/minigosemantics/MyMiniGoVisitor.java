package de.wernet.minigosemantics;

import com.sun.istack.internal.NotNull;
import de.wernet.minigosemantics.antlr.MiniGoBaseVisitor;
import de.wernet.minigosemantics.antlr.MiniGoParser;
import de.wernet.minigosemantics.antlr.MiniGoVisitor;
import de.wernet.minigosemantics.semanticrules.MyState;

/**
 * This class implements a custom Visitor for the MiniGo grammar to check the operational semantic rules.
 * Created by Christian Wernet on 14.06.2016.
 */
public class MyMiniGoVisitor extends MiniGoBaseVisitor implements MiniGoVisitor {

    private final MyState myState;

    /**
     * Create a new instance of the custom MiniGoVisitor-class.
     * @param _myState an instance of the custom MyState-class to store all found variables and their values
     */
    public MyMiniGoVisitor(MyState _myState) {
        this.myState = _myState;
    }


    @Override
    public Object visitProg(@NotNull MiniGoParser.ProgContext ctx) {
//        System.out.println("Prog: " + ctx.getText());
        return super.visit(ctx.block());
    }

    @Override
    public Object visitBlock(MiniGoParser.BlockContext ctx) {
//        System.out.println("Block: " + ctx.getText());
        return super.visitBlock(ctx);
    }

    @Override
    public Object visitStatementSequence(MiniGoParser.StatementSequenceContext ctx) {
//        System.out.println("Statement: " + ctx.getText());
        return super.visitStatementSequence(ctx);
    }

    @Override
    public Object visitVariableDeclaration(MiniGoParser.VariableDeclarationContext ctx) {
        //Child(1) can be ignored as it is the declaration-sign ':='
        String variableName = ctx.getChild(0).getText();
        String child2 = ctx.getChild(2).getText();
        if(myState.isChannelDeclared(variableName) || myState.getIntegerVariables().containsKey(variableName) || myState.getBooleanVariables().containsKey(variableName)){
            System.out.println("ERROR: Variable '" + variableName + "' has already been declared.");
            System.exit(1);
            return null;
        }
        if (child2.contains("true") || child2.contains("false")) {
            boolean resultBool = (boolean) super.visit(ctx.getChild(2));
            System.out.println("Found Variable: " + variableName + " Value: " + resultBool + "\n");
            myState.addBooleanVariable(variableName, resultBool);
            return resultBool;
//            return (boolean) super.visit(ctx.getChild(2));
        } else {
            try {
                int resultInt = (int) super.visit(ctx.getChild(2));
                System.out.print("Found Variable: " + variableName + " Value: " + resultInt + "\n");
                myState.addIntegerVariable(variableName, resultInt);
                return resultInt;
            } catch (ClassCastException e) {
                boolean resultBool = (boolean) super.visit(ctx.getChild(2));
                System.out.println("Found Variable: " + variableName + " Value: " + resultBool + "\n");
                myState.addBooleanVariable(variableName, resultBool);
                return resultBool;
            }
//            return (int) super.visit(ctx.getChild(2));
        }
    }

    @Override
    public Object visitChannelDeclaration(MiniGoParser.ChannelDeclarationContext ctx) {
        String variableName = ctx.getChild(0).getText();
        if (myState.isChannelDeclared(variableName)) {
            System.out.println("ERROR: Channel '" + variableName + "' has already been declared.");
            System.exit(1);
        } else {
            myState.addChannel(variableName);
        }
        return null;
    }

    @Override
    public Object visitVariableAssignment(MiniGoParser.VariableAssignmentContext ctx) {
        String variableName = ctx.getChild(0).getText();
        if (myState.isChannelDeclared(variableName)) {
            System.out.println("ERROR: Variable '" + variableName + "' can't be assigned since it has been declared to be a channel.");
            System.exit(1);
        } else if (myState.getBooleanVariables().containsKey(variableName)) {
            try {
                myState.addBooleanVariable(variableName, (boolean) super.visit(ctx.getChild(2)));
            } catch (ClassCastException e) {
                System.out.println("ERROR: An Integer can't be assigned to the boolean variable '" + variableName + "'.");
                System.exit(1);
            }
        } else if (myState.getIntegerVariables().containsKey(variableName)) {
            try {
                myState.addIntegerVariable(variableName, (int) super.visit(ctx.getChild(2)));
            } catch (ClassCastException e) {
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
    public Object visitWhile(MiniGoParser.WhileContext ctx) {
        try {
            boolean bexp = (boolean) super.visit(ctx.getChild(1));
        } catch (ClassCastException e) {
            System.out.println("ERROR: Expression '" + ctx.getChild(1).getText() + "' couldn't be evaluated to a boolean.");
            System.exit(1);
        }
        while ((boolean) super.visit(ctx.getChild(1))) {
            super.visit(ctx.getChild(2));
        }
        return null;
    }

    @Override
    public Object visitIfElse(MiniGoParser.IfElseContext ctx) {
        //evaluate BExp
        boolean bexp = false;
        try {
            bexp = (boolean) super.visit(ctx.getChild(1));
        } catch (ClassCastException e) {
            System.out.println("ERROR: Expression '" + ctx.getChild(1).getText() + "' couldn't be evaluated to a boolean.");
            System.exit(1);
        }
        if (bexp) {
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
        int childCount = ctx.getChildCount();
//        System.out.println("BEXP: " + storedValue);
        if (childCount > 1 || storedValue.contains("true") || storedValue.contains("false")) {
            //Initialized with true because 'true' is the neutral element of the Boolean algebra.
            boolean returnBool = true;
            for (int i = 0; i < childCount; i += 2) {
                if (!(boolean) super.visit(ctx.getChild(i))) {
                    returnBool = false;
                    break;
                } else {
                    returnBool &= (boolean) super.visit(ctx.getChild(i));
                }
            }
            return returnBool;
        } else {
            try {
                int returnInt = (int) super.visit(ctx.getChild(0));
                return returnInt;
            } catch (ClassCastException e) {
                return super.visit(ctx.getChild(0));
            } catch (NullPointerException e) {
                System.out.println("NullPointerException @ Bexp: " + ctx.getText());
                System.exit(1);
                return null;
            }
        }
//        System.out.println("Bexp: " + ctx.getText());
    }

    @Override
    public Object visitOnlyCTerm(MiniGoParser.OnlyCTermContext ctx) {
//        System.out.println("Only CTerm: " + ctx.getText());
//        super.visitCexp(ctx);
        return super.visitOnlyCTerm(ctx);
    }

    @Override
    public Object visitEvaluation(MiniGoParser.EvaluationContext ctx) {
        //evaluate, if both sides of the evaluation-sign are equal and return the Boolean result
        return super.visit(ctx.getChild(0)) == super.visit(ctx.getChild(2));
    }

    @Override
    public Object visitOnlyAExp(MiniGoParser.OnlyAExpContext ctx) {
//        System.out.println("Only AExp: " + ctx.getText());
        return super.visitOnlyAExp(ctx);
    }

    @Override
    public Object visitGreaterThan(MiniGoParser.GreaterThanContext ctx) {
        try {
            int leftSide = (int) super.visit(ctx.getChild(0));
            int rightSide = (int) super.visit(ctx.getChild(2));
            return leftSide > rightSide;
        } catch (ClassCastException e) {
            System.out.println("ERROR: Expression '" + ctx.getText() + "' couldn't be evaluated to a boolean because one side is not an integer.");
            System.exit(1);
            return null;
        }
    }

    @Override
    public Object visitAexp(MiniGoParser.AexpContext ctx) {
        if (ctx.getChildCount() > 1) {
//            System.out.println("Aexp multiple children: " + ctx.getText());
            int result = 0;
            for (int i = 0; i < ctx.getChildCount(); i++) {
                if (i == 0) {
                    result = (int) super.visit(ctx.getChild(0));
                } else {
                    if (ctx.getChild(i).getText().equals("+")) {
                        i++;
                        result += (int) super.visit(ctx.getChild(i));
                    } else {
                        i++;
                        result -= (int) super.visit(ctx.getChild(i));
                    }
                }
            }
//            System.out.println("AEXP multiple children result: " + result);
            return result;
        } else {
//            System.out.println("Aexp one child: " + ctx.getText());
            return super.visitAexp(ctx);
        }
    }

    @Override
    public Object visitTerm(MiniGoParser.TermContext ctx) {
        if (ctx.getChildCount() > 1) {
//            System.out.println("Term multiple children: " + ctx.getText());
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
//            System.out.println("Term multiple children result: " + result);
            return result;
        } else {
//            System.out.println("Term one child: " + ctx.getText());
            return super.visitTerm(ctx);
        }
    }

    @Override
    public Object visitNot(MiniGoParser.NotContext ctx) {
        try {
            boolean evaluation = (boolean) super.visit(ctx.getChild(1));
            return !evaluation;
        } catch (ClassCastException e) {
            System.out.println("ERROR: Expression '" + ctx.getChild(1).getText() + "' can't be negotiated as it is no boolean expression.");
            System.exit(1);
            return null;
        }
    }

    @Override
    public Object visitInts(MiniGoParser.IntsContext ctx) {
        String storedValue = ctx.getText();
//        System.out.println("INT: " + storedValue);
        return Integer.parseInt(storedValue);
    }

    @Override
    public Object visitBools(MiniGoParser.BoolsContext ctx) {
        String storedValue = ctx.getText();
//        System.out.println("BOOL: " + storedValue);
        return Boolean.parseBoolean(storedValue);
    }

    @Override
    public Object visitVars(MiniGoParser.VarsContext ctx) {
        String variableName = ctx.getText();
//        System.out.println("Vars: " + variableName);
        if (myState.getBooleanVariables().containsKey(variableName)) {
            return myState.getBooleanVariable(variableName);
        } else if (myState.getIntegerVariables().containsKey(variableName)) {
            return myState.getIntegerVariable(variableName);
        } else {
            return ctx.getText();
        }
    }

    @Override
    public Object visitParentheses(MiniGoParser.ParenthesesContext ctx) {
        //Since the first child (0) of this rule is '(' and the third child (2) is ')', we only need to visit the
        //second child to continue.
        return super.visit(ctx.getChild(1));
    }
}