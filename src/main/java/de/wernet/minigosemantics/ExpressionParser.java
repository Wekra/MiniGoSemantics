package de.wernet.minigosemantics;

import de.wernet.minigosemantics.antlr.MiniGoParser;
import de.wernet.minigosemantics.antlr.MiniGoLexer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * Created by Christian on 13.06.2016.
 */
public class ExpressionParser {

    /**
     * Parses an expression into an integer result.
     *
     * @param expression the expression to part
     * @return and integer result
     */
    public int parse(final String expression) {
        /*
         * Create a lexer that reads from our expression string
         */
        try {
            final MiniGoLexer lexer = new MiniGoLexer(new ANTLRFileStream(expression));


        /*
         * The lexer reads characters and lexes them into token stream. The
         * tokens are consumed by the parser that then builds an Abstract
         * Syntax Tree.
         */
            final CommonTokenStream tokens = new CommonTokenStream(lexer);
            final MiniGoParser parser = new MiniGoParser(tokens);

        /*
         * The ExprContext is the root of our Abstract Syntax Tree
         */
            final MiniGoParser.ProgContext context = parser.prog();

        /*
         * 'Visit' all the branches of the tree to get our expression result.
         */
            return visit(context);
        }catch(IOException e){
            System.out.println("boing");
            return 0;
        }
    }

    /*
     * Visits the branches in the expression tree recursively until we hit a
     * leaf.
     */
//    private int visit(final MiniGoParser.ProgContext context) {
//        MiniGoParser.BlockContext blockContext = context.block();
//        MiniGoParser.StatementContext statementContext = blockContext.statement();
//        if (statementContext. != null) { //Just a number
//            return Integer.parseInt(context.number().getText());
//        } else if (context.BR_CLOSE() != null) { //Expression between brackets
//            return visit(context.expr(0));
//        } else if (context.TIMES() != null) { //Expression * expression
//            return visit(context.expr(0)) * visit(context.expr(1));
//        } else if (context.DIV() != null) { //Expression / expression
//            return visit(context.expr(0)) / visit(context.expr(1));
//        } else if (context.PLUS() != null) { //Expression + expression
//            return visit(context.expr(0)) + visit(context.expr(1));
//        } else if (context.MINUS() != null) { //Expression - expression
//            return visit(context.expr(0)) - visit(context.expr(1));
//        } else {
//            throw new IllegalStateException();
//        }
//    }

    private int visit(MiniGoParser.ProgContext context){
        System.out.println(context.block().statement().getRuleContext().toStringTree());
        return 1;
    }

}
