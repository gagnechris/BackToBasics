package com.gagnechris.arrays;

import static org.junit.Assert.*;
import org.junit.Test;

public class ReverseStringTest {
  @Test
  public void testReverseString() throws Exception {
    String expectedVal = "fedcba";
    String actualVal = new ReverseString().reverseString("abcdef");
    assertEquals(String.format("The reverse of abcdef should be %s", expectedVal), actualVal, expectedVal);
  }

  @Test
  public void testReverseChars() throws Exception {
    String expectedVal = "fedcba";
    String actualVal = new ReverseString().reverseChars("abcdef".toCharArray());
    assertEquals(String.format("The reverse of abcdef should be %s", expectedVal), actualVal, expectedVal);
  }
}