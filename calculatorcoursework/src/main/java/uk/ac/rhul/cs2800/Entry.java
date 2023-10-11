package uk.ac.rhul.cs2800;

import java.util.Objects;


/**
 * This class is a container class used to store the values of different types.
 *
 * @author zjac249
 *
 */
public class Entry {
  private float number;
  private String str;
  private Symbol other;
  private Type type;

  /**
   * Constructor that needs a float type.
   *
   * @param number to be added as a float.
   */
  public Entry(float number) {
    this.number = number;
    this.type = Type.NUMBER;
  }


  /**
   * Constructor that needs a String type.
   *
   * @param str String value to store a string.
   */
  public Entry(String str) {
    this.str = str;
    this.type = Type.STRING;
  }

  /**
   * Constructor that needs a Symbol type.
   *
   * @param which is the Enumerator symbol used to store a symbol.
   */
  public Entry(Symbol which) {
    this.other = which;
    this.type = Type.SYMBOL;
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, other, str, type);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Entry other = (Entry) obj;
    return Float.floatToIntBits(number) == Float.floatToIntBits(other.number)
        && this.other == other.other && Objects.equals(str, other.str) && type == other.type;
  }



  /**
   * Returns value of Type.
   */
  public float getValue() throws BadTypeException {
    if (type != Type.NUMBER) {
      throw new BadTypeException("error: number not found.");
    } else {
      return this.number;
    }
  }


  /**
   * Returns the value of String str.
   */
  public String getString() throws BadTypeException {
    if (type != Type.STRING) {
      throw new BadTypeException("error: String not found.");
    } else {
      return this.str;
    }
  }


  /**
   * Returns the value of symbol other.
   */
  public Symbol getSymbol() throws BadTypeException {
    if (type != Type.SYMBOL) {
      throw new BadTypeException("error: Symbol not found.");
    } else {
      return this.other;
    }
  }

  /**
   * Returns value of Type type.
   */
  public Type getType() {
    return this.type;
  }



}
