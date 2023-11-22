import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListPatients /*à completer*/ {
    private List<Patient> listP;

    public ListPatients() {
        /*à completer*/
        listP = new ArrayList<>();
    }

    public void ajouterPatient(Patient p) {
        /*à completer*/
        listP.add(p);
    }

    public void supprimerPatient(Patient p) {/*à completer*/
        if(listP.contains(p)){
            listP.remove(p);
        }
    }

    /* Avec l’api Stream */
    public boolean rechercherPatient(Patient p) {
        /*à completer*/
        return listP.stream().anyMatch(p::equals);
    }

    /* Avec l’api Stream */
    public boolean rechercherPatient(int cin) {
        /*à completer*/
        return listP.stream().anyMatch(patient -> patient.getCin() == cin);
    }

    /* Avec l’api Stream */
    public void afficherPatients() {
       listP.stream().forEach(System.out::println);
    }

    /* Avec l’api Stream */
    public void trierPatientsParNom() {
        listP =listP.stream().sorted(Comparator.comparing(Patient :: getNom)).toList();
    }

    /* Avec l&#39;api stream */
    public void PatientSansRedondance() {
        listP = listP.stream().distinct().toList();
    }

    public List<Patient> getListP() {
        return listP;
    }

    @Override
    public String toString() {
        String str ="";
        for (Patient p:listP
             ) {
            str += p.toString() +"\n";
        }
        return "ListPatients{" +
                "listP=" +
                    str+
                '}';
    }
}