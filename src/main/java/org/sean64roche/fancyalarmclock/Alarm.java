package org.sean64roche.fancyalarmclock;

/*
* Base interface for generating an alarm. Will later be modified to include methods
* for extra tasks.
* */

import java.util.Calendar;

public interface Alarm {

    Calendar getAlarmTime();
    void setAlarmTime(int year, int month, int date, int hrs, int min);
    void setDay(int day);
    void setHour(int hour);
    void setMinute(int minute);
}
