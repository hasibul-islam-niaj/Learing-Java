package com.hasibul.date_time;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.concurrent.atomic.AtomicInteger;

public class DateTimeTest {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Time: " + dateTime);

        dateTime = dateTime.plusYears(2);
        System.out.println("Added Days: " + dateTime);

        System.out.println();
        System.out.println("System current time: " + System.currentTimeMillis());
        System.out.println("Instant Epoch time: " + Instant.now().toEpochMilli());

        System.out.println();
        System.out.println("Time without time zone: " + Instant.ofEpochMilli(System.currentTimeMillis()));
        System.out.println("Time with time zone" + LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()));

        System.out.println();
        System.out.println("TImestamp of system: " + new Timestamp(System.currentTimeMillis()));
        System.out.println("TImestamp of epoch: " + new Timestamp(Instant.now().toEpochMilli()));
        System.out.println("Timestamp of UTC+0: "+new Timestamp(System.currentTimeMillis()).getTime());

        AtomicInteger i = new AtomicInteger(1);
        ZoneId.getAvailableZoneIds().stream().forEach(s -> {
            System.out.println((i.getAndIncrement()) + ". " + s);
        });

        /*SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy HH:SS");
        System.out.println("Current Time: " + format.format(dateTime));*/
    }
}
