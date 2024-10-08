import java.util.ArrayList;

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
        }
    }

}
