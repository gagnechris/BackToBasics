package com.gagnechris.arrays;

public class StringsPermutationChecker {
  /** Analyze two strings and determine if they are permutations of one another.  This method determines
   *  if there are permutations using sorting.
   *
   * @param  str1 The first string to analyze
   * @param  str2 The second string to analyze
   * @return true if str1 and str2 are permutations of one another.
  */
  public boolean isPermutationViaSorting(String str1, String str2) {
    if (str1.length() != str2.length()) return false;

    return sort(str1).equals(sort(str2));
  }

  private String sort(String str) {
    char[] chars = str.toCharArray();
    java.util.Arrays.sort(chars);
    return new String(chars);
  }

  /** Analyze two strings and determine if they are permutations of one another.  This method determines
   *  if there are permutations using character counting.
   *
   * @param  str1 The first string to analyze
   * @param  str2 The second string to analyze
   * @return true if str1 and str2 are permutations of one another.
  */
  public boolean isPermutationViaCounting(String str1, String str2) {
    if (str1.length() != str2.length()) return false;

    int[] characters = new int[256];
    for (int i = 0; i < str1.length(); i++) {
      int char1 = str1.charAt(i);
      characters[char1]++;
    }

    for (int i = 0; i < str2.length(); i++) {
      int char1 = str2.charAt(i);
      if (--characters[char1] < 0) {
        return false;
      }
    }

    return true;
  }
}
