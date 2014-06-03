package com.gagnechris.treesandgraphs;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinaryNodeTest {
  @Test
  public void testCreatingNode() throws Exception {
    BinaryNode<String> node = new BinaryNode("text");
    assertEquals("Ensure data was saved in node", node.getData(), "text");
  }

  @Test
  public void testLeftAndRightNodes() throws Exception {
    BinaryNode<String> node = new BinaryNode("text");
    node.setLeftNode(new BinaryNode("left"));
    node.setRightNode(new BinaryNode("right"));
    String leftNodeData = node.getLeftNode().getData();
    String rightNodeData = node.getRightNode().getData();

    assertEquals("Ensure left node data is correct", leftNodeData, "left");
    assertEquals("Ensure right node data is correct", rightNodeData, "right");
  }
}