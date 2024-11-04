package me.inp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class scan2 {

  public static void main(String[] args) throws IOException {
    method1();
    method2();
  }

  public static void method1() {
    try {
      FileInputStream file = new FileInputStream(
        "C:/Users/Assassin/Videos/com/me/inp/example.txt"
      );
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void method2() throws IOException {
    try (
      FileInputStream fin = new FileInputStream(
        "C:/Users/Assassin/Videos/com/me/inp/example.txt"
      )
    ) {
      int data;
      while ((data = fin.read()) != -1) {
        System.out.print((char) data);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
