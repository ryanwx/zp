package ryan.day7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PracticeLocaleDateTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        System.out.println("--------------");

        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDate localDate1 = localDateTime1.toLocalDate();
        LocalTime localTime1 = localDateTime1.toLocalTime();
        System.out.println(localDateTime1);
        System.out.println(localDate1);
        System.out.println(localTime1);

        System.out.println("--------------");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));
        LocalDateTime localDateTime2 = LocalDateTime.parse("2020-06-16 10:20:19", dateTimeFormatter);
        System.out.println(localDateTime2);
    }
}
