package de.wernet.minigosemantics.semanticrules;

import java.util.AbstractMap;
import java.util.List;

/**
 * Created by Christian on 15.06.2016.
 */
public class ITE extends Statement {

    private BExpression b;
    private Statement then;
    private Statement _else;

    public ITE(BExpression _b, Statement _then, Statement _else){
        this.b = _b;
        this.then = _then;
        this._else = _else;
    }


    @Override
    AbstractMap.SimpleImmutableEntry<State, List<Statement>> reduce(State state, List<Statement> statements) {
        return null;
    }
}
