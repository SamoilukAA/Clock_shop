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
abstract public class ClockMin implements Clock{
    protected int price, hours, minutes;
    protected String name;
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
        if (h < 0 || h > 24 || m < 0 || m > 59) throw new TimeException("Неправильное время!");
        hours = h;
        minutes = m;
    }
    
    @Override
    public void changeTime(int _hours, int _minutes, int _seconds) throws TimeException
    {
       if (_seconds != 0) throw new TimeException("Нет секундной стрелки!");
       if (_hours < 0 || _minutes < 0) throw new TimeException("Неправильное время!");
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
    
    @Override
    public void ChangeTimeOneMin()
    {
        minutes++;
        if(minutes > 59)
       {
           minutes -= 60;
           hours++;
       }
        if(hours > 23)
           hours -= 24;
    }
    @Override
    public String printTime() {
        String s;
        if (minutes < 10){
            s = hours +":0" + minutes;
            return s;
        }
        else {
            s = hours + ":" + minutes;
            return s;
        }
    }
}
