package de.wernet.minigosemantics.semanticrules;

import java.util.AbstractMap;
import java.util.List;

/**
 * Created by Christian on 15.06.2016.
 */
public abstract class Statement {

    abstract AbstractMap.SimpleImmutableEntry<MyState, List<Statement>> reduce(MyState myState, List<Statement> statements);

}
