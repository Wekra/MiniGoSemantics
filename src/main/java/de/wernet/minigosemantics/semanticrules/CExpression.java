package de.wernet.minigosemantics.semanticrules;

import java.util.AbstractMap;
import java.util.List;

/**
 * Created by Christian on 20.06.2016.
 */
public class CExpression extends Statement {

    private CTerm left;
    private CTerm right;

    @Override
    AbstractMap.SimpleImmutableEntry<State, List<Statement>> reduce(State state, List<Statement> statements) {
        return null;
    }

    public CExpression(CTerm left, CTerm right){

    }

}