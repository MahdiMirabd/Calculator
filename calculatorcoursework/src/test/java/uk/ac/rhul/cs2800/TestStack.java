package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStack {

  private RhulStack rs;
  private Entry entry1;

  @BeforeEach
  void setUp() {
    rs = new RhulStack();
    entry1 = new Entry(1.6f);

  }

  @Test // 1
  void testSize() {
    assertEquals(rs.size(), 0, "size must be zero as we are not pushing anything");
  }

  @Test // 2
  void testPush() {
    rs.push(entry1);
    assertEquals(rs.size(), 1, "size must be one as we are pushing 1");
  }

  @Test // 3
  void testPop() {
    rs.push(entry1);
    assertEquals(rs.pop(), entry1, "pop must return entry 1 as this is the top of stack");
  }

  @Test // 4
  void testEmptyPop() {
    assertThrows(EmptyStackException.class, () -> rs.pop(), "error given as stack is empty.");
  }


  @Test // 5
  void testPushTwoPopThree() {
    Entry test1 = new Entry(1.5f);
    Entry test2 = new Entry(3.5f);
    rs.push(test1);
    assertEquals(rs.size(), 1, "size is one as one is pushed.");
    rs.push(test2);
    assertEquals(rs.size(), 2, "size must be two as two is pushed.");
    assertEquals(rs.pop(), test2, "must return test2 as we pop the top of the stack.");
    assertEquals(rs.pop(), test1, "must return test1 as we pop the top of the stack.");
    assertThrows(EmptyStackException.class, () -> rs.pop(), "test caught if the stack is empty.");
  }


  @Test // 6
  void pushLots() {
    for (int i = 0; i < 1000; i++) {
      rs.push(new Entry((float) i));
    }
    assertEquals(rs.size(), 1000, "must be 1000 as we have pushed i which has a range i<1000.");
    assertEquals(rs.pop().getValue(), 999.0f, "Must pop 999 which is maximum after loop is done.");
  }


  @Test // 7
  void testTop() {
    rs.push(new Entry("Hello"));
    assertEquals(rs.pop().getString(), "Hello", "Must return Hello as Hello is pushed ");

  }



  @Test // 8
  void pushTop() {
    Entry entryfloat = new Entry(12.3f);
    Entry entryfloat2 = new Entry(13.2f);
    rs.push(entryfloat2);
    rs.push(entryfloat);
    assertEquals(rs.top(), entryfloat, "entryfloat should be at the top of the stack .");
    assertEquals(rs.size(), 2, "entryfloat and entryfloat 2 pushed so size is 2.");

  }

}

