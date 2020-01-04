package org.sean64roche.fancyalarmclock;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.Calendar;
import java.util.TimerTask;

/**
 * Hello world!
 *
 */
public class App implements ActionListener {

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        AlarmTime TestAlarm = new AlarmTime(2020, 1, 4, 9, 37);

        String storedDate = dateFormat.format(new Date());
        System.out.println(storedDate);

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
        System.out.println("Ring Ring, Alarm!");
    }

}

