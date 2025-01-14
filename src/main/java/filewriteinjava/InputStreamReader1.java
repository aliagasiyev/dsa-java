package filewriteinjava;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader1 {
    public static void main(String[] args) {

        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in)) {
            System.out.println("Write some number for convert");
            int number = inputStreamReader.read();

            while (inputStreamReader.ready()) {
                System.out.println((char) number);
                number = inputStreamReader.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

