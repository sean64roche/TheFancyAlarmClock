package org.sean64roche.fancyalarmclock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class SingleAlarmTimeTest {

    SingleAlarmTime testAlarmTime1, testAlarmTime2, testAlarmTime3;

    // Reset the three test objects.

    @BeforeEach
    public void testInit() {
        testAlarmTime1 = new SingleAlarmTime(2020, 11, 18, 19, 30, 45);
        testAlarmTime2 = new SingleAlarmTime(1999, 2, 4, 8, 0, 0);
    }

    @Test
    void getYear() {
        assertEquals(2020, testAlarmTime1.getYear());
        assertEquals(1999, testAlarmTime2.getYear());
    }

    @Test
    void getMonth() {
        assertEquals(11, testAlarmTime1.getMonth());
        assertEquals(2, testAlarmTime2.getMonth());
    }

    @Test
    void getDate() {
        assertEquals(18, testAlarmTime1.getDate());
        assertEquals(4, testAlarmTime2.getDate());
    }

    @Test
    void getHour() {
        assertEquals(19, testAlarmTime1.getHour());
        assertEquals(8, testAlarmTime2.getHour());
    }

    @Test
    void getMinute() {
        assertEquals(30, testAlarmTime1.getMinute());
        assertEquals(0, testAlarmTime2.getMinute());
    }

    @Test
    void getSecond() {
        assertEquals(45, testAlarmTime1.getSecond());
        assertEquals(0, testAlarmTime2.getSecond());
    }

    @Test
    void getSingleAlarmTime() {
            assertAll("Test direct LocalDateTime instance variables with AlarmTime variables",
                () -> assertEquals(2020, testAlarmTime1.getYear()),
                () -> assertEquals(11, testAlarmTime1.getMonth()),
                () -> assertEquals(18, testAlarmTime1.getDate()),
                () -> assertEquals(19, testAlarmTime1.getHour()),
                () -> assertEquals(30, testAlarmTime1.getMinute()),
                () -> assertEquals(45, testAlarmTime1.getSecond()));
    }

    @Test
    void getSingleAlarmTime2() {
        assertAll("Test direct LocalDateTime instance variables with AlarmTime variables",
                () -> assertEquals(1999, testAlarmTime2.getYear()),
                () -> assertEquals(2, testAlarmTime2.getMonth()),
                () -> assertEquals(4, testAlarmTime2.getDate()),
                () -> assertEquals(8, testAlarmTime2.getHour()),
                () -> assertEquals(0, testAlarmTime2.getMinute()),
                () -> assertEquals(0, testAlarmTime2.getSecond()));
    }

    @Test
    void getDailyAlarmTime() {
        LocalTime expected = LocalTime.of(19, 30, 45);
        assertEquals(expected, testAlarmTime1.getDailyAlarmTime());
    }

    @Test
    void testSetAlarmTime1() {
        testAlarmTime3 = new SingleAlarmTime
                (2000, 4, 9, 20, 30, 0);
        testAlarmTime1.setAlarmTime(
                2000, 4, 9, 20, 30, 0
        );
        assertEquals(testAlarmTime3.toString(), testAlarmTime1.toString());
    }

    //TODO test and handle invalid datetime input.

    @Test
    void setYear() {
        testAlarmTime1.setYear(2021);
        assertEquals(2021, testAlarmTime1.getYear());
    }

    @Test
    void setMonth() {
        testAlarmTime1.setMonth(6);
        assertEquals(6, testAlarmTime1.getMonth());
    }

    @Test
    void setDate() {
        testAlarmTime1.setDate(28);
        assertEquals(28, testAlarmTime1.getDate());
    }

    @Test
    void setHour() {
        testAlarmTime1.setHour(23);
        assertEquals(23, testAlarmTime1.getHour());
    }

    @Test
    void setMinute() {
        testAlarmTime1.setMinute(0);
        assertEquals(0, testAlarmTime1.getMinute());
    }

    @Test
    void setSecond() {
        testAlarmTime1.setSecond(55);
        assertEquals(55, testAlarmTime1.getSecond());
    }

    // Testing basic behaviour.
    @Test
    void testToString() {
        String expected = "2020-11-18T19:30:45";
        assertEquals(expected, testAlarmTime1.toString());
    }

    // Testing considering test1 passes, this should also pass with
    // object manipulation.
    @Test
    void testToString2()    {
        String expected = "2020-11-18T19:30:45";
        testAlarmTime1.setDate(24);
        assertNotEquals(expected, testAlarmTime1.toString());
    }
}