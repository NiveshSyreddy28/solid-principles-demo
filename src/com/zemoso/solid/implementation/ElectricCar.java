//Lisvok Substitute
package com.zemoso.solid.implementation;

public class ElectricCar extends Car{
    public ElectricCar(VehicleUnlock openLock) {
        super(openLock);
    }

    public void ChargeBattery(){
        System.out.println("Car Battery is being Charged");
    }
}
