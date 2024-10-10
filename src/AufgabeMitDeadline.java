import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class AufgabeMitDeadline extends Aufgabe{

    GregorianCalendar deadline;






    public String getDeadline() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        return sdf.format(deadline.getTime());
    }

    public void setDeadline(GregorianCalendar deadline) {
        this.deadline = deadline;
    }


    public AufgabeMitDeadline(String aufgabentext, GregorianCalendar deadline) {
        super(aufgabentext);
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "AufgabeMitDeadline{" +
                "deadline=" + deadline +
                ", aufgabentext='" + aufgabentext + '\'' +
                ", datumerstellung=" + datumerstellung +
                '}';
    }
}
