package de.wernet.minigosemantics.semanticrules;

/**
 * Created by Christian on 15.06.2016.
 */
public class Variable {

    private String name;
    private VariableType type;

    public Variable(String name, VariableType type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VariableType getType() {
        return type;
    }

    public void setType(VariableType type) {
        this.type = type;
    }
}
