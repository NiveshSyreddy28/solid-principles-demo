package com.zemoso.solid.implementation;

public class VehicleDemo {
    public static void main(String[] args) {
        VehicleUnlock remoteLock = new RemoteUnlock();
        FourWheelerVehicle myCar = new Car(remoteLock);

        myCar.unlockVehicle();
        myCar.fastenSeatBelt();
        myCar.startVehicle();
        myCar.rideVehicle();
        myCar.turnOnAc();
        myCar.turnOnRadio();
        myCar.stopVehicle();

        System.out.println("\n*********************\n");

        VehicleUnlock keyLock = new KeyUnlock();
        TwoWheelerVehicle myBike = new Bike(keyLock);

        myBike.unlockVehicle();
        myBike.wearHelmet();
        myBike.startVehicle();
        myBike.rideVehicle();
        myBike.stopVehicle();


    }
}
