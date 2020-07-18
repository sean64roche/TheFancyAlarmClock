package org.sean64roche.fancyalarmclock;

import java.sql.Time;
import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DailyAlarmTime extends AlarmTime {

    private int hour, minute, second;
    private LocalTime dailyAlarmTime;

    // Constructor for recurring alarm

    public DailyAlarmTime(int hour, int minute, int second) {
        setAlarmTime(hour, minute, second);
    }

    public LocalTime getDailyAlarmTime() {
        return this.dailyAlarmTime;
    }

    // TODO uses current date as a placeholder.
    @Override
    public LocalDateTime getSingleAlarmTime() {
        return this.dailyAlarmTime.atDate(LocalDate.now());
    }

    public void setAlarmTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        initLocalTime();
    }

    public void setAlarmTime(int year, int month, int date, int hour, int minute, int second) {
        setAlarmTime(hour, minute, second);
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

    public void setHour(int hour) {
        this.hour = hour;
        initLocalTime();
    }

    public void setMinute(int minute) {
        this.minute = minute;
        initLocalTime();
    }

    public void setSecond(int second) {
        this.second = second;
        initLocalTime();
    }

    @Override
    public String toString() {
        return "DailyAlarmTime{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                ", dailyAlarmTime=" + dailyAlarmTime +
                '}';
    }

    private void initLocalTime()    {
        dailyAlarmTime = LocalTime.of(this.hour, this.minute, this.second);
    }
}
