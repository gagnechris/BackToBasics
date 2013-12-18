package com.gagnechris.arrays;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringsPermutationCheckerTest {
  @Test
  public void testViaCounting() throws Exception {
    boolean test1 = new StringsPermutationChecker().isPermutationViaCounting("abcdef", "abbcdef");
    boolean test2 = new StringsPermutationChecker().isPermutationViaCounting("abcdef", "abxdef");
    boolean test3 = new StringsPermutationChecker().isPermutationViaCounting("abcdef", "fedcba");
    assertEquals("abbcdef should not be a permutation of abcdef", test1, false);
    assertEquals("abxdef should not be a permutation of abxdef", test2, false);
    assertEquals("fedcba should be a permutation of abcdef", test3, true);
  }

  @Test
  public void testViaSorting() throws Exception {
    boolean test1 = new StringsPermutationChecker().isPermutationViaSorting("abcdef", "abbcdef");
    boolean test2 = new StringsPermutationChecker().isPermutationViaSorting("abcdef", "abxdef");
    boolean test3 = new StringsPermutationChecker().isPermutationViaSorting("abcdef", "fedcba");
    assertEquals("abbcdef should not be a permutation of abcdef", test1, false);
    assertEquals("abxdef should not be a permutation of abxdef", test2, false);
    assertEquals("fedcba should be a permutation of abcdef", test3, true);
  }
}