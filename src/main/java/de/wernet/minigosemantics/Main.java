package de.wernet.minigosemantics;

/**
 * Created by Christian on 13.06.2016.
 */
public class Main {

    public static void main(String []args){
        System.out.println("Start parsing the file:");

        MyMiniGoListener listener = new MyMiniGoListener();

//        System.out.println(args[0]);

        listener.printFile(args[0]);

        System.out.println("Parsing successfully finished.");
    }
}