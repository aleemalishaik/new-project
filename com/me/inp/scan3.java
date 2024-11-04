package me.inp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class scan3 {

  public static void main(String[] args) {
    // clearFile("C:/Users/Assassin/Videos/com/me/inp/data.dat");
    writeData(); // Call the method to write data
    readData(); // Then call the method to read data
    // clearFile("C:/Users/Assassin/Videos/com/me/inp/data.txt");
    // readData(); // Then call the method to read data
  }

  public static void writeData() {
    try (
      DataOutputStream dos = new DataOutputStream(
        new FileOutputStream(
          "C:/Users/Assassin/Videos/com/me/inp/data.txt",
          true
        )
      )
    ) {
      dos.writeInt(1265);
      dos.writeUTF("\n \t Shaik Aleem Ali\n");
      dos.writeByte(016);
      dos.writeBoolean(false);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void readData() {
    try (
      DataInputStream dataInputStream = new DataInputStream(
        new FileInputStream("C:/Users/Assassin/Videos/com/me/inp/data.txt")
      )
    ) {
      int i = dataInputStream.readInt();
      System.out.println("Integer read: " + i);
      String s = dataInputStream.readUTF();
      System.out.println("String read: " + s);
      Byte b = dataInputStream.readByte();
      System.out.println("Byte read: " + b);
      Boolean bool = dataInputStream.readBoolean();
      System.out.println("Boolean read: " + bool);
    } catch (Exception e) {
      System.out.println("Error Occurred: " + e);
    }
    System.out.println();
  }

  public static void clearFile(String filePath) {
    try (
      DataOutputStream dos = new DataOutputStream(
        new FileOutputStream(filePath)
      )
    ) {
      // Opening the file in write mode will truncate the file, effectively clearing it
      System.out.println("File cleared successfully.");
    } catch (IOException e) {
      System.out.println(
        "Error occurred while clearing the file: " + e.getMessage()
      );
    }
  }
}
