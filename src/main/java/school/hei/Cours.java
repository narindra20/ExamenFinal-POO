package school.hei;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
@Getter
public class Cours {
    private final int id;
    private final String label;
    private final int credits;
    private final List<Enseignants> enseignants;
    private final List<Notes> notes;

    public Cours(int id, String label, int credits, List<Enseignants> enseignants) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.enseignants = enseignants;
    }

    public double getCoursGrades(Cours cours, Etudiants etudiants, Instant t) {
        return notes.stream()
                .filter(notes -> notes.getDateCreation().isBefore(t))
                .max(Comparator.comparing(Notes::getDateCreation))
                .map(Notes::getMontant)
                .map(Enseignants::getNotes)
                .get();
    }

}
