package Assignment1;
import java.util.LinkedList;

public class Zadanie2 {
    public static void FifoExample() {

        LinkedList<String> fifoExample = new LinkedList<String>();
        fifoExample.add("amelia");
        System.out.println(fifoExample);
        fifoExample.add("kacper");
        System.out.println(fifoExample);
        fifoExample.poll();
        System.out.println(fifoExample);
        fifoExample.add("julia");
        System.out.println(fifoExample);
        fifoExample.poll();
        fifoExample.add("jan");
        System.out.println(fifoExample);
    }
}
