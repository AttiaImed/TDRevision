import java.util.HashMap;
import java.util.Map;

public class Hopital {
    public Map<Medecin,ListPatients> medecinPatiens;
    public Hopital(){
        medecinPatiens = new HashMap<>();
    }
    public void ajouterMedecin(Medecin m){
        medecinPatiens.putIfAbsent(m,new ListPatients());
    }
    public void ajouterPatient(Medecin m,Patient p){
        if(medecinPatiens.containsKey(m)){
            medecinPatiens.get(m).ajouterPatient(p);
        }else {
            ajouterMedecin(m);
            ajouterPatient(m,p);
        }
    }
    /*Avec l&#39;api stream */
    public void afficherMap(){
        medecinPatiens.entrySet().stream().forEach(mp -> {
            System.out.println("Le Medecin est : "+ mp.getKey());
            System.out.println("Les patient sont : \n");
            System.out.println(mp.getValue());

        });
    }
    /* Afficher les patients d’un medecin dont le nom est &quot;mohamed&quot; */
    public void afficherMedcinPatients (Medecin m){
        medecinPatiens.get(m).getListP().stream()
                .filter(patient -> patient.getNom().equals("mohamed"))
                .forEach(System.out::println);
    }
}
