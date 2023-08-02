package com.vehicles.engines;

public class CNGEngines extends InternalCombustionEngines{
    public String engineNameCNG;
    public String specificationOfCNG;

    public CNGEngines(int modelNumber, double displacement, double maxPower, double maxRpm, double noOfCylinders, String engineNameCNG, String specificationOfCNG) {
        super(modelNumber, displacement, maxPower, maxRpm, noOfCylinders);
        this.engineNameCNG = engineNameCNG;
        this.specificationOfCNG = specificationOfCNG;
    }

    public String getEngineNameCNG() {
        return engineNameCNG;
    }

    public void setEngineNameCNG(String engineNameCNG) {
        this.engineNameCNG = engineNameCNG;
    }

    public String getSpecificationOfCNG() {
        return specificationOfCNG;
    }

    public void setSpecificationOfCNG(String specificationOfCNG) {
        this.specificationOfCNG = specificationOfCNG;
    }


    public void displayCNGDetails()
    {
        System.out.println("CNG Engine Details : ");
        System.out.println("This 4th child class");
        System.out.println("Model Number : "+super.getModelNumber());
        System.out.println("Displacement : "+super.getDisplacement());
        System.out.println("Max Power : "+super.getMaxPower());
        System.out.println("Max RPM : "+super.getMaxRpm());
        System.out.println("No of Cylinders : "+super.getNoOfCylinders());
        System.out.println("Engine Name : "+getEngineNameCNG());
        System.out.println("Engine specification : "+getSpecificationOfCNG());
    }

}
