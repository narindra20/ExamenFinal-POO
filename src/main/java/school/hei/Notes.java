package school.hei;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.notes;

@AllArgsConstructor
@Getter
public class Notes {
    private final double note;
    private final Instant dateDudebut;
    private final String description;
}
