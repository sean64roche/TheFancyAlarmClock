package org.sean64roche.fancyalarmclock;

import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class DailyAlarmTime implements Alarm {

    private int hour, minute, second;
    private Time dailyAlarmTime;

    public DailyAlarmTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public int getHour() {
        return this.hour;
    }

    @Override
    public int getMinute() {
        return this.minute;
    }

    @Override
    public int getSecond() {
        return this.second;
    }

//     TODO implement this later
//    public AlarmTime toAlarmTime()  {
//        return new AlarmTime(2000, 1, 1, this.hour, this.minute, this.second);
//    }
}
