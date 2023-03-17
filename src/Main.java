import Assignment1.Zadanie1;
import Assignment1.Zadanie2;
import Assignment1.Zadanie3;
import Assignment1.Zajecia;

public class Main {
    public static void main(String[] args) {
        //ex. 1
        System.out.println(Zadanie1.CalculateNetto(150.0, 0.17));

        //ex. 2
        //Zadanie2.FifoExample();

        //ex. 3
        Zadanie3.WriteLine("HELLO WORLD", "src\\Assignment1\\plik.txt");
        Zadanie3.WriteLine("GOOD BYE EVERYBODY", "src\\Assignment1\\plik.txt");

        //ex. 4
        Zajecia zajecia1 = new Zajecia("Pracownia programowania 4", 30);
        zajecia1.zapiszStudenta("Jacek 1");
        zajecia1.zapiszStudenta("Jacek 2 ");
        zajecia1.zapiszStudenta("Jacek 3");
        zajecia1.zapiszStudenta("Jacek 4 ");
        zajecia1.zapiszStudenta("Jacek 5");
        zajecia1.zapiszStudenta("Jacek 6");
        zajecia1.zapiszStudenta("Jacek 7");
        zajecia1.zapiszStudenta("Jacek 8");
        zajecia1.zapiszStudenta("Jacek 9 ");
        zajecia1.zapiszStudenta("Jacek 10");
        zajecia1.zapiszStudenta("Jacek 11");
        zajecia1.zapiszStudenta("Jacek 12");
        zajecia1.zapiszStudenta("Jacek 13");
        zajecia1.zapiszStudenta("Jacek 14");

    }
}