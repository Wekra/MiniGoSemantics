package de.wernet.minigosemantics;

import de.wernet.minigosemantics.antlr.MiniGoLexer;
import de.wernet.minigosemantics.antlr.MiniGoParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * The Main-class marks the entry point of the application.
 * Created by Christian on 13.06.2016.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Start parsing file \"" + args[0] + "\". . .");

        try {
            ANTLRFileStream reader = new ANTLRFileStream(args[0]);
            MiniGoLexer lexer = new MiniGoLexer(reader);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiniGoParser parser = new MiniGoParser(tokens);
            ParseTree tree = parser.prog();

            MyState myState = MyState.getInstance();

            MyMiniGoVisitor visitor = new MyMiniGoVisitor(myState);
            visitor.visit(tree);
            System.out.println("\n\nFile accepted!\n");
            HashMap<String, Integer> integerVariables = myState.getIntegerVariables();
            Set<String> keys = integerVariables.keySet();
            System.out.println("\nInteger-Variables with final values:");
            for (String s : keys) {
                System.out.println("Variable " + s + " = " + integerVariables.get(s));
            }
            HashMap<String, Boolean> booleanVariables = myState.getBooleanVariables();
            keys = booleanVariables.keySet();
            System.out.println("\nBoolean-Variables with final values:");
            for (String s : keys) {
                System.out.println("Variable " + s + " = " + booleanVariables.get(s));
            }
            List<String> channels = myState.getChannels();
            System.out.println("\nChannels:");
            channels.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("File not readable.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}