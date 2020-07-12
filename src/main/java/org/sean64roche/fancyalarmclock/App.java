package org.sean64roche.fancyalarmclock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Hello world!
 *
 */
public class App implements ActionListener {

    public static void main(String[] args) throws ParseException {

        AlarmTime testAlarm = new AlarmTime(2020, 1, 4, 9, 37, 0);

        String storedDate = AlarmTime.DATE_FORMAT.format(new Date());
        System.out.println(storedDate);

        // Format the date into yyyy/mm/dd while also converting the
        // Calendar representation into a Date object.

        AlarmTime.DATE_FORMAT.format(testAlarm.CalendarToDate());
        System.out.println(testAlarm);

        Timer testTimer = new Timer();
        TimerTask taskNew = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Ring Ring, Alarm!");
            }
        };
        testTimer.schedule(taskNew, new Date());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("WOT");
    }

}

