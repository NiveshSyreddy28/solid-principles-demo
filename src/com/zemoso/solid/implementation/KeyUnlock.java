//Dependency Inversion
package com.zemoso.solid.implementation;

public class KeyUnlock implements VehicleUnlock{
    @Override
    public void unlock() {
        System.out.println("Lock opened with Key");
    }
}
