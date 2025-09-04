package school.hei;


public class Tuteur extends Personne{
    private final String description;

    public Tuteur(int id, String nom, String prenom, String dateDeNaissance, String email, String numeroTelephone, String description) {
        super(id, nom, prenom, dateDeNaissance, email, numeroTelephone);
        this.description = description;
    }


    public String getDescription() {
        return description;
    }
}
