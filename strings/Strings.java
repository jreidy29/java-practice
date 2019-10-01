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

  public String substring(String input, int a, int b) {
    StringBuilder ret = new StringBuilder();
    for(int i = a; i < b; i++) {
      ret = ret.append(input.charAt(i));
    }
    return ret.toString();
  }

  //Return smallest and largest k-length substring of given string
  //
  public String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    smallest = s.substring(0, k);
    largest = s.substring(0, k);
    k++;
    for(int i = 1; k - 1 < s.length(); i++) {
       if(smallest.compareTo(s.substring(i, k)) > 0 ) {
         smallest = s.substring(i, k);
       } 
       if(largest.compareTo(s.substring(i, k)) < 0) {
         largest = s.substring(i, k); 
       }
       k++;
    }
    return smallest + "\n" + largest;
  }

  public boolean testSubstring() {
    String test = "Helloworld";
    int a = 3;
    int b = 7;
    String success = "lowo";
    Strings testing = new Strings();
    return success.equals(testing.substring(test, a, b));
  }

  public boolean testSaL() {
    String s = "welcometojava";
    int k = 3;
    String ans = "ava\nwel";
    Strings testing = new Strings();
    return ans.equals(testing.getSmallestAndLargest(s, k));
  }

  public static void main(String[] args) {
    Strings testStrings = new Strings();
    //System.out.println(testStrings.uniqueString("does this count as unique"));
    //System.out.println(testStrings.uniqueString("abcdefghijklmnopqrstuvwxyz"));
    //System.out.println(testStrings.uniqueString(""));
    //System.out.println(testStrings.uniqueString("123456789987654321"));
    System.out.println("testing substring passes: " + testStrings.testSubstring());
    System.out.println("testing SaL passes: " + testStrings.testSaL());
  }
}
