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
	 * Enter a parse tree produced by the {@code VariableAssignment}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(MiniGoParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssignment}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(MiniGoParser.VariableAssignmentContext ctx);
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
	 * Enter a parse tree produced by the {@code PutValueIntoChannel}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPutValueIntoChannel(MiniGoParser.PutValueIntoChannelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PutValueIntoChannel}
	 * labeled alternative in {@link MiniGoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPutValueIntoChannel(MiniGoParser.PutValueIntoChannelContext ctx);
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
	 * Enter a parse tree produced by the {@code OnlyCTerm}
	 * labeled alternative in {@link MiniGoParser#cexp}.
	 * @param ctx the parse tree
	 */
	void enterOnlyCTerm(MiniGoParser.OnlyCTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OnlyCTerm}
	 * labeled alternative in {@link MiniGoParser#cexp}.
	 * @param ctx the parse tree
	 */
	void exitOnlyCTerm(MiniGoParser.OnlyCTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Evaluation}
	 * labeled alternative in {@link MiniGoParser#cexp}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation(MiniGoParser.EvaluationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Evaluation}
	 * labeled alternative in {@link MiniGoParser#cexp}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation(MiniGoParser.EvaluationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OnlyAExp}
	 * labeled alternative in {@link MiniGoParser#cterm}.
	 * @param ctx the parse tree
	 */
	void enterOnlyAExp(MiniGoParser.OnlyAExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OnlyAExp}
	 * labeled alternative in {@link MiniGoParser#cterm}.
	 * @param ctx the parse tree
	 */
	void exitOnlyAExp(MiniGoParser.OnlyAExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link MiniGoParser#cterm}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(MiniGoParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link MiniGoParser#cterm}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(MiniGoParser.GreaterThanContext ctx);
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
	 * Enter a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(MiniGoParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link MiniGoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(MiniGoParser.ParenthesesContext ctx);
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