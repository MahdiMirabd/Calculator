package uk.ac.rhul.cs2800;

/**
 * Enumerators of Symbols used as operations on a calculator.
 *
 * @author zjac249
 *
 */
public enum Symbol {
  LEFT_BRACKET("("), RIGHT_BRACKET(")"), TIMES("*"), DIVIDE("/"), PLUS("+"), MINUS("-"), INVALID(
      "Error");

  private String symbol;

  /**
   * Constructor for enumerator Symbol.
   *
   * @param string symbol assigned to enumerator
   */

  Symbol(String symbol) {
    this.symbol = symbol;
  }


  /**
   * Returns the string symbol.
   */
  @Override
  public String toString() {
    return this.symbol;
  }



}
