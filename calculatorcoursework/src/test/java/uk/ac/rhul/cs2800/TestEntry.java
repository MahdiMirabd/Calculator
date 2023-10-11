package uk.ac.rhul.cs2800;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Tests for Entry.
 *
 * @author zjac249
 *
 */

public class TestEntry {
  private RhulStack rs;


  @Test // 1
  void testValueConstructor() {
    Entry number = new Entry(23.5f);
    assertNotNull(number); // from junit.org assert to show the entry is not null.

  }

  @Test // 2
  void testStringConstrcutor() {
    Entry str = new Entry("Hello");
    assertNotNull(str); // from junit.org assert to show the entry is not null.
  }

  @Test // 3
  void testSymbolConstructor() {
    Entry symbol = new Entry(Symbol.PLUS);
    assertNotNull(symbol); // from junit.org assert to show the entry is not null.
  }

  @Test // 4
  void testGetValue() {
    Entry floatentry = new Entry(2.4f);
    assertThrows(BadTypeException.class, () -> floatentry.getString());
    assertThrows(BadTypeException.class, () -> floatentry.getSymbol());
  }

  @Test // 5
  void testGetString() {
    Entry stringentry = new Entry("Bye");
    assertThrows(BadTypeException.class, () -> stringentry.getSymbol());
    assertThrows(BadTypeException.class, () -> stringentry.getValue());
  }


  @Test // 6
  void testGetSymbol() {
    rs = new RhulStack();
    rs.push(new Entry(Symbol.PLUS));
    assertEquals(rs.pop().getSymbol(), Symbol.PLUS, "Must pop PLUS");
    Entry newentry = new Entry("Hello");
    assertThrows(BadTypeException.class, () -> newentry.getSymbol());
  }

  @Test // 7
  void testEnumTypeSymbol() {
    assertEquals("Symbol", Type.SYMBOL.toString(), "tests the toString method when using Symbol.");
  }

  @Test // 8
  void testEnumTypeNumber() {
    assertEquals("Number", Type.NUMBER.toString(), "tests the toString method when using Number.");

  }

  @Test // 9
  void testEnumTypeString() {
    assertEquals("String", Type.STRING.toString(), "tests the toString method when using String.");
  }

  @Test // 10

  void testEnumTypeInvalid() {
    assertEquals("Error", Type.INVALID.toString(), "Tests toString method when type is invalid.");
  }

  @Test // 11
  void testEnumSymbolLeftBracket() {
    assertEquals("(", Symbol.LEFT_BRACKET.toString(), "Tests toString on Left bracket.");

  }

  @Test // 12
  void testEnumSymbolRightBracket() {
    assertEquals(")", Symbol.RIGHT_BRACKET.toString(), "Test toString on rightbracket.");

  }


  @Test // 13
  void testEnumSymbolTimes() {
    assertEquals("*", Symbol.TIMES.toString(), "Tests toString on Times operation.");

  }

  @Test // 14
  void testEnumSymbolDivide() {
    assertEquals("/", Symbol.DIVIDE.toString(), "Tests toString method on Divide operation.");

  }

  @Test // 15
  void testEnumSymbolPlus() {
    assertEquals("+", Symbol.PLUS.toString(), "Tests toString method on Plus operation.");

  }

  @Test // 16
  void testEnumSymbolMinus() {
    assertEquals("-", Symbol.MINUS.toString(), "Tests toString method on Minus operation.");

  }

  @Test // 17
  void testEnumSymbolInvalid() {
    assertEquals("Error", Symbol.INVALID.toString(), "Tests toString method on Invalid type.");

  }

  @Test // 18
  void testHashCode() {
    Entry entryfloat1 = new Entry(13.3f);
    Entry entryfloat2 = new Entry(13.3f);
    assertEquals(entryfloat1.hashCode(), entryfloat2.hashCode());

  }

  @Test // 19
  void testEqualsMethodFloat() {
    Entry entryfloat1 = new Entry(16.3f);
    Entry entryfloat2 = new Entry(16.3f);
    assertTrue(entryfloat1.equals(entryfloat2), "Tests to see if entries of type float are equal.");

  }

  @Test // 20
  void testNotEqualsFloat() {
    Entry entryfloat1 = new Entry(16.5f);
    Entry entryfloat2 = new Entry(16.9f);
    assertFalse(entryfloat1.equals(entryfloat2), "Tests to see if entries are not equal.");

  }


}


