package de.wernet.minigosemantics;

import de.wernet.minigosemantics.antlr.MiniGoLexer;
import de.wernet.minigosemantics.antlr.MiniGoParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Created by Christian on 13.06.2016.
 */
public class Main {

    public static void main(String []args){
//        System.out.println("Start parsing the file:");
//
//        MyMiniGoListener listener = new MyMiniGoListener();
//
        System.out.println(args[0]);
//
//        listener.printFile(args[0]);
//
//        System.out.println("Parsing successfully finished.");

//        ExpressionParser expressionParser = new ExpressionParser();
//        expressionParser.parse(args[0]);

            // TODO code application logic here
            //SymbolTable table = new SymbolTable();
            try {
                ANTLRFileStream reader = new ANTLRFileStream("E:\\Studium\\IDEA\\MiniGoSemantics\\src\\main\\resources\\Beispiel.txt");
                MiniGoLexer lexer  = new MiniGoLexer((CharStream)reader);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                MiniGoParser parser = new MiniGoParser(tokens);
                ParseTree tree = parser.prog();

                //ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
                //ExtractMicroBaseListener extractor = new ExtractMicroBaseListener(parser);
                //walker.walk(extractor, tree); // initiate walk of tree with listener
                MyMiniGoVisitor visitor = new MyMiniGoVisitor();
                int t = (int) visitor.visit(tree);
                //for(String str : extractor.table.checkDuplicate()){
                //    System.out.println("SHADOW WARNING " + str);
                //}
                //System.out.println(extractor.table.checkDuplicate().toString());
                //System.out.println(extractor.table.toString());
                //System.out.println("Accepted");
            }catch (IOException e) {
                System.out.println("Not Accepted");
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
