// package me.inp;

// import java.io.FileInputStream;
// import java.io.IOException;

// public class fileinput {

//   public static void main(String[] args) {
//     try (
//       FileInputStream file = new FileInputStream(
//         "C:/Users/Assassin/Videos/com/me/inp/file.xlsx"
//       )
//     ) {
//       char[] values;
//       int content = file.read();
//       for (int i = 0; i < ((file.read()) != -1); i++) {
//         values[i] = (char) content;
//       }
//       System.out.println(
//         "............................File Reading Completed............................."
//       );
//       file.close();
//     } catch (IOException e) {
//       e.printStackTrace();
//     }
//   }
// }

package me.inp;

import java.io.FileInputStream;
import java.io.IOException;

public class fileinput {

  public static void main(String[] args) {
    // Use a larger buffer to read the file
    StringBuilder fileContent = new StringBuilder();

    try (
      FileInputStream file = new FileInputStream(
        "C:/Users/Assassin/Videos/com/me/inp/file.xlsx"
      )
    ) {
      int content;
      // Read the file until the end
      while ((content = file.read()) != -1) {
        // Append the read character to the StringBuilder
        fileContent.append((char) content);
      }
      System.out.println("File Content: " + fileContent.toString());
      System.out.println(
        "............................File Reading Completed............................."
      );
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
