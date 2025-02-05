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
public class ClockB extends ClockSec {
    String type;
    int id;
    
    ClockB(int _id, String _name, int _price)
    {
        type = "Sec";
        hours = 0;
        minutes = 0;
        seconds = 0;
        id = _id;
        name = _name;
        price = _price;
    }
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public String getName() { return name; }
    @Override
    public int getPrice() { return price; }
    @Override
    public String getType() { return type; }
    
    @Override
    public String toString() {
    return "Name: " + name + ", price: " + price;
  }
}
