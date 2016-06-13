package de.wernet.minigosemantics.antlr;

/**
 * Created by Christian on 13.06.2016.
 */
public class Main {

    public void main(String []args){
        System.out.println("Start parsing the file:");

        MyMiniGoListener listener = new MyMiniGoListener();

        listener.printFile();
    }
}
