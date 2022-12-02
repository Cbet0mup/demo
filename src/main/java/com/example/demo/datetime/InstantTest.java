package com.example.demo.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class InstantTest {
    private static final DateTimeFormatter outputDateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    public static void main(String[] args) {
//        Instant instant = Clock.systemDefaultZone().instant();
//        System.out.println(instant.getEpochSecond());
//        System.out.println(instant.getNano());
//
//        System.out.println(instant.toEpochMilli());
//
//        System.out.println("************************************");
//
//        Instant instant1 = Clock.system(ZoneId.of("Etc/GMT+3")).instant();
//        System.out.println(instant1.toString());
//
//        Instant instant2 = Clock.systemUTC().instant();
//        System.out.println(instant2.toString());
//
//        Instant instant3 = Clock.systemDefaultZone().instant();
//        System.out.println(instant3.toString());
//
//        System.out.println("***********************************************");
//       // ZoneId.getAvailableZoneIds().forEach(System.out::println);
//
//        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
//        System.out.println("LocalDateTime:  " + ldt);
//
//        System.out.println("*****************************lkdfhl");
//        String date = "2022-10-05T20:00:00+03:00";
//       // LocalDateTime localDateTime = LocalDateTime.parse(date, outputDateTimeFormatter);
//
//        DateTimeFormatter formatter
//                = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
//        LocalDateTime localDateTime1 = LocalDateTime.parse(date, formatter);
//        System.out.println("ldt: " + localDateTime1);

        System.out.println(beginYesterday() + "-----------" + endYesterday());
    }

    public static long beginYesterday() {
        try {
            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.add(Calendar.DAY_OF_YEAR, -1);
            return simpleDateFormat.parse(calendar.get(Calendar.YEAR) + "-" + getMonth(calendar) + "-" + calendar.get(Calendar.DAY_OF_MONTH) + " 00:00:01").getTime();
        } catch (ParseException e) {
            return 0L;
        }
    }

    private static int getMonth(Calendar calendar) {
        return calendar.get(Calendar.MONTH) + 1;
    }

    public static long endYesterday() {
        try {
            final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.add(Calendar.DAY_OF_YEAR, -1);
            return simpleDateFormat.parse(calendar.get(Calendar.YEAR) + "-" + getMonth(calendar) + "-" + calendar.get(Calendar.DAY_OF_MONTH) + " 23:59:59").getTime();
        } catch (ParseException e) {
            return 0L;
        }
    }

}
