package uk.ac.rhul.cs2800;

/**
 * this class is used to create a custom exception.
 *
 * @author zjac249
 *
 */

public class InvalidExpressionException extends Exception {

  /**
   * used to create exception.
   */

  private static final long serialVersionUID = 4751580932899941450L;

  /**
   * creating a constructor for the BadTypeException.
   *
   * @param message is the error message output.
   */

  public InvalidExpressionException(String message) {
    super(message);
  }

}
