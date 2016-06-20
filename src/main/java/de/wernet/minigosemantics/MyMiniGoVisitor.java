package de.wernet.minigosemantics;

import com.sun.istack.internal.NotNull;
import de.wernet.minigosemantics.antlr.MiniGoBaseVisitor;
import de.wernet.minigosemantics.antlr.MiniGoParser;
import de.wernet.minigosemantics.antlr.MiniGoVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by Christian on 14.06.2016.
 */
public class MyMiniGoVisitor extends MiniGoBaseVisitor implements MiniGoVisitor {


    @Override
    public Object visitProg(@NotNull MiniGoParser.ProgContext ctx) {
        super.visitProg(ctx);
        System.out.println("Prog: " + ctx.getText());
        return 1;
    }

    @Override
    public Object visitBlock(MiniGoParser.BlockContext ctx) {
        super.visitBlock(ctx);
        System.out.println("Block: " + ctx.getText());
        return 2;
    }

    @Override
    public Object visitStatement(MiniGoParser.StatementContext ctx) {
        super.visitStatement(ctx);
        System.out.println("Statement: " + ctx.getText());
        return 3;
    }

    @Override
    public Object visitBexp(MiniGoParser.BexpContext ctx) {
        super.visitBexp(ctx);
        System.out.println("Bexp: " + ctx.getText());
        return 4;
    }

    @Override
    public Object visitCexp(MiniGoParser.CexpContext ctx) {
        super.visitCexp(ctx);
        System.out.println("Cexp: " + ctx.getText());
        return 5;
    }

    @Override
    public Object visitCterm(MiniGoParser.CtermContext ctx) {
        super.visitCterm(ctx);
        System.out.println("Cterm: " + ctx.getText());
        return 6;
    }

    @Override
    public Object visitAexp(MiniGoParser.AexpContext ctx) {
        super.visitAexp(ctx);
        System.out.println("Aexp: " + ctx.getText());
        return 7;
    }

    @Override
    public Object visitTerm(MiniGoParser.TermContext ctx) {
        super.visitTerm(ctx);
        System.out.println("Term: " + ctx.getText());
        return 8;
    }

    @Override
    public Object visitFactor(MiniGoParser.FactorContext ctx) {
        super.visitFactor(ctx);
        System.out.println("Factor: " + ctx.getText());
        return 9;
    }

    @Override
    public Object visitInts(MiniGoParser.IntsContext ctx) {
        super.visitInts(ctx);
        System.out.println("INT: " + ctx.getText());
        return 10;
    }

    @Override
    public Object visitBools(MiniGoParser.BoolsContext ctx) {
        super.visitBools(ctx);
        System.out.println("BOOL: " + ctx.getText());
        return 11;
    }

    @Override
    public Object visitVars(MiniGoParser.VarsContext ctx) {
        super.visitVars(ctx);
        System.out.println("Vars: " + ctx.getText());
        return 12;
    }
}
