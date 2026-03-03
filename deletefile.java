import java.io.File;
public class deletefile{
    public static void main(String[] args) {
        File myObj = new File("newfile.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file successfully by me.");
        }
    }
}