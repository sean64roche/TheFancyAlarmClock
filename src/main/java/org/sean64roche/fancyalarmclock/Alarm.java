package org.sean64roche.fancyalarmclock;

/*
* Base interface for generating an alarm. Will later be modified to include methods
* for extra tasks.
* */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public interface Alarm {

    Calendar getAlarmTime();
    void setAlarmTime(int year, int month, int date, int hrs, int min, int sec);
    void setYear(int year);
    void setMonth(int month);
    void setDay(int day);
    void setHour(int hour);
    void setMinute(int minute);
    void setSecond(int second);
    int getYear();
    int getMonth();
    int getDay();
    int getHour();
    int getMinute();
    int getSecond();
}
