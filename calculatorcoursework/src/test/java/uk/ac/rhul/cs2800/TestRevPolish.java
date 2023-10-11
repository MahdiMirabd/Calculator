package uk.ac.rhul.cs2800;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * class for testing revPolish.
 *
 */
class TestRevPolish {

  private CalculatorInterface calculator;

  @BeforeEach
  void setUp() {
    this.calculator = new RevPolish(); // initialised calculator from interface to a new revPolish.

  }

  /**
   * test for evaluating an empty string.
   */
  @Test // 1

  void testEmptySize() throws InvalidExpressionException {
    this.calculator.evaluate("");
  }

  /**
   * testing plus symbol for adding two numbers.
   */

  @Test // 2
  void TestSymbolsPlus() throws InvalidExpressionException {
    assertEquals(this.calculator.evaluate("3 4 +"), 7, "testing to see if addition symbol works");
  }

  /**
   * testing minus symbol when subtracting two numbers.
   */

  @Test // 3
  void TestSymbolMinus() throws InvalidExpressionException {
    assertEquals(2, this.calculator.evaluate("3 1 -"), "testing to see if minus symbol works");

  }

  /**
   * testing divide symbol when dividing two numbers.
   */

  @Test // 4

  void testSymbolDivide() throws InvalidExpressionException {
    assertEquals(2, this.calculator.evaluate("6 3 /"), " testing to see if divide symbol works.");
  }

  /**
   * testing times symbol when multiplying two numbers.
   */

  @Test // 5

  void testSymbolTimes() throws InvalidExpressionException {
    assertEquals(3, this.calculator.evaluate("3 1 *"), "Testing to see if times symbol works.");
  }

  /**
   * testing if 0 gives an invalid input as you cannot divide a number by 0.
   */

  @Test // 6

  void testZero() {
    try {
      assertEquals(0.0f, this.calculator.evaluate("0"), 0.0001f, " trying to use 0");
    } catch (InvalidExpressionException e) {
      Assert.fail("0 didnt work as an expression");
    }
  }

  /**
   * testing what would happen if there is no symbol and just numbers.
   */

  @Test // 7

  void testNumberExpressionNoSymbol() throws InvalidExpressionException {
    this.calculator.evaluate("0 0");

  }


}


