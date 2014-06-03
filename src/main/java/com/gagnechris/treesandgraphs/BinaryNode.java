package com.gagnechris.treesandgraphs;


public class BinaryNode<T> {
  private BinaryNode<T> leftNode;
  private BinaryNode<T> rightNode;
  private T data;

  public BinaryNode(T data) {
    this.data = data;
  }

  public BinaryNode<T> getLeftNode() {
    return leftNode;
  }

  public void setLeftNode(BinaryNode<T> node) {
    this.leftNode = node;
  }

  public BinaryNode<T> getRightNode() {
    return rightNode;
  }

  public void setRightNode(BinaryNode<T> node) {
    this.rightNode = node;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}