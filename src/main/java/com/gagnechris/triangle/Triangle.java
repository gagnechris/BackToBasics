package com.gagnechris.triangle;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Iterator;

public class Triangle {
  long currentTotal = 0;

  public long getCurrentTotal() {
    return currentTotal;
  }

  public void processFile() {
    int previousPosition = 0;
    List<String> lines = null;

    try {
      lines = Files.readAllLines(Paths.get("/Volumes/MacintoshHD/Users/gagnechris/Documents/Projects-git/BackToBasics/src/main/resources/triangle.txt"), Charset.defaultCharset());
    } catch (IOException e) {
      System.out.println("Caught IOException: " + e.toString());
    }

    for(Iterator<String> i = lines.iterator(); i.hasNext(); ) {
      String item = i.next();
      previousPosition = processLine(item, previousPosition);
    }
  }

  private int processLine(String line, int previousPosition) {
    String[] lineStringSplit = line.split(" ");

    if (lineStringSplit.length == 1) {
      return previousPosition;
    } else {
      int leftVal = Integer.parseInt(lineStringSplit[previousPosition]);
      int rightVal = Integer.parseInt(lineStringSplit[previousPosition+1]);

      if (leftVal > rightVal) {
        currentTotal = currentTotal + leftVal;
        return previousPosition;
      } else {
        currentTotal = currentTotal + rightVal;
        return previousPosition+1;
      }
    }
  }
}