package uk.ac.rhul.cs2800;

/**
 * this class is used to create a custom exception.
 *
 * @author zjac249
 *
 */


public class BadTypeException extends RuntimeException {
  /**
   * used to create exception.
   */

  private static final long serialVersionUID = 1L;

  /**
   * creating a constructor for the BadTypeException.
   *
   * @param error is the error message output.
   */
  public BadTypeException(String error) {
    super(error);
  }

}


