package com.gagnechris.treesandgraphs;


public class BinarySearchTree<T extends Comparable<T>> {
  private BinaryNode<T> parentNode;
  private int size;

  public void add(T data) {
    if (parentNode == null) {
      parentNode = new BinaryNode(data);
    } else {
      addToNode(data, parentNode);
    }
  }

  public boolean remove(T data) {
    BinaryNode<T> currentNode, parent = null;

    currentNode = findNode(data, parent);

    if (currentNode == null) return false;

    return true;
  }

  public boolean contains(T data) {
    BinaryNode<T> parent = null;
    return findNode(data, parent) != null;
  }

  public int size() {
    return this.size;
  }

  private void addToNode(T data, BinaryNode<T> node) {
    if (data.compareTo(node.getData()) < 0) {
      if (node.getLeftNode() == null) {
        node.setLeftNode(new BinaryNode(data));
      } else {
        addToNode(data, node.getLeftNode());
      }
    } else {
      if (node.getRightNode() == null) {
        node.setRightNode(new BinaryNode(data));
      } else {
        addToNode(data, node.getRightNode());
      }
    }
  }

  private BinaryNode<T> findNode(T data, BinaryNode<T> parent) {
    if (parentNode == null) return null;

    BinaryNode<T> currentNode = parentNode;
    parent = null;

    while(currentNode != null) {
      int compareResult = currentNode.getData().compareTo(data);

      if (compareResult > 0) {
        parent = currentNode;
        currentNode = currentNode.getLeftNode();
      } else if (compareResult < 0) {
        parent = currentNode;
        currentNode = currentNode.getRightNode();
      } else {
        break;
      }
    }

    return currentNode;
  }
}