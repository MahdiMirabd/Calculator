package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * test class for NumStack.
 */


class TestNumStack {
  private NumStack ns;
  private float float1 = 5.5f;

  @BeforeEach
  void setUp() {
    ns = new NumStack();


  }

  /**
   * testing the constructor to make sure it is working.
   */

  @Test
  void testNumStackConstructor() {
    NumStack numstack = new NumStack();
    assertNotNull(numstack);
  }

  /**
   * testing the size method when we have no push.
   */


  @Test // 2
  void testSize() {
    assertEquals(ns.size(), 0, "size should be 0 as we have pushed nothing.");
  }

  /**
   * tests push method of NumStack
   */


  @Test // 3
  void testNumPush() {
    ns.push(float1);
    assertEquals(ns.size(), 1, "size should now be 1 as we have pushed 1.");
  }

  /**
   * tests the pop method used in NumStack.
   */


  @Test // 4
  void testPopNumStack() {
    ns.push(float1);
    assertEquals(ns.pop(), float1, "should pop 1 float as stack contains float1.");
  }

  /**
   * testing to see if when stack is Empty, we are given boolean false, and if it is not then true.
   */

  @Test // 5
  void testIsEmpty() {
    ns.push(float1);
    assertFalse(ns.isEmpty(),
        "Testing to see if isEmpty works after pushing a float to the NumStack.");
  }


}
