package com.gagnechris.treesandgraphs;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinarySearchTreeTest {
  @Test
  public void testAddItem() throws Exception {
    BinarySearchTree<String> tree = new BinarySearchTree();
    tree.add("abc");
    assertEquals("Item abc can be found in tree.", tree.contains("abc"), true);
    //assertEquals("Tree size is one.", tree.size());
  }

  @Test
  public void testAddMultipleItems() throws Exception {
   BinarySearchTree<String> tree = new BinarySearchTree();
    tree.add("abc");
    tree.add("def");
    tree.add("ghi");
    assertEquals("Item abc can be found in tree.", tree.contains("abc"), true);
    assertEquals("Item def can be found in tree.", tree.contains("def"), true);
    assertEquals("Item ghi can be found in tree.", tree.contains("ghi"), true);
  }

  @Test
  public void testItemNotFound() throws Exception {
    BinarySearchTree<String> tree = new BinarySearchTree();
    tree.add("abc");
    assertEquals("Item abc can be found in tree.", tree.contains("abc"), true);
    assertEquals("Item cba is not found in tree.", tree.contains("cba"), false);
  }

  @Test
  public void testRemoveItem() throws Exception {
    BinarySearchTree<String> tree;
  }

  @Test
  public void testRemoveLastItem() throws Exception {

  }
}