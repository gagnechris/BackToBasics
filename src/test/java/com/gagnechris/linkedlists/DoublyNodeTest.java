package com.gagnechris.linkedlists;

import static org.junit.Assert.*;
import org.junit.Test;

public class DoublyNodeTest {
  @Test
  public void testCreatingDoublyNode() throws Exception {
    DoublyNode head = new DoublyNode(0);
    assertEquals("node has proper data", head.data, 0);
    assertEquals("node has no next", head.next, null);
    assertEquals("node has no previous", head.previous, null);
  }

  @Test
  public void testAppendingToTail() throws Exception {
    DoublyNode head = createLinkedList(2);
    DoublyNode node2 = head.next;
    DoublyNode node3 = node2.next;
    assertEquals("First node has data", head.data, 0);
    assertEquals("Second node has data", node2.data, 1);
    assertEquals("Third node has data", node3.data, 2);
    assertEquals("Third node has no next", node3.next, null);
    assertEquals("Third node has Second node as previous", node3.previous, node2);
  }

  @Test
  public void testDeleteMiddleNode() throws Exception {
    DoublyNode head = createLinkedList(3);
    head = DoublyNode.deleteNode(head, 2);
    assertEquals("First node has data", head.data, 0);
    assertEquals("Second node has data", head.next.data, 1);
    assertEquals("Third node has data", head.next.next.data, 3);
    assertEquals("Third node has no next", head.next.next.next, null);
    assertEquals("Third node has Node One as previous", head.next.next.previous.data, 1);
  }

  @Test
  public void testDeleteFirstNode() throws Exception {
    DoublyNode head = createLinkedList(3);
    head = DoublyNode.deleteNode(head, 0);
    assertEquals("First node has data", head.data, 1);
    assertEquals("First node has no previous", head.previous, null);
    assertEquals("Second node has data", head.next.data, 2);
    assertEquals("Third node has data", head.next.next.data, 3);
    assertEquals("Third node has no next", head.next.next.next, null);
    assertEquals("Thrid node has Node Two as previous", head.next.next.previous.data, 2);
  }

  @Test
  public void testDeleteLastNode() throws Exception {
    DoublyNode head = createLinkedList(3);
    head = DoublyNode.deleteNode(head, 3);
    assertEquals("First node has data", head.data, 0);
    assertEquals("Second node has data", head.next.data, 1);
    assertEquals("Third node has data", head.next.next.data, 2);
    assertEquals("Third node has no next", head.next.next.next, null);
    assertEquals("Third node has Node One as previous", head.next.next.previous.data, 1);
  }

  @Test
  public void testDeleteDuplicates() throws Exception {
    DoublyNode head = createLinkedList(3);
    head.appendToTail(2);
    DoublyNode.deleteDuplicates(head);

    DoublyNode n = head;
    int twoNodeCount = 0;
    while (n.next != null) {
      if (n.data == 2) twoNodeCount++;
      n = n.next;
    }
    assertEquals("There should only be a single two (2) node", twoNodeCount, 1);
  }

  private DoublyNode createLinkedList(int size) {
    DoublyNode head = new DoublyNode(0);

    for(int i = 1; i <= size; i++) {
      head.appendToTail(i);
    }
    return head;
  }
}
