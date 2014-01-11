package com.gagnechris.linkedlists;

import java.util.ArrayList;


public class DoublyNode {
  DoublyNode next = null;
  DoublyNode previous = null;
  int data;

  public DoublyNode(int d) {
    data = d;
  }

  public void appendToTail(int d) {
    DoublyNode end = new DoublyNode(d);
    DoublyNode n = this;
    while (n.next != null) {
      n = n.next;
    }
    end.previous = n;
    n.next = end;
  }

  public static DoublyNode deleteNode(DoublyNode head, int d) {
    DoublyNode n = head;

    if (n.data == d) {
      head.next.previous = null;
      return head.next;
    }

    while (n.next != null) {
      if (n.next.data == d) {
        n.next = n.next.next;
        if (n.next != null) n.next.previous = n;
        return head;
      }
      n = n.next;
    }

    return head;
  }

  public static void deleteDuplicates(DoublyNode head) {
    ArrayList data = new ArrayList();
    DoublyNode n = head;

    while (n.next != null) {
      if (data.contains(n.data)) {
        n.next = n.next.next;
        n.next.previous = n;
      } else {
        data.add(n.data);
      }
      n = n.next;
    }
  }
}
