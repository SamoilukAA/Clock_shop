/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clockshop;

/**
 *
 * @author Lenovo
 */
abstract public class ClockSec extends ClockMin {
    protected int seconds;
    @Override
    abstract public String getName();
    @Override
    abstract public int getPrice();
    @Override
    abstract public int getId();
    @Override
    abstract public String getType();
    @Override
    public void startTime(String _hours, String _minutes, String _seconds) throws TimeException {
        int h = Integer.parseInt(_hours.trim());
        int m = Integer.parseInt(_minutes.trim());
        int s = Integer.parseInt(_seconds.trim());
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) throw new TimeException("Неправильное время");
        hours = h;
        minutes = m;
        seconds = s;
    }
    @Override
    public void changeTime(int _hours, int _minutes, int _seconds) throws TimeException {
        if (_hours < 0 || _hours > 23 || _minutes < 0 || _minutes > 59 || _seconds < 0 || _seconds > 59) throw new TimeException("Неправильное время");
        seconds += _seconds;
        if(seconds > 59)
       {
           seconds -= 60;
           minutes++;
        minutes += _minutes;
       if(minutes > 59)
       {
           minutes -= 60;
           hours++;
       }
       hours += _hours;
       if(hours > 23)
           hours -= 24; 
       }
    }
    @Override
    public String printTime() {
        String s;
        if (minutes < 10 || seconds < 10) {
            if (seconds < 10 && minutes >= 10)
                return s = hours + ":" + minutes + ":0" + seconds;
            if (minutes < 10 && seconds > 10)
                return s = hours + ":0" + minutes + ":" + seconds;
            if (minutes < 10 && seconds < 10)
                return s = hours + ":0" + minutes + ":0" + seconds;
            }
        return s = hours + ":" + minutes + ":" + seconds;
    }
}
