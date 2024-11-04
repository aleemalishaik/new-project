package me.exception_handling;

public class excption_1 {

  public static void main(String[] args) {
    try {
      int[] array = new int[2];
      try {
        String s = null;
        System.out.println(s.length());
      } catch (NullPointerException e) {
        System.out.println("Exception : " + e.getMessage());
      }
      try {
        array[0] = 12 / 0;
      } catch (ArithmeticException e) {
        System.out.println("Exception : " + e.getMessage());
      }
      System.out.println(array[5]);
    } catch (Exception e) {
      System.out.println("Exception : " + e.getMessage());
    }
  }
}
