package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * This class is used as a stack to hold entries containing different types, of values and classes.
 *
 * @author zjac249
 */
public class RhulStack {

  private ArrayList<Entry> arrayList = new ArrayList<Entry>();


  /**
   * Returns the size of the stack.
   */
  public int size() {
    return arrayList.size();
  }

  /**
   * adds entry to the stack.
   */

  public void push(Entry entry) {
    arrayList.add(entry);
  }


  /**
   * the pop function returns the entry at the top of the stack when pop is called.
   * 
   *
   * @throws EmptyStackException is thrown when the stack is empty and we try to pop.
   */
  public Entry pop() {
    if (this.size() == 0) {
      throw new EmptyStackException();
    }

    Entry value = arrayList.get(this.size() - 1);
    arrayList.remove(this.size() - 1);
    return value;
  }

  /**
   * Returns the entry at the top of the stack.
   */
  public Entry top() {
    if (this.size() == 0) {
      throw new EmptyStackException();
    } else {
      return arrayList.get(this.size() - 1);
    }
  }



}
