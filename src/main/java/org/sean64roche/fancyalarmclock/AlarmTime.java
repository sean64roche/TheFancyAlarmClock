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

//    public abstract void setYear(int year);
//
//    public abstract void setMonth(int month);
//
//    public abstract void setDay(int day);

    public abstract void setHour(int hour);

    public abstract void setMinute(int minute);

    public abstract void setSecond(int second);

//    public abstract int getYear();
//
//    public abstract int getMonth();
//
//    public abstract int getDay();

    /*
     *  Raw conversion of the given Calendar into an epoch value.
     *  This should be used over the Date representation when not being displayed.
     *  The helper builds a consistent String value to be parsed.
     */

    //  TODO Implement ParseException handling

//    public long CalendarToEpoch()  throws ParseException   {
//        return DATE_FORMAT.parse(CalendarToDateHelper()).getTime() / 1000;
//    }

    /*
     *  Parses the Calendar representation into a Date object.
     *  Utilises CalendarToEpoch as the method conveniently does a lot of the
     *  work.
     */

    //  TODO Implement ParseException handling

//    public Date CalendarToDate() throws ParseException {
//        return new Date(this.CalendarToEpoch());
//    }

    //  Builds a Date string in the format "yyyy/MM/dd hh:mm:ss", to align with
    //  the global defaultDateFormat.

//    private String CalendarToDateHelper()  {
//        return this.getYear() + "/" +
//                formatValue(this.getMonth()) + "/" +
//                formatValue(this.getDay()) + " " +
//                formatValue(this.getHour()) + ":" +
//                formatValue(this.getMinute()) + ":" +
//                formatValue(this.getSecond());
//    }

    // Appends '0' to beginning of individual values if they are less than
    // 10, as part of a String.

    private String formatValue(int value) {
        if (value < 10) {
            return "0" + value;
        } else {
            return Integer.toString(value);
        }
    }

}
