package com.vehicles.engines;
public class Engine {
public int modelNumber;
public double displacement;
public double maxPower;
public double maxRpm;
public double noOfCylinders;

    public Engine(int modelNumber, double displacement, double maxPower, double maxRpm, double noOfCylinders) {
        this.modelNumber = modelNumber;
        this.displacement = displacement;
        this.maxPower = maxPower;
        this.maxRpm = maxRpm;
        this.noOfCylinders = noOfCylinders;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public double getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
    }

    public double getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(double maxRpm) {
        this.maxRpm = maxRpm;
    }

    public double getNoOfCylinders() {
        return noOfCylinders;
    }

    public void setNoOfCylinders(double noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }
    public void displayParentClass()
    {
        System.out.println("This is Parent class");
    }
}
