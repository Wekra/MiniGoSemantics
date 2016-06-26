package de.wernet.minigosemantics.semanticrules;

import java.util.AbstractMap;
import java.util.List;

/**
 * Created by Christian on 15.06.2016.
 */
public class WHILE extends Statement {

    private BExpression bexp;
    private Statement block;

    public WHILE(BExpression _bexp, Statement _block){
        this.bexp = _bexp;
        this.block = _block;
    }

    @Override
    AbstractMap.SimpleImmutableEntry<MyState, List<Statement>> reduce(MyState myState, List<Statement> statements) {
        return null;
    }
}
