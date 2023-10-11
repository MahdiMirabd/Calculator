package uk.ac.rhul.cs2800;



/**
 * this is an interface.
 * 
 * @author zjac249
 *
 */
public interface CalculatorInterface {

  /** evaluate method.
   * @param myString string value for evaluate method.
   * @throws InvalidExpressionException throws when the expression has an incorrect input.
   */
  float evaluate(String myString) throws InvalidExpressionException;



}
