package com.gagnechris.arrays;

public class UniqueCharactersInString {

  public static void main(String[] args) {
    System.out.println(String.format("String has only unique characters: %s", hasOnlyUniqueCharacters(args[0])));
  }

  /** Analyze input string to determin if the string contains only unique characters.
   *  Time complexity: O(n)
   *  Space complexity: O(1)
   *
   * @param  str The string to analyze
   * @return true if str doesn't have any duplicate characters, otherwise return false.
  */
  private static boolean hasOnlyUniqueCharacters(String str) {
    if (str.length() > 256) return false;

    boolean[] chars = new boolean[256];
    for(int i = 0; i < str.length(); i++) {
      int currentChar = str.charAt(i);

      if (chars[currentChar]) {
        return false;
      }
      chars[currentChar] = true;
    }
    return true;
  }
}
