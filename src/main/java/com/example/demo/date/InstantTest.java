package com.example.demo.date;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class InstantTest {
    private static final DateTimeFormatter outputDateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    public static void main(String[] args) {
        Instant instant = Clock.systemDefaultZone().instant();
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());

        System.out.println(instant.toEpochMilli());

        System.out.println("************************************");

        Instant instant1 = Clock.system(ZoneId.of("Etc/GMT+3")).instant();
        System.out.println(instant1.toString());

        Instant instant2 = Clock.systemUTC().instant();
        System.out.println(instant2.toString());

        Instant instant3 = Clock.systemDefaultZone().instant();
        System.out.println(instant3.toString());

        System.out.println("***********************************************");
       // ZoneId.getAvailableZoneIds().forEach(System.out::println);

        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
        System.out.println("LocalDateTime:  " + ldt);

        System.out.println("*****************************lkdfhl");
        String date = "2022-10-05T20:00:00+03:00";
       // LocalDateTime localDateTime = LocalDateTime.parse(date, outputDateTimeFormatter);

        DateTimeFormatter formatter
                = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        LocalDateTime localDateTime1 = LocalDateTime.parse(date, formatter);
        System.out.println("ldt: " + localDateTime1);
    }

}
