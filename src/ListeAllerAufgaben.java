import java.util.ArrayList;
import java.util.List;

public class ListeAllerAufgaben {

    public ArrayList<Aufgabe> liste;

    public ListeAllerAufgaben() {this.liste = new ArrayList<>();}

    public void aufgabeHinzufügen(Aufgabe aufgabe){
        this.liste.add(aufgabe);
    }

    public void alleAufgabenAusgeben(){
        for(Aufgabe aufgabe : liste){
            System.out.println(aufgabe);
            System.out.println("---------------------------------------------------------------------");
        }}


    public void sucheUndDruckeAufgaben(String suche) {
        for (Aufgabe aufgabe : liste) {
            if (aufgabe.toString().toLowerCase().contains(suche.toLowerCase())) {
                System.out.println(aufgabe);
            }}}


    public List<Aufgabe> sucheUndGibAufgaben(String suche) {
        List<Aufgabe> gefundeneAufgabe = new ArrayList<>();
        for (Aufgabe aufgabe : liste) {
            if (aufgabe.toString().toLowerCase().contains(suche.toLowerCase())) {
                gefundeneAufgabe.add(aufgabe);
            }
        }
        return gefundeneAufgabe;
    }

    public void entferneAufgabe(Aufgabe aufgabe) {
        liste.remove(aufgabe);
    }

    public void druckeDeadlines() {
        for (Aufgabe aufgabe : liste) {
            if (aufgabe instanceof AufgabeMitDeadline) {
                AufgabeMitDeadline aMD = (AufgabeMitDeadline) aufgabe;
                System.out.println("Aufgabe: " + aufgabe.toString() + ", Deadline: " + aMD.getDeadline());
            }
        }
    }


        }