package Assignment1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Zadanie3 {
    public static void WriteLine(String line){
        try {
            FileWriter file = new FileWriter("src\\Assignment1\\plik.txt",true);
            file.write(line + "\n");
            file.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
