import java.io.File;
public class fileopen {

  public static void main(String[] args) {
    File f=new File("C:Users/Assassin/Music/Zindagi Se - Raaz 3 320Kbps.mp4");
    System.out.println(f.canExecute());
  }
}