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
public class BClock {
    static public Clock build(int _id, String clockType, String _name, int _price) {
        if(clockType.equals("Min")) return new ClockA(_id, _name, _price);
        else return new ClockB(_id, _name, _price);     
    }
}
