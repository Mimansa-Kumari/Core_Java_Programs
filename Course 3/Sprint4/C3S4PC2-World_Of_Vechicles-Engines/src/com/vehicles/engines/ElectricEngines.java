package com.vehicles.engines;

public class ElectricEngines extends InternalCombustionEngines{
    public String engineNameElectric;
    public String specificationOfElectric;
    public double voltage;

    public ElectricEngines(int modelNumber, double displacement, double maxPower, double maxRpm, double noOfCylinders, String engineNameElectric, String specificationOfElectric, double voltage) {
        super(modelNumber, displacement, maxPower, maxRpm, noOfCylinders);
        this.engineNameElectric = engineNameElectric;
        this.specificationOfElectric = specificationOfElectric;
        this.voltage = voltage;
    }

    public String getEngineNameElectric() {
        return engineNameElectric;
    }

    public void setEngineNameElectric(String engineNameElectric) {
        this.engineNameElectric = engineNameElectric;
    }

    public String getSpecificationOfElectric() {
        return specificationOfElectric;
    }

    public void setSpecificationOfElectric(String specificationOfElectric) {
        this.specificationOfElectric = specificationOfElectric;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public void displayElectricDetails()
    {
        System.out.println("Electric Engine Details : ");
        System.out.println("This 5th child class");
        System.out.println("Model Number : "+super.getModelNumber());
        System.out.println("Displacement : "+super.getDisplacement());
        System.out.println("Max Power : "+super.getMaxPower());
        System.out.println("Max RPM : "+super.getMaxRpm());
        System.out.println("Engine Name : "+getEngineNameElectric());
        System.out.println("Engine specification : "+getSpecificationOfElectric());
        System.out.println("Voltage : "+getVoltage());
    }
}
