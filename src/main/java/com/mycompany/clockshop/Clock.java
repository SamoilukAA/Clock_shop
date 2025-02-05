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
public interface Clock {
    String getName();
    int getPrice();
    int getId();
    String getType();
    void startTime(String _hours, String _minutes, String _seconds) throws TimeException;
    void changeTime(int _hours, int _minutes, int seconds) throws TimeException;
    void ChangeTimeOneMin();
    String printTime();
}
