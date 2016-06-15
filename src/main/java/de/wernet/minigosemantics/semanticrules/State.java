package de.wernet.minigosemantics.semanticrules;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Christian on 15.06.2016.
 */
public class State {

    private HashMap<String, Variable> variables;

    private final State instance = new State();

    private State(){}

    public State getInstance(){
        return instance;
    }

    public HashMap<String, Variable> getVariables() {
        return variables;
    }

    public void addVariable(String variableName, Variable variable){
        variables.put(variableName, variable);
    }

//    public void getVariable(String name){
//        variables.in
//    }
}

