package org.sean64roche.fancyalarmclock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class DailyAlarmTimeTest {

    DailyAlarmTime testAlarmTime1, testAlarmTime2, testAlarmTime3;

    @BeforeEach
    public void testInit() {
        testAlarmTime1 = new DailyAlarmTime(14, 13, 44);
        testAlarmTime2 = new DailyAlarmTime(0, 0, 0);
    }

    @Test
    void getDailyAlarmTime() {
        LocalTime expected = LocalTime.of(14, 13, 44);
        assertEquals(expected,
                testAlarmTime1.getDailyAlarmTime());
    }

    // Not fully implemented.
    @Test
    void getSingleAlarmTime() {
    }

    @Test
    void setAlarmTime() {
        testAlarmTime3 = new DailyAlarmTime(20, 45, 0);
        testAlarmTime1.setAlarmTime(20, 45, 0);
        assertEquals(testAlarmTime3.toString(), testAlarmTime1.toString());
    }

    // TODO Don't use this yet.
    @Test
    void testSetAlarmTime() {

    }

    @Test
    void getHour() {
        assertEquals(14, testAlarmTime1.getHour());
        assertEquals(0, testAlarmTime2.getHour());
    }

    @Test
    void getMinute() {
        assertEquals(13, testAlarmTime1.getMinute());
        assertEquals(0, testAlarmTime2.getMinute());
    }

    @Test
    void getSecond() {
        assertEquals(44, testAlarmTime1.getSecond());
        assertEquals(0, testAlarmTime2.getSecond());
    }

    @Test
    void setHour() {
        testAlarmTime1.setHour(4);
        assertEquals(4, testAlarmTime1.getHour());
    }

    @Test
    void setMinute() {
        testAlarmTime1.setMinute(1);
        assertEquals(1, testAlarmTime1.getMinute());
    }

    @Test
    void setSecond() {
        testAlarmTime1.setSecond(0);
        assertEquals(0, testAlarmTime1.getSecond());
    }
}