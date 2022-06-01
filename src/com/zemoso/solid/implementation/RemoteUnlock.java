//Dependency Inversion
package com.zemoso.solid.implementation;

public class RemoteUnlock implements VehicleUnlock {

    @Override
    public void unlock() {

        System.out.println("Lock opened with remote");
    }
}
