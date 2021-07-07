package stomp.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringUtils {

    private static final String TIME_FORMATTER= "HH:mm:ss";

    private StringUtils() {}

    public static String getCurrentTimeStamp() {
        var formatter = DateTimeFormatter.ofPattern(TIME_FORMATTER);
        return LocalDateTime.now().format(formatter);
    }

}