package de.wernet.minigosemantics.semanticrules;

import java.util.HashMap;

/**
 * Created by Christian on 15.06.2016.
 */
public class State {

    private HashMap<String, Variable> variables;

    private static final State instance = new State();

    private State(){
        variables = new HashMap<String, Variable>();
    }

    public static State getInstance(){
        return instance;
    }

    public HashMap<String, Variable> getVariables() {
        return variables;
    }

    public void addVariable(String variableName, Variable variable){
        variables.put(variableName, variable);
    }

    public Variable getVariable(String name){
        return variables.get(name);
    }
}

