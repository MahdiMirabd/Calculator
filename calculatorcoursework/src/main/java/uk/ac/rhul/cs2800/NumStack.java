package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * This class is used as a stack to hold entries of type NumStack.
 *
 * @author zjac249
 */

public class NumStack {
  private RhulStack myStack;
  private ArrayList<Entry> arrayList = new ArrayList<Entry>();

  /**
   * creating a RhulStack.
   */
  public NumStack() {
    this.myStack = new RhulStack();

  }

  /**
   * Returns the size of the stack.
   */
  public int size() {
    return arrayList.size();
  }

  /**
   * adds entry to the stack.
   */
  public final void push(final float i) {
    this.myStack.push(new Entry(i));
    arrayList.add(new Entry(i));
  }

  /**
   * the pop function returns the value of entry at the top of the stack when pop is called.
   * 
   *
   * @throws EmptyStackException is thrown when the stack is empty and we try to pop.
   */
  public final float pop() throws EmptyStackException {
    try {
      return this.myStack.pop().getValue();

    } catch (final BadTypeException e) {
      return Float.POSITIVE_INFINITY; // a constant holding positive infinity from oracle.
    }
  }

  /**
   * checks if the stack is empty or not by checking the size of the stack.
   */
  public final boolean isEmpty() {
    return this.myStack.size() == 0;
  }

}


