package test;
import org.junit.jupiter.api.Test;
import Assignment1.*;
public class FirstTest {
    @Test
    void test(){
        assert true == true;
    }

    @Test
    void test1(){
        assert Zadanie1.CalculateNetto(100,0.2) == 80.0;
    }

    @Test
    void test2(){
        Zadanie2 kolejka = new Zadanie2();
        kolejka.addToFifo("Korneliusz");
        kolejka.addToFifo("Mariusz");
        kolejka.addToFifo("Izabela");
        kolejka.pollFromFifo();

        assert kolejka.getFirst().equals("Mariusz");
    }
    @Test
    void testZajecia(){
        Zajecia zajeciaPP4 = new Zajecia("Pracownia Programowania 4", 30);
        zajeciaPP4.zapiszStudenta("Jacek");

        assert zajeciaPP4.getStudenci().get(0).equals("Jacek");
    }

}
