package com.Transmission;

public class AutomaticCVT extends Transmission{

    private double fifthGearRatio;
    private double sixthGearRatio;

    public AutomaticCVT(String transmissionType, String modelNumber, String forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double forthGearRatio, double fifthGearRatio, double sixthGearRatio) {
        super(transmissionType, modelNumber, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, forthGearRatio);
        this.fifthGearRatio = fifthGearRatio;
        this.sixthGearRatio = sixthGearRatio;
    }

    public  void showSpecs()
    {
       super.showSpecs();
        System.out.println("6. 5th Gear Ratio : "+fifthGearRatio);
        System.out.println("7. 6th Gear Ratio : "+sixthGearRatio);
    }
}
