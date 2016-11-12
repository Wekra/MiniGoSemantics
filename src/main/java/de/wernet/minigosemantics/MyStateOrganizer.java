package de.wernet.minigosemantics;

import java.util.Stack;

/**
 * Created by Christian on 12.11.2016.
 */
public class MyStateOrganizer {
    private Stack<MyState> stateStack;

    public MyStateOrganizer(){
        stateStack = new Stack<>();
    }

    public void pushState(MyState state){
        stateStack.push(state);
    }

    public MyState popState(){
        return stateStack.pop();
    }
}
