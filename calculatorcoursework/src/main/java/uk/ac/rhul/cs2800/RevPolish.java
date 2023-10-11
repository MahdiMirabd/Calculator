package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;
import java.util.Scanner;

/**
 * This class is used to create the reverse Polish of the calculator functionality.
 *
 * @author zjac249
 */

public class RevPolish implements CalculatorInterface {

  private String what;
  private NumStack newStack = new NumStack(); // creating a NumStack.


  /**
   * overriding evaluate method taking a String.
   *
   * @throws InvalidExpressionException when wrong expression is used.
   * @throws EmptyStackException when the stack is Empty.
   */

  @Override
  public float evaluate(String what) throws InvalidExpressionException, EmptyStackException {
    this.what = what;
    float x = 3;
    float y = 6;

    if ((this.what.equals("") || (this.what == null))) {
      return 0;
    }


    Scanner sc = new Scanner(this.what); // created a scanner to get input.

    while (sc.hasNext()) {
      String next = sc.next();
      // switch statement to have a separate case for each symbol we can use.
      switch (next) {
        // testing addition symbol.
        case "+":
          x = newStack.pop();
          y = newStack.pop();
          this.newStack.push(x + y);
          break;

        // testing minus symbol.

        case "-":
          x = newStack.pop();
          y = newStack.pop();
          this.newStack.push(y - x);
          break;


        // testing times symbol.
        case "*":
          x = newStack.pop();
          y = newStack.pop();
          this.newStack.push(x * y);
          break;

        // testing divide symbol.
        case "/":
          x = newStack.pop();
          y = newStack.pop();
          this.newStack.push(y / x);
          break;

        
        default:
          try {
            this.newStack.push(Float.parseFloat(next));
            // parseFloat used to convert string to float and allow pushing.
          } catch (NumberFormatException e) {
            e.printStackTrace();
           

          }
      }
    }
    sc.close(); // close scanner, or could lead to error.

    return newStack.pop(); // pop the top of the stack and return it.



  }


}


