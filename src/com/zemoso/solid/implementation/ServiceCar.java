//Single Responsibility
package com.zemoso.solid.implementation;

public class ServiceCar implements ServiceVehicle{
    @Override
    public void service() {

        System.out.println("Servicing the Car");
    }
}
