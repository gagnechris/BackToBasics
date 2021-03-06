package com.gagnechris.linkedlists;

import java.util.ArrayList;


public class SinglyNode {
  SinglyNode next = null;
  Object data;

  public SinglyNode(Object d) {
    data = d;
  }

  public SinglyNode getNext() {
    return next;
  }

  public void setNext(SinglyNode node) {
    next = node;
  }

  public Object getData() {
    return data;
  }

  public void appendToTail(Object d) {
    SinglyNode end = new SinglyNode(d);
    SinglyNode n = this;
    while (n.next != null) {
      n = n.next;
    }
    n.next = end;
  }

  public static SinglyNode deleteNode(SinglyNode head, Object d) {
    SinglyNode n = head;

    if (n.data == d) {
      return head.next;
    }

    while (n.next != null) {
      if (n.next.data == d) {
        n.next = n.next.next;
        return head;
      }
      n = n.next;
    }

    return head;
  }

  public static void deleteDuplicates(SinglyNode head) {
    ArrayList data = new ArrayList();
    SinglyNode n = head;

    while (n.next != null) {
      if (data.contains(n.data)) {
        n.next = n.next.next;
      } else {
        data.add(n.data);
      }
      n = n.next;
    }
  }
}
