package school.hei;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.notes;

@AllArgsConstructor
@Getter
public class Notes {
    private final double note;
    private final Instant dateDeCreation;
    private final String description;

    public Instant getDateCreation() {
        return dateDeCreation;
    }

    public double getMoyenne() {
        var total = 0.0;
        for (Notes note : note) {
            total += note.getMoyenne(this.getDateCreation());
        }
        return total;
    }
}
