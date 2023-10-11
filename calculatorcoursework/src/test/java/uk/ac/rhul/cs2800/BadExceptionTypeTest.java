package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * this class is for testing the custom exception.
 *
 * @author zjac249
 *
 */
public class BadExceptionTypeTest {

  @Test // 1
  void testBadExceptionTypeTestValue() {
    Entry floatentry = new Entry(7.5f);
    assertThrows(BadTypeException.class, () -> floatentry.getString(),
        "test to see if BadTypeException thrown when getting a string when dealing with float.");
    assertThrows(BadTypeException.class, () -> floatentry.getSymbol(),
        "test to see if BadTypeException thrown when getting a Symbol when dealing with float.");

  }

  @Test // 2
  void testBadExceptionTypeString() {
    Entry stringentry = new Entry("Hello");
    assertThrows(BadTypeException.class, () -> stringentry.getSymbol(),
        "testto see if BadTypeException thrown when getting a Symbol and dealing with string.");
    assertThrows(BadTypeException.class, () -> stringentry.getValue(),
        "test to see if BadTypeException thrown when getting a value and dealing with string.");

  }


  @Test // 3
  void testBadExceptionTypeSymbol() {
    Entry symbolentry = new Entry(Symbol.PLUS);
    assertThrows(BadTypeException.class, () -> symbolentry.getString(),
        "test to see if BadTypeException thrown when getting a String and dealing with Symbol.");
    assertThrows(BadTypeException.class, () -> symbolentry.getValue(),
        "test to see if BadTypeException thrown when getting a value and dealing with Smybol.");
  }


}
