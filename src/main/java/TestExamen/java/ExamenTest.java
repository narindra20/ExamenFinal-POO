package TestExamen.java;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import school.hei.Cours;
import school.hei.Examens;
import school.hei.Notes;

import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExamenTest {
    private Cours cours1;
    private Cours cours2;
    private Examens examens;

    @BeforeEach
    void setUp() {
        var changementNotes1= new Notes(
                10,"note initial",
                Instant.parse("2025-01-01T08:00:00Z"));
        var changementNotes2 = new Notes(
                12, "confinement",
                Instant.parse("2025-06-01T08:00:00Z"));

        var changementNotes3 = new Notes(
                8,"note initial",
                Instant.parse("2025-01-01T08:00:00Z"));
        var changementNotes4 = new Notes(
                10, "confinement",
                Instant.parse("2025-06-01T08:00:00Z"));

        cours1 = new Cours(1, "PROG2", List.of(changementNotes1, changementNotes2);
        cours2 = new Cours(2, "Sys", List.of(changementNotes3, changementNotes4));
        Examens = new Examens(1, Instant.parse("2025-02-01T08:00:00Z"), List.of(cours1, cours2));
    }
    @Test
    void get getExamensGrades() {
        assertEquals(18, Examens.getExamensGrades());
        Examens = new Examens(1, Instant.parse("2025-09-01T08:00:00Z"), List.of(cours1));
        assertEquals(22, Examens.getExamensGrades());
    }
}
