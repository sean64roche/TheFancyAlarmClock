package org.sean64roche.fancyalarmclock;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.InvalidPropertiesFormatException;

public class SingleAlarmTime extends AlarmTime   {

    private int year, month, date, hour, minute, second;
    private LocalDateTime singleAlarmTime;

    // TODO everything!
    public SingleAlarmTime(int year, int month, int date, int hour, int minute, int second) {

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

    public void setAlarmTime(int year, int month, int date, int hour, int minute, int second) {
        singleAlarmTime = LocalDateTime.of(year, month, date, hour, minute, second);
    }

    @Override
    public void setHour(int hour) {

    }

    @Override
    public void setMinute(int minute) {

    }

    @Override
    public void setSecond(int second) {

    }

    @Override
    public int getHour() {
        return 0;
    }

    @Override
    public int getMinute() {
        return 0;
    }

    @Override
    public int getSecond() {
        return 0;
    }

    @Override
    public String toString() {
        return singleAlarmTime.toString();
    }

}
