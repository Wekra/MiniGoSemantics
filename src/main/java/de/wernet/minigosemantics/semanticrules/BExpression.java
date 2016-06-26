package de.wernet.minigosemantics.semanticrules;

import java.util.AbstractMap;
import java.util.List;

/**
 * Created by Christian on 15.06.2016.
 */
public class BExpression extends Statement {

    private CExpression left;
    private List<CExpression> right;

    public BExpression(){



    }

    @Override
    AbstractMap.SimpleImmutableEntry<MyState, List<Statement>> reduce(MyState myState, List<Statement> statements) {
        return null;
    }
}
