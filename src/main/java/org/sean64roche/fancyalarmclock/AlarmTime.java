package org.sean64roche.fancyalarmclock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
public class AlarmTime implements Alarm {

    /*
     * Date constructors are deprecated and have been replaced by java.util.Calendar
     *
     *
     */

    //Constructors

    public AlarmTime(int year, int month, int date, int hrs, int min)   {
        this.setAlarmTime(year, month, date, hrs, min);
    }

    //shouldn't be putting zeros into here. Need to find out how to keep this type-safe
    public AlarmTime(int date, int hrs, int min)    {
        this.setAlarmTime(0, 0, date, hrs, min);
    }

    private Calendar alarmTime;

    @Override
    public Calendar getAlarmTime()    {
        return alarmTime;
    }

    @Override
    public void setAlarmTime(int year, int month, int date, int hrs, int min)   {

        Calendar newAlarmTime = Calendar.getInstance();
        newAlarmTime.set(year, month, date, hrs, min);
        this.alarmTime = newAlarmTime;
    }

    /*
    *   Methods for setting individual parts of the alarm, haven't been tested yet.
    *   Could be useful later.
    *   No getters yet (will they be needed?)
    *
    */

    @Override
    public void setDay(int day) {
        alarmTime.set(Calendar.DAY_OF_MONTH, day);
    }

    @Override
    public void setHour(int hour) {
        alarmTime.set(Calendar.HOUR_OF_DAY, hour);
    }

    @Override
    public void setMinute(int minute) {
        alarmTime.set(Calendar.MINUTE, minute);
    }

    //parses in the wrong format currently.
    public static Date CalendarToDate() throws ParseException {
        long date = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse("01/01/1970 01:00:00").getTime() / 1000;
        return new Date(date);
    }
}
