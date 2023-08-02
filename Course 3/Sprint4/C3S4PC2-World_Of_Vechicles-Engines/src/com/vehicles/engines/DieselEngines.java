package com.vehicles.engines;

public class DieselEngines extends InternalCombustionEngines {
    public String engineNameDiesel;

    public DieselEngines(int modelNumber, double displacement, double maxPower, double maxRpm, double noOfCylinders, String engineNameDiesel) {
        super(modelNumber, displacement, maxPower, maxRpm, noOfCylinders);
        this.engineNameDiesel = engineNameDiesel;
    }

    public String getEngineNameDiesel() {
        return engineNameDiesel;
    }

    public void setEngineNameDiesel(String engineNameDiesel) {
        this.engineNameDiesel = engineNameDiesel;
    }

    public void displayDieselDetails()
        {
            System.out.println("Diesel Engine Details : ");
            System.out.println("This 3rd child class");
            System.out.println("Model Number : "+super.getModelNumber());
            System.out.println("Displacement : "+super.getDisplacement());
            System.out.println("Max Power : "+super.getMaxPower());
            System.out.println("Max RPM : "+super.getMaxRpm());
            System.out.println("No of Cylinders : "+super.getNoOfCylinders());
            System.out.println("Engine Name : "+getEngineNameDiesel());
        }

}
