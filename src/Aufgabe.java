import java.util.GregorianCalendar;

public class Aufgabe {
    String aufgabentext;

    GregorianCalendar datumerstellung;


    public String getAufgabentext() {
        return aufgabentext;
    }

    public void setAufgabentext(String aufgabentext) {
        this.aufgabentext = aufgabentext;
    }

    public GregorianCalendar getDatumerstellung() {
        return datumerstellung;
    }


    public Aufgabe(String aufgabentext) {
        this.aufgabentext = aufgabentext;
    }

    @Override
    public String toString() {
        return "Aufgabe{" +
                "aufgabentext='" + aufgabentext + '\'' +
                ", datumerstellung=" + datumerstellung +
                '}';
    }
}
