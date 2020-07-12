package org.sean64roche.fancyalarmclock;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AlarmTime implements Alarm {

    /*
     * Date constructors are deprecated and have been replaced by java.util.Calendar
     *
     *
     */

    private Calendar alarmTime;
    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    //Constructors

    public AlarmTime(int year, int month, int date, int hrs, int min, int sec)   {
        this.setAlarmTime(year, month, date, hrs, min, sec);
    }

    //shouldn't be putting zeros into here. Fix later
    public AlarmTime(int date, int hrs, int min)    {
        this.setAlarmTime(0, 0, date, hrs, min, 0);
    }

    public Calendar getAlarmTime()    {
        return alarmTime;
    }

    public void setAlarmTime(int year, int month, int date, int hrs, int min, int sec)   {

        this.alarmTime = Calendar.getInstance();
        this.alarmTime.set(year, month, date, hrs, min, sec);
    }

    /*
     *   Methods for setting individual parts of the alarm, haven't been tested yet.
     *   Could be useful later.
     *
     *
     */

    public void setYear(int year) {
        this.alarmTime.set(Calendar.YEAR, year);
    }

    public void setMonth(int month) {
        this.alarmTime.set(Calendar.MONTH, month);
    }

    public void setDay(int day) {
        this.alarmTime.set(Calendar.DAY_OF_MONTH, day);
    }

    public void setHour(int hour) {
        this.alarmTime.set(Calendar.HOUR_OF_DAY, hour);
    }
    
    public void setMinute(int minute) {
        this.alarmTime.set(Calendar.MINUTE, minute);
    }

    public void setSecond(int second) {
        this.alarmTime.set(Calendar.SECOND, second);
    }

    @Override
    public int getYear() {
        return this.alarmTime.get(Calendar.YEAR);
    }

    @Override
    public int getMonth() {
        return this.alarmTime.get(Calendar.MONTH);
    }

    public int getDay() {
        return this.alarmTime.get(Calendar.DAY_OF_MONTH);
    }

    public int getHour() {
        return this.alarmTime.get(Calendar.HOUR_OF_DAY);
    }

    public int getMinute() {
        return this.alarmTime.get(Calendar.MINUTE);
    }

    public int getSecond() {
        return this.alarmTime.get(Calendar.SECOND);
    }

    /*
     *  Raw conversion of the given Calendar into an epoch value.
     *  This should be used over the Date representation when not being displayed.
     *  The helper builds a consistent String value to be parsed.
     */

    //  TODO Implement ParseException handling

    public long CalendarToEpoch()  throws ParseException   {
        return DATE_FORMAT.parse(CalendarToDateHelper()).getTime() / 1000;
    }

    /*
     *  Parses the Calendar representation into a Date object.
     *  Utilises CalendarToEpoch as the method conveniently does a lot of the
     *  dirty work.
     */

    //  TODO Implement ParseException handling

    public Date CalendarToDate() throws ParseException {
        return new Date(this.CalendarToEpoch());
    }

    //  Builds a Date string in the format "yyyy/MM/dd hh:mm:ss", to align with
    //  the global defaultDateFormat.

    private String CalendarToDateHelper()  {
        return this.getYear() + "/" +
                formatValue(this.getMonth()) + "/" +
                formatValue(this.getDay()) + " " +
                formatValue(this.getHour()) + ":" +
                formatValue(this.getMinute()) + ":" +
                formatValue(this.getSecond());
    }

    // Appends '0' to beginning of individual values if they are less than
    // 10, as part of a String.

    private String formatValue(int value)   {
        if (value < 10)    {
            return "0" + value;
        } else  {
            return Integer.toString(value);
        }
    }

}
