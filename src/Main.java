// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Patient p = new Patient(2,"Attia","imed",12345678);
        Patient p2 = new Patient(1,"umed","Attia",798456123);

        Medecin m = new Medecin(12,"Lomda","Attia",123465);

        Hopital h = new Hopital();

        h.ajouterMedecin(m);
        h.ajouterPatient(m,p);
        h.ajouterPatient(m,p2);

        h.afficherMap();



    }
}