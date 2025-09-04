package school.hei;

public class Personne {
    private final int id;
    private final String nom;
    private final String prenom;
    private final String dateDeNaissance;
    private final String email;
    private final String numeroTelephone;

    public Personne(int id, String nom, String prenom, String dateDeNaissance, String email, String numeroTelephone){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.numeroTelephone = numeroTelephone;

    }
}
