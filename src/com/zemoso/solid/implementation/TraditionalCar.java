package com.zemoso.solid.implementation;

public class TraditionalCar extends Car{

    public TraditionalCar(VehicleUnlock openLock) {
        super(openLock);
    }
    public void fillFuel(){
        System.out.println("Filling fuel");
    }
}
