package com.Transmission;

public class AMT extends Transmission {
    private double fifthGearRatio;

    public AMT(String transmissionType, String modelNumber, String forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double forthGearRatio) {
        super(transmissionType, modelNumber, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, forthGearRatio);
    }
    public AMT(String transmissionType, String modelNumber, String forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double forthGearRatio, double fifthGearRatio) {
        super(transmissionType, modelNumber, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, forthGearRatio);
        this.fifthGearRatio = fifthGearRatio;
    }


    public void showSpecs() {
        if (getModelNumber().equalsIgnoreCase("AMTP4"))
        {
            super.showSpecs();
        }
        else
        {
            super.showSpecs();
            System.out.println("5. 4th Gear Ratio : "+fifthGearRatio);
        }
    }
}
