package school.hei;


import lombok.Getter;

@Getter
public class Enseignants extends Personne{
   public enum Specialite{
        frontend, backend
   }

   private final Specialite specialite;
   public Enseignants(int id, String nom, String prenom, String dateDeNaissance, String email, String numeroTelephone, Specialite specialite) {

       super(id, nom, prenom, dateDeNaissance, email, numeroTelephone);
       this.specialite = specialite;
   }

}
