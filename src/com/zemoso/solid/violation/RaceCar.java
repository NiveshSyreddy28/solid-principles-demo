// Opn Close Principle
package com.zemoso.solid.violation;

public class RaceCar extends Car {
    public RaceCar(VehicleUnlock openLock) {
        super(openLock);
    }

    public void ActivateNitroBoost(){
        System.out.println("Nitro Boosts Activated successfully");
        System.out.println("Now you are ready to race");
    }

}
