package org.sean64roche.fancyalarmclock;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DailyAlarmTime extends AlarmTime {

    private int hour, minute, second;
    private LocalTime dailyAlarmTime;

    // Constructor for reoccurring alarm

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

    // Alarm setter.
    public void setAlarmTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        initLocalTime();
    }

    // TODO Do not use for the time being. To be implemented alongside View.
    public void setAlarmTime(int year, int month, int date, int hour, int minute, int second) {
        setAlarmTime(hour, minute, second);
    }

    // Setters for individual components of the time.
    // Behaviour of LocalTime object encourages this.
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

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }


    // toString of current class.
    @Override
    public String toString() {
        return "DailyAlarmTime{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                ", dailyAlarmTime=" + dailyAlarmTime +
                '}';
    }

    // n.b. LocalTime object - handled differently.
    public  String toLocalTimeString()  {
        return this.dailyAlarmTime.toString();
    }

    // Handler for setting the local LocalTime variable.
    private void initLocalTime()    {
        dailyAlarmTime = LocalTime.of(this.hour, this.minute, this.second);
    }
}
