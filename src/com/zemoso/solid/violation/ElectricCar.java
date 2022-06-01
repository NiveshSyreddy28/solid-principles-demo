//Lisvok Substitute
package com.zemoso.solid.violation;

public class ElectricCar extends Car {
    public ElectricCar(VehicleUnlock vehicleUnlock) {

        super(vehicleUnlock);
    }

    public void ChargeBattery(){
        System.out.println("Car Battery is being Charged");
    }
}
