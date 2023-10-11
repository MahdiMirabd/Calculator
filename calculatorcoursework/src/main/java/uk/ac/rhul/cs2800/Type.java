package uk.ac.rhul.cs2800;

/**
 * Enumerator of Types that show and tell us whether entry is of what type.
 *
 * @author zjac249
 *
 */

public enum Type {
  NUMBER("Number"), STRING("String"), SYMBOL("Symbol"), INVALID("Error");

  private String type;

  /**
   * Constructor for enumerator Type.
   *
   * @param string type assigned to enumerator.
   */

  Type(String type) {
    this.type = type;
  }


  /**
   * Returns String representation of Type.
   */
  @Override
  public String toString() {
    return this.type;
  }
}
