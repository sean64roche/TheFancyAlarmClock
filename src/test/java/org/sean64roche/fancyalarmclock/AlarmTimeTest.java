package org.sean64roche.fancyalarmclock;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

public class AlarmTimeTest {

    AlarmTime testAlarmTime1, testAlarmTime2, testAlarmTime3;

    //  Reset the three test objects.
    @BeforeEach
    public void testInit() {
        testAlarmTime1 = new AlarmTime(2020, 11, 18, 19, 30, 45);
        testAlarmTime2 = new AlarmTime(1999, 2, 4, 8, 0, 0);
    }

    @Test
    public void getAlarmTime() {
//        assertAll("Test direct Calendar instance variables with AlarmTime variables",
//                () -> assertEquals(2020, 2020),
//                () -> assertEquals(11, testAlarmTime1.getMonth()),
//                () -> assertEquals(4, testAlarmTime1.getDay()),
//                () -> assertEquals(19, testAlarmTime1.getHour()),
//                () -> assertEquals(3, testAlarmTime1.getMinute()),
//                () -> assertEquals(45, testAlarmTime1.getSecond()));
    }

    @Test
    public void setAlarmTime() {
//        Calendar c = Calendar.getInstance();
//        c.set(2020, 6, 10, 11, 30, 0);
//
//        AlarmTime testAlarmTimeSetter = new AlarmTime(2000, 1,1, 0, 0, 0);
//        testAlarmTimeSetter.setAlarmTime(2020, 6, 10, 11, 30, 0);
//
//        assertEquals(c, testAlarmTimeSetter);
    }

    @org.junit.jupiter.api.Test
    void testGetAlarmTime() {
    }

    @org.junit.jupiter.api.Test
    void testSetAlarmTime() {
    }

    @org.junit.jupiter.api.Test
    void testSetYear() {
    }

    @org.junit.jupiter.api.Test
    void testSetMonth() {
    }

    @org.junit.jupiter.api.Test
    void testSetDay() {
    }

    @org.junit.jupiter.api.Test
    void testSetHour() {
    }

    @org.junit.jupiter.api.Test
    void testSetMinute() {
    }

    @org.junit.jupiter.api.Test
    void testSetSecond() {
    }

    @org.junit.jupiter.api.Test
    void testGetYear() {
        assertEquals(2020, testAlarmTime1.getYear());
        assertEquals(1999, testAlarmTime2.getYear());
    }

    @org.junit.jupiter.api.Test
    void testGetMonth() {
        assertEquals(11, testAlarmTime1.getMonth());
        assertEquals(2, testAlarmTime2.getMonth());
    }

    @org.junit.jupiter.api.Test
    void testGetDay() {
        assertEquals(18, testAlarmTime1.getDay());
        assertEquals(4, testAlarmTime2.getDay());
    }

    @org.junit.jupiter.api.Test
    void testGetHour() {
        assertEquals(19, testAlarmTime1.getHour());
        assertEquals(8, testAlarmTime2.getHour());
    }

    @org.junit.jupiter.api.Test
    void testGetMinute() {
        assertEquals(30, testAlarmTime1.getMinute());
        assertEquals(0, testAlarmTime2.getMinute());
    }

    @org.junit.jupiter.api.Test
    void testGetSecond() {
        assertEquals(45, testAlarmTime1.getSecond());
        assertEquals(0, testAlarmTime2.getSecond());
    }

}