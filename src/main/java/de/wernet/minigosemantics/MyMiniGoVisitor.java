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
public class MyMiniGoVisitor  extends MiniGoBaseVisitor implements MiniGoVisitor {

    private State state;

    public MyMiniGoVisitor(State _state){
        this.state = _state;
    }


    @Override
    public AbstractMap.SimpleImmutableEntry<State, List<Statement>> visitProg(@NotNull MiniGoParser.ProgContext ctx) {
        System.out.println("Prog: " + ctx.getText());
        return (AbstractMap.SimpleImmutableEntry<State, List<Statement>>) super.visitProg(ctx);
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
    public Object visitVariableDeclaration(MiniGoParser.VariableDeclarationContext ctx){
        System.out.println("VariableDeclaration: V=" + ctx.getChild(0).getText() + ", Value=" + ctx.getChild(2).getText() );
        Variable v = new Variable(ctx.getChild(0).getText(), ctx.getChild(2).getText());
        state.addVariable(ctx.getChild(0).getText(), v);
        return null;
    }

    @Override
    public AbstractMap.SimpleImmutableEntry<State, List<Statement>> visitBexp(MiniGoParser.BexpContext ctx) {
        System.out.println("Bexp: " + ctx.getText());
        super.visitBexp(ctx);
        return null;
    }

    @Override
    public Object visitCexp(MiniGoParser.CexpContext ctx) {
        System.out.println("Cexp: " + ctx.getText());
        super.visitCexp(ctx);
        return 5;
    }

    @Override
    public Object visitCterm(MiniGoParser.CtermContext ctx) {
        System.out.println("Cterm: " + ctx.getText());
        super.visitCterm(ctx);
        return 6;
    }

    @Override
    public Object visitAexp(MiniGoParser.AexpContext ctx) {
        System.out.println("Aexp: " + ctx.getText());
        super.visitAexp(ctx);
        return 7;
    }

    @Override
    public Object visitTerm(MiniGoParser.TermContext ctx) {
        System.out.println("Term: " + ctx.getText());
        super.visitTerm(ctx);
        return 8;
    }

//    @Override
//    public Object visitFactor(MiniGoParser.FactorContext ctx) {
//        System.out.println("Factor: " + ctx.getText());
//        super.visitFactor(ctx);
//        return 9;
//    }

    @Override
    public Object visitInts(MiniGoParser.IntsContext ctx) {
        System.out.println("INT: " + ctx.getText());
        super.visitInts(ctx);
        return 10;
    }

    @Override
    public Object visitBools(MiniGoParser.BoolsContext ctx) {
        System.out.println("BOOL: " + ctx.getText());
        super.visitBools(ctx);
        return 11;
    }

    @Override
    public Object visitVars(MiniGoParser.VarsContext ctx) {
        System.out.println("Vars: " + ctx.getText());
        super.visitVars(ctx);
        return new Variable("x", null);
    }

    public State getState(){
        return this.state;
    }
}
