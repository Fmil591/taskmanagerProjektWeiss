import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {


ListeAllerAufgaben l = new ListeAllerAufgaben();



GregorianCalendar deadline = new GregorianCalendar(2024, Calendar.JUNE,5);
AufgabeMitDeadline aMD1 = new AufgabeMitDeadline("Module machen",deadline);




        Kommandozeilenmenue kommandozeilenmenue = new Kommandozeilenmenue();
        kommandozeilenmenue.start();


    }
}