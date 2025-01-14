package filewriteinjava;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {

        try(FileWriter fileWriter =new FileWriter("example.txt")) {
            fileWriter.write("Salam Dunya Necesen");
            fileWriter.write("Salam");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
