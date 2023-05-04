package date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class ExampleDate {
    public static void main(String[] args) {
        LocalDate localDateStart = LocalDate.of(2023, 2, 1);
        LocalDate localDateEnd = LocalDate.of(2023, 2, 28);

        Instant instantStart = localDateStart.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        Instant instantEnd = localDateEnd.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();


        LocalDateTime localDateTime = LocalDateTime.of(2023, 2, 1, 0, 22, 33);
        System.out.println(localDateTime.toInstant(ZoneOffset.UTC));

        System.out.println(localDateTime.toInstant(ZoneOffset.UTC).isAfter(instantStart));
//
//        LocalDate localDate = LocalDate.of(2023, 2, 28);
//
//        System.out.println(localDateStart.isAfter(localDate));
//
//        System.out.println(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
//
//        System.out.println(localDate);
//        System.out.println(localDate.atStartOfDay().toInstant(ZoneOffset.UTC));
//        System.out.println(localDate.atTime(LocalTime.MAX).toInstant(ZoneOffset.UTC));


    }
}
