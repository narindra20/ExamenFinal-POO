package school.hei;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@AllArgsConstructor
@Getter
public class Notes {
    private final double note;
    private final Instant dateDudebut;
    private final String description;
}
