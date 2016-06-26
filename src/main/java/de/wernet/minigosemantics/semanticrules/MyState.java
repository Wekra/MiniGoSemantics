package de.wernet.minigosemantics.semanticrules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class represents a state in the semantic rule check of the MiniGo-grammar. It holds all variables used in a MiniGo-program.
 * Created by Christian on 15.06.2016.
 */
public class MyState {

    private final HashMap<String, Integer> integerVariables;
    private final HashMap<String, Boolean> booleanVariables;
    private final List<String> channels;

    private static final MyState instance = new MyState();

    private MyState() {
        integerVariables = new HashMap<>();
        booleanVariables = new HashMap<>();
        channels = new ArrayList<>();
    }

    public static MyState getInstance() {
        return instance;
    }

    public HashMap<String, Integer> getIntegerVariables() {
        return integerVariables;
    }

    public void addIntegerVariable(String variableName, int value) {
        integerVariables.put(variableName, value);
    }

    public int getIntegerVariable(String name) {
        return integerVariables.get(name);
    }

    public HashMap<String, Boolean> getBooleanVariables() {
        return booleanVariables;
    }

    public void addBooleanVariable(String variableName, boolean value) {
        booleanVariables.put(variableName, value);
    }

    public boolean getBooleanVariable(String name) {
        return booleanVariables.get(name);
    }

    public List<String> getChannels() {
        return channels;
    }

    public void addChannel(String variableName) {
        if (!channels.contains(variableName)) {
            channels.add(variableName);
        }
    }

    public boolean isChannelDeclared(String variableName) {
        return channels.contains(variableName);
    }
}

