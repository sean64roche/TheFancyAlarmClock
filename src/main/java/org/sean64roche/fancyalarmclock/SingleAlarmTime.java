package org.sean64roche.fancyalarmclock;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class SingleAlarmTime extends AlarmTime   {

    // TODO everything!
    public SingleAlarmTime(int year, int month, int date, int hrs, int min, int sec) {

    }

    @Override
    public LocalDateTime getSingleAlarmTime() {
        return null;
    }

    @Override
    public LocalTime getDailyAlarmTime() {
        return null;
    }

    @Override
    public void setAlarmTime(int hour, int min, int sec) {

    }

    @Override
    public void setAlarmTime(int year, int month, int date, int hour, int min, int sec) {

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
        return null;
    }

}
