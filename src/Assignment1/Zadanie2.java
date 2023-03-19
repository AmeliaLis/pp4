package Assignment1;
import java.util.LinkedList;

public class Zadanie2 {
    public LinkedList<String> fifoExample;
    public Zadanie2() {
        this.fifoExample = new LinkedList<String>();
    }

    public void addToFifo(String something){
        this.fifoExample.add(something);
    }

    public void pollFromFifo(){
        this.fifoExample.poll();
    }
}
