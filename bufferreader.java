import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class bufferreader{
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("newfile.txt"));
            String Line;
            while((Line = br.readLine()) != null){
                System.out.println(Line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}