import java.io.File;
import java.util.Scanner;
public class readfile{
    public static void main(String[] args) {
        try {
            String filePath = "newfile1.txt";
            File file = new File(filePath);
            Scanner myReader = new Scanner(file);
            String data = myReader.nextLine();
            System.out.println(data);
        } catch (Exception e) {
            System.out.println("An error has been occurred successfully by me: " + e.getMessage());
        }
    }
}