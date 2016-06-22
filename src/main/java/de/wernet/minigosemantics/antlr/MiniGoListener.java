// Generated from C:/Workspaces/IntelliJ_Workspace/MiniGoSemantics/src/main/antlr4/de/wernet/minigosemantics/antlr\MiniGo.g4 by ANTLR 4.5.3
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
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MiniGoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MiniGoParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(MiniGoParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(MiniGoParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChannelDeclaration}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterChannelDeclaration(MiniGoParser.ChannelDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChannelDeclaration}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitChannelDeclaration(MiniGoParser.ChannelDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementSequence}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSequence(MiniGoParser.StatementSequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementSequence}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSequence(MiniGoParser.StatementSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(MiniGoParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclaration}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(MiniGoParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code While}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile(MiniGoParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code While}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile(MiniGoParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GoBlock}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterGoBlock(MiniGoParser.GoBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GoBlock}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitGoBlock(MiniGoParser.GoBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignementThroughChannel}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignementThroughChannel(MiniGoParser.AssignementThroughChannelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignementThroughChannel}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignementThroughChannel(MiniGoParser.AssignementThroughChannelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetValueFromChannel}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterGetValueFromChannel(MiniGoParser.GetValueFromChannelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetValueFromChannel}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitGetValueFromChannel(MiniGoParser.GetValueFromChannelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssignement}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignement(MiniGoParser.VariableAssignementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssignement}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignement(MiniGoParser.VariableAssignementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationThroughChannel}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationThroughChannel(MiniGoParser.VariableDeclarationThroughChannelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationThroughChannel}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationThroughChannel(MiniGoParser.VariableDeclarationThroughChannelContext ctx);
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
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MiniGoParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MiniGoParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(MiniGoParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(MiniGoParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MiniGoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MiniGoParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNot(MiniGoParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNot(MiniGoParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parantheses}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParantheses(MiniGoParser.ParanthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parantheses}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParantheses(MiniGoParser.ParanthesesContext ctx);
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