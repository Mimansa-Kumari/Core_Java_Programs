package com.vehicles.engines;

public class ElectricEnginesImpl {
    public static void main(String[] args) {

        Engine engine = new Engine(67891,58.2,66.0,52.0,9.0);
        InternalCombustionEngines internalCombustionEngines = new InternalCombustionEngines(67890,38.2,64.0,50.0,5.0);
        PetrolEngines petrolEngines = new PetrolEngines(67891,58.2,66.0,52.0,9.0,"Petrol");
        DieselEngines dieselEngines = new DieselEngines(67892,59.2,96.0,42.0,5.0,"Diesel");
        CNGEngines cngEngines = new CNGEngines(67893,60.2,46.0,72.0,7.0,"Petrol","Environment friendly");
        ElectricEngines electricEngines = new ElectricEngines(67894,57.2,76.0,22.0,4.0,"Electric","Zero Emission",22.9);



        engine.displayParentClass();
        System.out.println();

        internalCombustionEngines.displayChildClass1();
        System.out.println();

        petrolEngines.displayPetrolDetails();
        System.out.println();


        dieselEngines.displayDieselDetails();
        System.out.println();


        cngEngines.displayCNGDetails();
        System.out.println();


        electricEngines.displayElectricDetails();
    }
}
