//Dependency Inversion
package com.zemoso.solid.violation;

public class VehicleUnlock {

    public void keyUnlock() {
        System.out.println("Unlocked with key");
    }

    public void remoteUnlock(){
        System.out.println("Unlocked with remote");
    }
}
