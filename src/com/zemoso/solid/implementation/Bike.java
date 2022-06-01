package com.zemoso.solid.implementation;

public class Bike implements TwoWheelerVehicle{

    private VehicleUnlock key;

    public Bike(VehicleUnlock key) {
        this.key = key;
    }

    @Override
    public void wearHelmet() {
        System.out.println("Helmet is fastened");
    }

    @Override
    public void unlockVehicle() {
        key.unlock();
    }

    @Override
    public void startVehicle() {
        System.out.println("Bike started");
    }

    @Override
    public void rideVehicle() {
        System.out.println("Riding the bike");
    }

    @Override
    public void stopVehicle() {
        System.out.println("Bike stopped");

    }
}
