package com.gagnechris.linkedlists;

import static org.junit.Assert.*;
import org.junit.Test;

public class SinglyNodeTest {
  @Test
  public void testCreatingSinglyNode() throws Exception {
    SinglyNode head = new SinglyNode(0);
    assertEquals("node has proper data", head.data, 0);
    assertEquals("node has no next", head.next, null);
  }

  @Test
  public void testAppendingToTail() throws Exception {
    SinglyNode head = createLinkedList(2);
    SinglyNode node2 = head.next;
    SinglyNode node3 = node2.next;
    assertEquals("First node has data", head.data, 0);
    assertEquals("Second node has data", node2.data, 1);
    assertEquals("Third node has data", node3.data, 2);
    assertEquals("Thrid node has no next", node3.next, null);
  }

  @Test
  public void testDeleteMiddleNode() throws Exception {
    SinglyNode head = createLinkedList(3);
    head = SinglyNode.deleteNode(head, 2);
    assertEquals("First node has data", head.data, 0);
    assertEquals("Second node has data", head.next.data, 1);
    assertEquals("Third node has data", head.next.next.data, 3);
    assertEquals("Third node has no next", head.next.next.next, null);
  }

  @Test
  public void testDeleteFirstNode() throws Exception {
    SinglyNode head = createLinkedList(3);
    head = SinglyNode.deleteNode(head, 0);
    assertEquals("First node has data", head.data, 1);
    assertEquals("Second node has data", head.next.data, 2);
    assertEquals("Third node has data", head.next.next.data, 3);
    assertEquals("Third node has no next", head.next.next.next, null);
  }

  @Test
  public void testDeleteLastNode() throws Exception {
    SinglyNode head = createLinkedList(3);
    head = SinglyNode.deleteNode(head, 3);
    assertEquals("First node has data", head.data, 0);
    assertEquals("Second node has data", head.next.data, 1);
    assertEquals("Third node has data", head.next.next.data, 2);
    assertEquals("Third node has no next", head.next.next.next, null);
  }

  @Test
  public void testDeleteDuplicates() throws Exception {
    SinglyNode head = createLinkedList(3);
    head.appendToTail(2);
    SinglyNode.deleteDuplicates(head);

    SinglyNode n = head;
    int twoNodeCount = 0;
    while (n.next != null) {
      if (n.data == 2) twoNodeCount++;
      n = n.next;
    }
    assertEquals("There should only be a single two (2) node", twoNodeCount, 1);
  }

  private SinglyNode createLinkedList(int size) {
    SinglyNode head = new SinglyNode(0);

    for(int i = 1; i <= size; i++) {
      head.appendToTail(i);
    }
    return head;
  }
}
