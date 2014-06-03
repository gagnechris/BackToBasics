package com.gagnechris.triangle;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {
  @Test
  public void testTriangle() throws Exception {
    Triangle triangle = new Triangle();
    triangle.processFile();
    System.out.print("Total: " + triangle.getCurrentTotal());
  }
}