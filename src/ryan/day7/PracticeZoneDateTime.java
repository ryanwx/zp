package ryan.day7;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PracticeZoneDateTime {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.systemDefault());
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);

        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.systemDefault()));

        // 判断 zoneDateTime 是否相等，即使同一时刻，时区不相同则不相等
        System.out.println(zonedDateTime.equals(zonedDateTime.withZoneSameInstant(ZoneId.systemDefault())));
    }
}
