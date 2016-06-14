// Generated from E:/Studium/IDEA/MiniGoSemantics/src/main/antlr4/de/wernet/miniGoSemantics/antlr\MiniGo.g4 by ANTLR 4.5.3
package de.wernet.minigosemantics.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniGoParser}.
 */
public interface MiniGoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniGoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MiniGoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniGoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MiniGoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniGoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniGoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniGoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniGoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniGoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniGoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniGoParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterBexp(MiniGoParser.BexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniGoParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitBexp(MiniGoParser.BexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniGoParser#cexp}.
	 * @param ctx the parse tree
	 */
	void enterCexp(MiniGoParser.CexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniGoParser#cexp}.
	 * @param ctx the parse tree
	 */
	void exitCexp(MiniGoParser.CexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniGoParser#cterm}.
	 * @param ctx the parse tree
	 */
	void enterCterm(MiniGoParser.CtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniGoParser#cterm}.
	 * @param ctx the parse tree
	 */
	void exitCterm(MiniGoParser.CtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniGoParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterAexp(MiniGoParser.AexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniGoParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitAexp(MiniGoParser.AexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniGoParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MiniGoParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniGoParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MiniGoParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiniGoParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiniGoParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniGoParser#ints}.
	 * @param ctx the parse tree
	 */
	void enterInts(MiniGoParser.IntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniGoParser#ints}.
	 * @param ctx the parse tree
	 */
	void exitInts(MiniGoParser.IntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniGoParser#bools}.
	 * @param ctx the parse tree
	 */
	void enterBools(MiniGoParser.BoolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniGoParser#bools}.
	 * @param ctx the parse tree
	 */
	void exitBools(MiniGoParser.BoolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniGoParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(MiniGoParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniGoParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(MiniGoParser.VarsContext ctx);
}