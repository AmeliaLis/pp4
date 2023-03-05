package Assignment1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Zadanie3 {
    public static void WriteLine(String line, String path){
        //"src\\Assignment1\\plik.txt"
        try {
            FileWriter file = new FileWriter(path,true);
            file.write(line + "\n");
            file.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
