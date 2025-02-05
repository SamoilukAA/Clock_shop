/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clockshop;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Lenovo
 */
public class Model {
    transient int id = 0;
    
    ArrayList<Clock> clocks = new ArrayList<>();
    transient ArrayList<IObserver> allO = new ArrayList<>();
    
    void refrash() {
        for(IObserver iObserver : allO) {
            iObserver.refrash();
        }
    }
    
    public Iterator<Clock> getAllClock() {
        return clocks.iterator();
    }
    
    void addObserver(IObserver o) {
        allO.add(o);
    }
    
    public void addClock(Clock c) {
        id++;
        clocks.add(c);
        refrash();
    }
    
    public Clock getClock(int id) {
        return clocks.get(id);
    }
    
    public int getId() {
        return id;
    }
}
