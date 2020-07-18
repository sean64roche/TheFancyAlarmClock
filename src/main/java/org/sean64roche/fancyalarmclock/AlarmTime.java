package org.sean64roche.fancyalarmclock;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public abstract class AlarmTime {

    /*
     * Date constructors are deprecated and have been replaced
     * by java.util.Calendar,
     * and java.util.Calendar has been replaced by java.time
     *
     */

    // Universal String date format - may not be used.

    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public abstract LocalDateTime getSingleAlarmTime();

    public abstract LocalTime getDailyAlarmTime();

    public abstract int getHour();

    public abstract int getMinute();

    public abstract int getSecond();

    public abstract void setHour(int hour);

    public abstract void setMinute(int minute);

    public abstract void setSecond(int second);

    /* Appends '0' to beginning of individual values if they are less than
     * 10, as part of a String.
     *
     * Not currently implemented.
    */

    private String formatValue(int value) {
        if (value < 10) {
            return "0" + value;
        } else {
            return Integer.toString(value);
        }
    }

}
