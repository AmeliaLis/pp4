package Assignment1;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class Zajecia {
    public String nazwaPrzedmiotu;
    public int liczbaGodzin;
    public ArrayList<String> Studenci;
    public Zajecia(String nazwaPrzedmiotu, int liczbaGodzin){
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
        this.liczbaGodzin = liczbaGodzin;
        this.Studenci = new ArrayList<String>();
    }

    public ArrayList<String> getStudenci() {
        return Studenci;
    }

    public void setStudenci(ArrayList<String> studenci) {
        Studenci = studenci;
    }

    public void zapiszStudenta(String imieStudenta){
        if (Studenci.size() >= 10) {
            System.out.println("Brak miejsc.");
        } else {
            Studenci.add(imieStudenta);
        }
    }
}
