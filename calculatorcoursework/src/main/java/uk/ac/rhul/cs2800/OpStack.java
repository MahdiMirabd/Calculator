package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * This class is used as a stack to hold entries of Symbol.
 *
 * @author zjac249
 */

public class OpStack {
  private RhulStack myStack;
  private ArrayList<Entry> arrayList = new ArrayList<Entry>();

  /** creating a RhulStack that takes parameter minus.
   * @param  minus used to take a Symbol.
   * 
   */

  public OpStack(Symbol minus) {
    this.myStack = new RhulStack();
  }

  /**
   * push method that takes a Symbol and adds the entry to the stack.
   */

  public void push(Symbol minus) {
    this.myStack.push(new Entry(minus));
    arrayList.add(new Entry(minus));


  }

  /**
   * checks if the stack is empty or not by checking the size of the stack.
   */
  public boolean isEmpty() {
    return this.myStack.size() == 0;
  }

  /**
   * the pop function returns the entry at the top of the stack that is symbol when pop is called.
   * 
   *
   * @throws EmptyStackException is thrown when the stack is empty and we try to pop.
   */

  public Symbol pop() throws EmptyStackException {
    try {
      return this.myStack.pop().getSymbol();
    } catch (BadTypeException e) {
      return Symbol.DIVIDE;
    }

  }

}
