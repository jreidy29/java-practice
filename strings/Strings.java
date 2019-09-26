import java.util.*;
import java.io.*;

public class Strings {
  
  // Test if string has only unique characters
  public boolean uniqueString(String str) {
    HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
    for(int i = 0; i < str.length(); i++) {
      if(hmap.get(str.charAt(i)) == null) hmap.put(str.charAt(i), 1);
      else if(hmap.get(str.charAt(i)) == 1) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Strings testStrings = new Strings();
    System.out.println(testStrings.uniqueString("does this count as unique"));
    System.out.println(testStrings.uniqueString("abcdefghijklmnopqrstuvwxyz"));
    System.out.println(testStrings.uniqueString(""));
    System.out.println(testStrings.uniqueString("123456789987654321"));
  }
}
