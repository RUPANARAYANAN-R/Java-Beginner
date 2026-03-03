import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class bufferedwriter {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("newfile.txt"));
            bw.write("Adding new lines to the file by myself no ai has been integrated with so believe this");
            bw.newLine();
            bw.write("Also i am adding a new line with te help of newline command");
            bw.close();
            System.out.println("Successfully written to the file done by me.");
        } catch (IOException e) {
            System.out.println("An error occurred." + e.getMessage());
        }
    }
}