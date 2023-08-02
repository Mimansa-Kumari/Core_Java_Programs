package com.vehicle;

public class VehicleServices {
    public static void main(String[] args) {

        Bike bike = new Bike("Indian Road Master","Roadmaster limited","cruiser");
        bike.getManufacturerInformation();
        Vehicle bike1 = new Bike("Indian Road Master","Roadmaster limited","cruiser");
        bike1.maxSpeed("cruiser");
        System.out.println("Bike type is "+bike.getVehicleType() +" its speed is "+bike1.maxSpeed("cruiser"));

        Car car = new Car("BMW","hkhk","sedan");
        car.getManufacturerInformation();
        Vehicle car1 = new Car("BMW","hkhk","sedan");

        System.out.println("Car type is "+car.getVehicleType() +" its speed is "+car1.maxSpeed("sedan"));

    }
}
