package me.inp;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class scan4 {

  public static void main(String[] args) {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // try {
    //   int value = br.read();
    //   System.out.println(value);
    // } catch (IOException e) {
    //   e.printStackTrace();
    // }
    Console console = System.console();
    if (console == null) {
      System.out.println("No console available.");
      return;
    }
    System.out.println("Enter Password:");
    char[] input = console.readPassword();
    System.out.println("Password : ");
    for (int i = 0; i < input.length; i++) {
      System.out.print(input[i]);
    }
    // String input = console.readLine("Enter something: ");
    // System.out.println("You entered: " + input);
  }
}
