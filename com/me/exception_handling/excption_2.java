package me.exception_handling;

import java.io.FileOutputStream;
import java.io.IOException;

public class excption_2 {

  public static void main(String[] args) {
    try {
    //   FileOutputStream fos = new FileOutputStream("/null");
        throw new IOException("File Exception Occurred In Aleem's File");
    } catch (IOException e) {
      System.out.println("Exception Occured : " + e.getMessage());
    }
  }
}
