package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * This class is used as a stack to hold entries of type String.
 *
 * @author zjac249
 */

public class StrStack {

  private final RhulStack myStack;
  private ArrayList<Entry> arrayList = new ArrayList<Entry>();

  /**
   * constructor for a RhulStack.
   */
  public StrStack() {
    this.myStack = new RhulStack();
  }

  /**
   * adds entry to the stack of type String.
   */

  public void push(final String string) {
    this.myStack.push(new Entry(string));
    arrayList.add(new Entry(string));

  }

  /**
   * checks if the stack is empty or not by checking the size of the stack.
   */
  public final boolean isEmpty() {
    return this.myStack.size() == 0;
  }

  /** .
   * the pop function returns the entry at the top of the stack of type String when pop is called.
   * 
   *
   * @throws EmptyStackException is thrown when the stack is empty and we try to pop.
   */

  public String pop() throws EmptyStackException {
    try {
      return this.myStack.pop().getString();
    } catch (BadTypeException e) {
      return null;
    }


  }


}
