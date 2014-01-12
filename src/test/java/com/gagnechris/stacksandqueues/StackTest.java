package com.gagnechris.stacksandqueues;

import static org.junit.Assert.*;
import org.junit.Test;

public class StackTest {
  @Test
  public void testPushAndPeek() throws Exception {
    Stack stack = new Stack();
    stack.push("abc");
    assertEquals("abc was successfully pushed", stack.peek(), "abc");
  }

  @Test
  public void testPop() throws Exception {
    Stack stack = new Stack();
    stack.push("abc");
    Object item = stack.pop();
    assertEquals("abc was successfully popped", item, "abc");
  }

  @Test
  public void testFILO() throws Exception {
    String item1 = "item1";
    String item2 = "item2";
    String item3 = "item3";

    Stack stack = new Stack();
    stack.push(item1);
    stack.push(item2);
    stack.push(item3);

    Object popped1 = stack.pop();
    Object popped2 = stack.pop();
    Object popped3 = stack.pop();

    assertEquals("First popped item is item3", popped1, item3);
    assertEquals("Second popped item is item2", popped2, item2);
    assertEquals("Third popped item is item1", popped3, item1);
  }
}