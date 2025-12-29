// 1. Problem 1: Time Zones and ZonedDateTime Write a program that displays the current
// time in different time zones:
// ➢ GMT (Greenwich Mean Time)
// ➢ IST (Indian Standard Time)
// ➢ PST (Pacific Standard Time)

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {
    public static void main(String[] args) {

        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current time in GMT is");
        System.out.println(gmtTime);

        System.out.println();

        System.out.println("Current time in IST is");
        System.out.println(istTime);

        System.out.println();

        System.out.println("Current time in PST is");
        System.out.println(pstTime);
    }
}
