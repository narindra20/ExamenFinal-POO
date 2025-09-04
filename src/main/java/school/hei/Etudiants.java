package school.hei;

import lombok.Getter;

@Getter
public class Etudiants extends Personne{
    private final String groupe;
    private final String tuteur;

    public Etudiants(int id, String nom, String prenom, String dateDeNaissance, String email, String numeroTelephone, String groupe, String tuteur) {
        super(id, nom, prenom, dateDeNaissance, email, numeroTelephone);
        this.groupe = groupe;
        this.tuteur = tuteur;
    }
}
