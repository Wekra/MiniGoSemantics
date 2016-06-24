// Generated from C:/Workspaces/IntelliJ_Workspace/MiniGoSemantics/src/main/antlr4/de/wernet/minigosemantics/antlr\MiniGo.g4 by ANTLR 4.5.3
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
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MiniGoParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(MiniGoParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChannelDeclaration}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelDeclaration(MiniGoParser.ChannelDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementSequence}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSequence(MiniGoParser.StatementSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(MiniGoParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(MiniGoParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GoBlock}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoBlock(MiniGoParser.GoBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignementThroughChannel}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignementThroughChannel(MiniGoParser.AssignementThroughChannelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetValueFromChannel}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetValueFromChannel(MiniGoParser.GetValueFromChannelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableAssignement}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignement(MiniGoParser.VariableAssignementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationThroughChannel}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationThroughChannel(MiniGoParser.VariableDeclarationThroughChannelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniGoParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBexp(MiniGoParser.BexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OnlyCTerm}
	 * labeled alternative in {@link MiniGoParser#cexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyCTerm(MiniGoParser.OnlyCTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Evaluation}
	 * labeled alternative in {@link MiniGoParser#cexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation(MiniGoParser.EvaluationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OnlyAExp}
	 * labeled alternative in {@link MiniGoParser#cterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyAExp(MiniGoParser.OnlyAExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link MiniGoParser#cterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(MiniGoParser.GreaterThanContext ctx);
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
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(MiniGoParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(MiniGoParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MiniGoParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(MiniGoParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parantheses}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParantheses(MiniGoParser.ParanthesesContext ctx);
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