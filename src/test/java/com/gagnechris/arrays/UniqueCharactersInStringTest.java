package com.gagnechris.arrays;

import static org.junit.Assert.*;
import org.junit.Test;

public class UniqueCharactersInStringTest {
  @Test
  public void testForUniqueChars() throws Exception {
    boolean test1 = new UniqueCharactersInString().hasOnlyUniqueCharacters("abcdef");
    boolean test2 = new UniqueCharactersInString().hasOnlyUniqueCharacters("abcdeff");
    boolean test3 = new UniqueCharactersInString().hasOnlyUniqueCharacters("fxeddcbaa");
    assertEquals("abcdef contains only unique characters", test1, true);
    assertEquals("abcdeff does not contain unique characters", test2, false);
    assertEquals("fxeddcbaa does not contain unique characters", test3, false);
  }
}