package org.sean64roche.fancyalarmclock;

import java.sql.Time;
import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DailyAlarmTime extends AlarmTime {

    private int hour, minute, second;
    private LocalTime dailyAlarmTime;

    public DailyAlarmTime(int hour, int minute, int second) {
        setAlarmTime(hour, minute, second);
    }

    public LocalTime getDailyAlarmTime() {
        return this.dailyAlarmTime;
    }

    // TODO uses current date as a placeholder.
    @Override
    public LocalDateTime getSingleAlarmTime() {
        return dailyAlarmTime.atDate(LocalDate.now());
    }

    public void setAlarmTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        dailyAlarmTime = LocalTime.of(hour, minute, second);
    }

    @Override
    public void setAlarmTime(int year, int month, int date, int hour, int minute, int second) {
        setAlarmTime(hour, minute, second);
    }


    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    @Override
    public String toString() {
        return this.dailyAlarmTime.toString();
    }
}
