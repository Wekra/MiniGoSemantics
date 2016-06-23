package de.wernet.minigosemantics.semanticrules;

/**
 * Created by Christian on 15.06.2016.
 */
public class Variable {

    private String name;
    private String value;

    public Variable(String name, String value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\tValue: " + value;
    }
}
