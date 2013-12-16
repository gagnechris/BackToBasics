package com.gagnechris.arrays;

public class ReverseString {

  public static void main(String[] args) {
    System.out.println(String.format("String reversed: %s", reverseString(args[0])));
    System.out.println(String.format("Chars reversed (in place): %s", reverseChars(args[0].toCharArray())));
  }

  /** Takes a string and reverses it without using the reverse method in StringBuilder.
   *
   * @param  str The string to reverse
   * @return The reversed string.
  */
  private static String reverseString(String str) {
    if (str.length() == 1) return str;

    char reversedStr[] = new char[str.length()];
    int revPos = 0;
    for(int i = str.length() - 1; i >= 0; i--) {
      reversedStr[revPos] = str.charAt(i);
      revPos++;
    }
    return new String(reversedStr);
  }

  /** Takes a string and reverses it without using the reverse method in StringBuilder.
   *
   * @param  str The string to reverse
   * @return The reversed string.
  */
  private static String reverseChars(char[] chars) {
    int end = chars.length - 1;
    int start = 0;

    while (start < end) {
      char first = chars[start];
      char last = chars[end];
      chars[start] = last;
      chars[end] = first;

      start++;
      end--;
    }

    return new String(chars);
  }
}
