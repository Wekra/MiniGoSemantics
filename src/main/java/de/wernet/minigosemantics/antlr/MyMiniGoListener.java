package de.wernet.minigosemantics.antlr;

import de.wernet.miniGoSemantics.antlr.MiniGoBaseListener;
import de.wernet.miniGoSemantics.antlr.MiniGoLexer;
import de.wernet.miniGoSemantics.antlr.MiniGoParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

/**
 * Created by Christian on 13.06.2016.
 */
public class MyMiniGoListener extends MiniGoBaseListener {

    @Override
    public void enterProg(MiniGoParser.ProgContext ctx){
        System.out.println(ctx.getText());
    }

    protected void printFile(){
        try {
            MiniGoLexer lexer = new MiniGoLexer(new ANTLRFileStream("Beispiel.txt"));

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            MiniGoParser parser = new MiniGoParser(tokens);

            MiniGoParser.ProgContext progContext  = parser.prog();

            ParseTreeWalker walker  = new ParseTreeWalker();
            MyMiniGoListener listener = new MyMiniGoListener();
            walker.walk(listener, progContext);

        } catch (IOException ex){
            System.out.println("Unable to read file.");
        }


    }

}
