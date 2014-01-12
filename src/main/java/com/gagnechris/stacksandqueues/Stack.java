package com.gagnechris.stacksandqueues;

import com.gagnechris.linkedlists.*;


public class Stack {
  SinglyNode top;

  public Object pop() {
    if (top != null) {
      Object item = top.getData();
      top = top.getNext();
      return item;
    }
    return null;
  }

  public void push(Object item) {
    SinglyNode t = new SinglyNode(item);
    t.setNext(top);
    top = t;
  }

  public Object peek() {
    return top.getData();
  }
}