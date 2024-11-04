package me.inp;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class scan {

  public static void main(String[] args) {
    // Specify the file path here (ensure file exists in the correct directory)
    File source = new File("C:/Users/Assassin/Videos/com/me/inp/example.txt"); // Relative path or full path can be provided here

    try {
      // Pass the File object to Scanner to read from the file
      Scanner scanner = new Scanner(source, StandardCharsets.UTF_8.name());

      // Reading file content line by line
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine(); // Read the next line from the file
        System.out.println(line); // Print the line to the console
      }

      // Closing the scanner to prevent resource leaks
      scanner.close();
    } catch (FileNotFoundException e) {
      // This block will execute if the file is not found
      System.out.println("File not found: " + e.getMessage());
    }
  }
}
