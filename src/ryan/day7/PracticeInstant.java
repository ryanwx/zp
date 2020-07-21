package ryan.day7;

import java.time.Instant;

public class PracticeInstant {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        System.out.println(instant.toEpochMilli());
        System.out.println(instant.getEpochSecond());
    }
}
