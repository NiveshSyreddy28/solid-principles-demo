// Opn Close Principle
package com.zemoso.solid.implementation;

public class RaceCar extends TraditionalCar{
    public RaceCar(VehicleUnlock openLock) {
        super(openLock);
    }

    public void ActivateNitroBoost(){
        System.out.println("Nitro Boosts Activated successfully");
        System.out.println("Now you are ready to race");
    }

}
