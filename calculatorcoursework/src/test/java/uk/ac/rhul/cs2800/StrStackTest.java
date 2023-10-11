package uk.ac.rhul.cs2800;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for StrStack.
 */



class StrStackTest {
  private StrStack ss; // created a variable of type StrStack.
  private String hello; // created a string hello to pass through when writing tests.

  @BeforeEach
  void setUp() {
    ss = new StrStack();
  }
  
  /**
   * test for constructor to make sure constructor is working smoothly.
   */

  @Test // 1
  void testStrStackConstructor() {
    StrStack strstack = new StrStack();
    assertNotNull(strstack);
  }
  
  /**
   * test for push method to see if pushing adds to the stack or keeps it empty.
   */


  @Test // 2
  void testStrStackPush() {
    ss.push(hello);
    assertEquals(ss.isEmpty(), false, "Should return false.");
  }
  
  /**
   * testing the pop method after pushing to see if it returns the most recent push.
   */


  @Test // 3
  void testStrStackPop() {
    ss.push(hello);
    assertEquals(ss.pop(), hello, "Should pop string hello");
  }
  
  /**
   * testing to see if isEmpty works when pushing a string.
   */


  @Test // 4
  void testIsEmpty() {
    ss.push(hello);
    assertFalse(ss.isEmpty(), "pushing a string hello and checking if the StrStack is empty.");
  }

}


