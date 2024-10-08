import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Kommandozeilenmenue {
private ListeAllerAufgaben l = new ListeAllerAufgaben();

   private GregorianCalendar deadline = new GregorianCalendar(2024, Calendar.JUNE,5);

   private Aufgabe a1 = new Aufgabe("APR HÜ machen");
   private AufgabeMitDeadline aMD2 = new AufgabeMitDeadline("Module machen",deadline);
   private Aufgabe a2 = new Aufgabe("Schule gehen");




    Scanner scan;

    public Kommandozeilenmenue() {
        this.scan = new Scanner(System.in);
    }

    public void MenüAnzeigen() {
        System.out.println("******** Liste XXX bearbeiten *******");
        System.out.println("1) Alle Aufgaben anzeigen");
        System.out.println("2) Aufgaben durchsuchen");
        System.out.println("3) Deadlines anzeigen");
        System.out.println("4) Neue Aufgabe hinzufügen \n a) Standard-Aufgabe\n" +
                " b) Aufgabe mit Deadline");
        System.out.println("5) Aufgabe erledigt");
        System.out.println("x) Beenden");
    }

    public void start() {
        String s = "-";
        while (!s.equals("3")) {
            MenüAnzeigen();
            s = scan.nextLine();
            switch(s)
            {
                case "1":
                    l.alleAufgabenAusgeben();
                    break;
                case "2":
                    this.rechnen();
                    break;
                case "3":
                    break;
                default:
                    this.fehler();
                    break;
                case "4":
                    l.aufgabeHinzufügen(a1);
                    l.aufgabeHinzufügen(aMD2);
                    l.aufgabeHinzufügen(a2);
                    break;

            }
        }
        scan.close();
    }

    public void ausgabe()
    {
        System.out.println("AUSGABE");
    }

    public void rechnen()
    {
        System.out.println("RECHNEN 1+1 = 2");
    }

    public void fehler()
    {
        System.out.println("Sie k�nnen nur 1,2 oder 3 eingeben!");
    }


}
