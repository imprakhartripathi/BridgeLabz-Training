package functional_interfaces;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

interface DateUtils {

    static String formatWithOrdinalAndTime(ZonedDateTime dateTime) {
        int day = dateTime.getDayOfMonth();

        String suffix =
                (day >= 11 && day <= 13) ? "th" :
                        switch (day % 10) {
                            case 1 -> "st";
                            case 2 -> "nd";
                            case 3 -> "rd";
                            default -> "th";
                        };

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy - hh:mm a (z 'UTC' XXX)");

        return dateTime.format(formatter)
                .replaceFirst(String.valueOf(day),
                        day + suffix);
    }
}

public class DateFormatterDemo {
    public static void main(String[] args) {
        ZonedDateTime nowIST =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        System.out.println(
                DateUtils.formatWithOrdinalAndTime(nowIST)
        );
    }
}
