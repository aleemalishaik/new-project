package me.inp;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutput {

  public static void main(String[] args) {
    try (
      FileOutputStream file = new FileOutputStream(
        "C:/Users/Assassin/Videos/com/me/inp/file.xlsx",
        true
      )
    ) {
      String s =
        "The Work Done Or Log Files Can Be Written With This Method Easily If Not Using ApachePOI\n";
      byte[] content = s.getBytes();
      file.write(content);
      file.close();
      System.out.println("Task Completed");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
