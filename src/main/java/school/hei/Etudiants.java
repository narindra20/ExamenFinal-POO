package school.hei;

public class Etudiants {
    private int id;
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private String email;
    private String numeroTelephone;
    private String groupe;
    private String tuteur;

    public Etudiants(int id, String nom, String prenom, String dateDeNaissance, String email, String numeroTelephone, String groupe, String tuteur) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.numeroTelephone = numeroTelephone;
        this.groupe = groupe;
        this.tuteur = tuteur;
    }
}
