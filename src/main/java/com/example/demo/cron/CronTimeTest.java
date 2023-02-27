package com.example.demo.cron;

import org.springframework.scheduling.support.CronExpression;

import java.util.stream.Stream;

import static java.time.LocalDateTime.now;

public class CronTimeTest {
    public static void main(String[] args){
        printNextTime("0 * * * * *");
    }


    public static void printNextTime(String cronString) {
        CronExpression exp = CronExpression.parse(cronString);
        Stream.iterate(now(), exp::next).limit(10).forEach(System.out::println);
    }
}
