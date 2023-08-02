package com.vehicles.engines;

public class InternalCombustionEngines extends Engine{

    public InternalCombustionEngines(int modelNumber, double displacement, double maxPower, double maxRpm, double noOfCylinders) {
        super(modelNumber, displacement, maxPower, maxRpm, noOfCylinders);
    }
    public void displayChildClass1()
    {
        System.out.println("This is 1st child class");
    }
}
