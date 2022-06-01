//Single Responsibility
package com.zemoso.solid.implementation;

public class Car implements FourWheelerVehicle{

    //Low-level design
    private VehicleUnlock vehicleUnlock;
    public Car(VehicleUnlock openLock) {

        this.vehicleUnlock = openLock;
    }

    public void unlockVehicle(){

        vehicleUnlock.unlock();
    }
    @Override
    public void fastenSeatBelt() {

        System.out.println("Seat belt fastened");
    }

    @Override
    public void startVehicle() {
        System.out.println("Car Started");
    }

    @Override
    public void rideVehicle() {
        System.out.println("Riding the Car");
    }
    @Override
    public void turnOnRadio() {
        System.out.println("Radio turned On");
    }

    @Override
    public void turnOnAc() {
        System.out.println("AC turned On");
    }

    @Override
    public void stopVehicle() {

        System.out.println("Car Stopped");
    }



}
