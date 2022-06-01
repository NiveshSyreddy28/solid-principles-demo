//Interface Segregation
package com.zemoso.solid.violation;

public interface Vehicle {
    public void unlockVehicle();

    public void wearHelmet();

    public void fastenSeatBelt();

    public void startVehicle();

    public void rideVehicle();

    public void turnOnRadio();

    public void turnOnAc();

    public void stopVehicle();

    public void service();
}
