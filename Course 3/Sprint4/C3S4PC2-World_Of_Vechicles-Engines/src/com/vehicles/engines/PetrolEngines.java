package com.vehicles.engines;

public class PetrolEngines extends InternalCombustionEngines{
    public String engineNamePetrol;

    public PetrolEngines(int modelNumber, double displacement, double maxPower, double maxRpm, double noOfCylinders, String engineNamePetrol) {
        super(modelNumber, displacement, maxPower, maxRpm, noOfCylinders);
        this.engineNamePetrol = engineNamePetrol;
    }

    public String getEngineNamePetrol() {
        return engineNamePetrol;
    }

    public void setEngineNamePetrol(String engineNamePetrol) {
        this.engineNamePetrol = engineNamePetrol;
    }

    public void displayPetrolDetails()
    {
        System.out.println("Petrol Engine Details : ");
        System.out.println("This is 2nd child class");
        System.out.println("Model Number : "+super.getModelNumber());
        System.out.println("Displacement : "+super.getDisplacement());
        System.out.println("Max Power : "+super.getMaxPower());
        System.out.println("Max RPM : "+super.getMaxRpm());
        System.out.println("No of Cylinders : "+super.getNoOfCylinders());
        System.out.println("Engine Name : "+getEngineNamePetrol());
    }
}
