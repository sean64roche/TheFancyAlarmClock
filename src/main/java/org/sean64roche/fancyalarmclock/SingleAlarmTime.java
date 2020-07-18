package org.sean64roche.fancyalarmclock;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.InvalidPropertiesFormatException;

public class SingleAlarmTime extends AlarmTime   {

    private int year, month, date, hour, minute, second;
    private LocalDateTime singleAlarmTime;

    // TODO everything!
    public SingleAlarmTime(int year, int month, int date, int hour, int minute, int second) {
        setAlarmTime(year, month, date, hour, minute, second);
    }

    @Override
    public LocalDateTime getSingleAlarmTime() {
        return this.singleAlarmTime;
    }

    // Returns current alarm as instance of DailyAlarmTime

    @Override
    public LocalTime getDailyAlarmTime() {
        return LocalTime.of(this.hour, this.minute, this.second);
    }

    // Alarm setter.

    public void setAlarmTime(int year, int month, int date, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        initLocalDateTime();
    }

    // Setters for individual components of the date.
    // Behaviour of LocalDateTime object encourages this.

    public void setYear(int year)   {
        this.year = year;
        initLocalDateTime();
    }

    public void setMonth(int month) {
        this.month = month;
        initLocalDateTime();
    }

    public void setDate(int date)   {
        this.date = date;
        initLocalDateTime();
    }

    @Override
    public void setHour(int hour) {
        this.hour = hour;
        initLocalDateTime();
    }

    @Override
    public void setMinute(int minute) {
        this.minute = minute;
        initLocalDateTime();
    }

    @Override
    public void setSecond(int second) {
        this.second = second;
        initLocalDateTime();
    }

    // Getters.

    public int getYear()    {
        return this.year;
    }

    public int getMonth()   {
        return this.month;
    }

    public int getDate()    {
        return this.date;
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

    // toString of current object.

    @Override
    public String toString() {
        return singleAlarmTime.toString();
    }

    // Handler for setting the local LocalDateTime variable.
    private void initLocalDateTime()    {
        singleAlarmTime = LocalDateTime.of
                (this.year, this.month, this.date, this.hour, this.minute, this.second);
    }

}
