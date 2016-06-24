package de.wernet.minigosemantics.semanticrules;

import java.util.HashMap;

/**
 * Created by Christian on 15.06.2016.
 */
public class State {

    private HashMap<String, Integer> integerVariables;
    private HashMap<String, Boolean> booleanVariables;

    private static final State instance = new State();

    private State(){
        integerVariables = new HashMap<String, Integer>();
        booleanVariables = new HashMap<String, Boolean>();
    }

    public static State getInstance(){
        return instance;
    }

    public HashMap<String, Integer> getIntegerVariables() {
        return integerVariables;
    }

    public void addIntegerVariable(String variableName, int value){
        integerVariables.put(variableName, value);
    }

    public int getIntegerVariable(String name){
        return integerVariables.get(name);
    }

    public HashMap<String, Boolean> getBooleanVariables() {return booleanVariables;}

    public void addBooleanVariable(String variableName, boolean value) { booleanVariables.put(variableName, value); }

    public boolean getBooleanVariable(String name) {return booleanVariables.get(name);}
}

