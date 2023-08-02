package com.vehicle;

public class Car extends VehicleManufacturer implements Vehicle{

    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }


    public String getManufacturerInformation()
    {
        return "Car{ Manufacturer name: "+super.getVehicleName()+", Model number: "+super.getVehicleModelName()+", Type: "+super.getVehicleType()+" }";
    }

    public int maxSpeed(String vehicleType) {
        int speed;
        if (vehicleType.equalsIgnoreCase("sports car")) {
            return speed = 250;
        } else if (vehicleType.equalsIgnoreCase("sedan")) {
            return speed = 170;
        } else {
            return speed = 0;
        }
    }
}
