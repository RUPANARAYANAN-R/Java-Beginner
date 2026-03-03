import java.io.FileWriter;
import java.io.IOException;

public class writefile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("newfile.txt");
      myWriter.write("File in java are too easy to modify by myself itself");
      myWriter.close();
      System.out.println("Successfully written to the file done by me.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}