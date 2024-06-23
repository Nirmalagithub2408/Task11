import java.io.*;

public class Filenotfound {
    public static void main(String[] args) {
        try
        {
        File file = new File("Error:  +file.txt");
        FileReader fr = new FileReader(file);
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exists");
        }

    }
}