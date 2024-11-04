package me.inp;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferedoutput {

  public static void main(String[] args) {
    try (
      BufferedOutputStream bos = new BufferedOutputStream(
        new FileOutputStream("C:/Users/Assassin/Videos/com/me/inp/file.txt")
      )
    ) {
      String s =
        "This File Is About How BufferedOutputStream Works. It Works With Array Of Bytes";
      byte[] b = s.getBytes();
      bos.write(b);
      System.out.println("----------------Task Completed----------------");
      bos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
