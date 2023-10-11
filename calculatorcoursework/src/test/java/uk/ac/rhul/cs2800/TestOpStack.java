package uk.ac.rhul.cs2800;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * test class for OpStack.
 */


class TestOpStack {
  private OpStack os;
  private Symbol minus;

  @BeforeEach
  void setUp() {
    os = new OpStack(minus);
  }

  /**
   * testing the constructor for OpStack.
   */

  @Test // 1
  void TestOpStackConstructor() {
    OpStack opstack = new OpStack(minus);
    assertNotNull(opstack);
  }

  /**
   * testing pushing a Symbol to the OpStack.
   */


  @Test // 2

  void testPushOpStack() {
    os.push(minus);
    assertEquals(os.isEmpty(), false, "should return false.");
  }

  /**
   * testing the pop method for OpStack to see if pushing then popping returns top of stack.
   */


  @Test // 3
  void testOpStackPop() {
    os.push(minus);
    assertEquals(os.pop(), minus, "should pop the symbol MINUS");
  }

  /**
   * testing to see if when stack is Empty, we are given boolean false, and if it is not then true.
   */


  @Test // 4
  void testIsEmpty() {
    os.push(minus);
    assertFalse(os.isEmpty(), " testing is empty.");
  }



}


