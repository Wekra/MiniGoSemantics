package de.wernet.minigosemantics;

import de.wernet.minigosemantics.antlr.MiniGoBaseListener;
import de.wernet.minigosemantics.antlr.MiniGoLexer;
import de.wernet.minigosemantics.antlr.MiniGoParser;
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

    protected void printFile(String pathToFile){
        try {

            ANTLRFileStream file = new ANTLRFileStream(pathToFile);

            MiniGoLexer lexer = new MiniGoLexer(file);

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
