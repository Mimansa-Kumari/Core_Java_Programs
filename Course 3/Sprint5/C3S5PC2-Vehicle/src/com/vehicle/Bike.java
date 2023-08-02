package com.vehicle;

public class Bike extends VehicleManufacturer implements Vehicle {

    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }


    public String getManufacturerInformation()
    {
        return "Bike{ Manufacturer name: "+super.getVehicleName()+", Model number: "+super.getVehicleModelName()+", Type: "+super.getVehicleType()+" }";
    }

    public int maxSpeed(String vehicleType)
    {
        int speed;
       if (vehicleType.equalsIgnoreCase("sports bike"))
       {
           speed=300;
       }
       else if (vehicleType.equalsIgnoreCase("cruiser"))
       {
           speed=170;
       }
       else
       {
           speed=0;
       }
       return speed;
    }
}
