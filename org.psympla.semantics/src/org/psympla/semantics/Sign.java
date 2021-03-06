package org.psympla.semantics;

import org.psympla.symbol.Symbol;

/**
 * A sign represents a class of lexical elements which can be assigned a
 * meaning.
 * <p>
 * Not all symbols need to be signified. For example delimiter terminals or
 * logical non-terminals such as aggregators with no useful state of their own.
 * 
 * @author Elias N Vasylenko
 *
 * @param <T>
 */
public class Sign<T> {
  private final Symbol name;

  public Sign(Symbol name) {
    this.name = name;
  }

  public Sign(String namespace, String id) {
    this.name = new Symbol(namespace, id);
  }

  public Symbol name() {
    return name;
  }
}
