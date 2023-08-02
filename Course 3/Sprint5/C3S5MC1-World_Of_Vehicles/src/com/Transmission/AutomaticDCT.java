package com.Transmission;

public class AutomaticDCT extends Transmission{
    private double fifthGearRatio;
    private double sixthGearRatio;
    private double seventhGearRatio;
    private double eightGearRatio;

    public AutomaticDCT(String transmissionType, String modelNumber, String forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double forthGearRatio, double fifthGearRatio, double sixthGearRatio, double seventhGearRatio, double eightGearRatio) {
        super(transmissionType, modelNumber, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, forthGearRatio);
        this.fifthGearRatio = fifthGearRatio;
        this.sixthGearRatio = sixthGearRatio;
        this.seventhGearRatio = seventhGearRatio;
        this.eightGearRatio = eightGearRatio;
    }

    public  void showSpecs()
    {
        super.showSpecs();
        System.out.println("6. 5th Gear Ratio : "+fifthGearRatio);
        System.out.println("7. 6th Gear Ratio : "+sixthGearRatio);
        System.out.println("8. 7th Gear Ratio : "+seventhGearRatio);
        System.out.println("8. 7th Gear Ratio : "+eightGearRatio);
    }
}
