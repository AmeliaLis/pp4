package test;
import org.junit.jupiter.api.Test;
import Assignment1.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstTest {

    @Test
    void testZadanie1(){
        assert Zadanie1.CalculateNetto(100,0.2) == 80.0;
    }

    @Test
    void testZadanie2(){
        Zadanie2 kolejka = new Zadanie2();
        kolejka.addToFifo("Korneliusz");
        kolejka.addToFifo("Mariusz");
        kolejka.addToFifo("Izabela");
        kolejka.pollFromFifo();

        assert kolejka.fifoExample.getFirst().equals("Mariusz");
    }

    @Test
    void checkIfTextApppended(){
        Zadanie3.WriteLine("Test text");
        String text = "";
        try {
            File myObj = new File("src/Assignment1/plik.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                text += data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        String lastText = text.substring(text.length()-9);
        System.out.println(lastText);
        assert lastText.equals("Test text");
    }

    @Test
    void testZajecia1(){
        Zajecia zajeciaPP4 = new Zajecia("Pracownia Programowania 4", 30);
        zajeciaPP4.zapiszStudenta("Jacek");

        assert zajeciaPP4.getStudenci().get(0).equals("Jacek");
    }

    @Test
    void testZajecia2(){
        Zajecia zajeciapp4 = new Zajecia("Pracownia Programowania 4", 30);

        for (int i=0; i<=11; i++){
            zajeciapp4.zapiszStudenta("Jacek");
        }

        assert zajeciapp4.Studenci.size() == 10;
    }

}
