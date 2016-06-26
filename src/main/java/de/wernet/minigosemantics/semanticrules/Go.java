package de.wernet.minigosemantics.semanticrules;

import java.util.AbstractMap;
import java.util.List;

/**
 * Created by Christian on 15.06.2016.
 */
public class Go extends Statement {

    private Statement t;

    public Go(Statement _t){
        this.t = _t;
    }

    @Override
    AbstractMap.SimpleImmutableEntry<MyState, List<Statement>> reduce(MyState myState, List<Statement> statements) {
        return null;
    }
}