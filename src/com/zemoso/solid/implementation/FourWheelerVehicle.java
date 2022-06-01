//Interface Segregation
package com.zemoso.solid.implementation;

public interface FourWheelerVehicle extends Vehicle{
    public void fastenSeatBelt();
    public void turnOnRadio();
    public void turnOnAc();
}
