// Generated from E:/Studium/IDEA/MiniGoSemantics/src/main/antlr4/de/wernet/miniGoSemantics/antlr\MiniGo.g4 by ANTLR 4.5.3
package de.wernet.minigosemantics.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniGoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniGoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MiniGoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniGoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniGoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexp(MiniGoParser.BexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#cexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexp(MiniGoParser.CexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#cterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCterm(MiniGoParser.CtermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexp(MiniGoParser.AexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MiniGoParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MiniGoParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#ints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInts(MiniGoParser.IntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#bools}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBools(MiniGoParser.BoolsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(MiniGoParser.VarsContext ctx);
}