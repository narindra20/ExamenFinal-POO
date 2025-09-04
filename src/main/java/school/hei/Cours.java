package school.hei;

import java.util.List;

public class Cours {
    private final int id;
    private final String label;
    private final int credits;
    private final List<Enseignants> enseignants;

    public Cours(int id, String label, int credits, List<Enseignants> enseignants) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.enseignants = enseignants;
    }
}
