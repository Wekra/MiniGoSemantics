package de.wernet.minigosemantics.semanticrules;

import java.util.AbstractMap;
import java.util.List;

/**
 * Created by Christian on 20.06.2016.
 */
public class CTerm extends Statement {

    private AExpression left;
    private AExpression right;

    public CTerm(AExpression left, AExpression right){

    }


    @Override
    AbstractMap.SimpleImmutableEntry<MyState, List<Statement>> reduce(MyState myState, List<Statement> statements) {
        return null;
    }
}
