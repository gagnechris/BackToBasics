package com.gagnechris.stacksandqueues;

import static org.junit.Assert.*;
import org.junit.Test;

public class QueueTest {
  @Test
  public void testEnqueueAndDequeue() throws Exception {
    Queue queue = new Queue();
    queue.enqueue("abc");
    Object item = queue.dequeue();
    assertEquals("Make sure dequeued item is abc", item, "abc");
  }

  @Test
  public void testFIFO() throws Exception {
    String item1 = "item1";
    String item2 = "item2";
    String item3 = "item3";

    Queue queue = new Queue();
    queue.enqueue(item1);
    queue.enqueue(item2);
    queue.enqueue(item3);

    Object dequeued1 = queue.dequeue();
    Object dequeued2 = queue.dequeue();
    Object dequeued3 = queue.dequeue();

    assertEquals("First dequeued item is item1", dequeued1, item1);
    assertEquals("Second dequeued item is item2", dequeued2, item2);
    assertEquals("Third dequeued item is item3", dequeued3, item3);
  }
}