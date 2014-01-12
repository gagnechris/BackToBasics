package com.gagnechris.stacksandqueues;

import com.gagnechris.linkedlists.*;


public class Queue {
  SinglyNode first, last;

  public void enqueue(Object item) {
    if (first == null) {
      last = new SinglyNode(item);
      first = last;
    } else {
      last.setNext(new SinglyNode(item));
      last = last.getNext();
    }
  }

  public Object dequeue() {
    if (first != null) {
      Object item = first.getData();
      first = first.getNext();
      return item;
    }
    return null;
  }
}