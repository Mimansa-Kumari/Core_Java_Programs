package com.Transmission;

public class ManualTransmission extends Transmission{

    private double fifthGearRatio;
    private float fifthGearRatioInFloat;
    private double sixthGearRatio;
    private float sixthGearRatioInFloat;

    public ManualTransmission(String transmissionType, String modelNumber, String forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double forthGearRatio) {
        super(transmissionType, modelNumber, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, forthGearRatio);
    }

    public ManualTransmission(String transmissionType, String modelNumber, String forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double forthGearRatio, double fifthGearRatio) {
        super(transmissionType, modelNumber, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, forthGearRatio);
        this.fifthGearRatio = fifthGearRatio;
    }

    public ManualTransmission(String transmissionType, String modelNumber, String forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double forthGearRatio, double fifthGearRatio, double sixthGearRatio) {
        super(transmissionType, modelNumber, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, forthGearRatio);
        this.fifthGearRatio = fifthGearRatio;
        this.sixthGearRatio = sixthGearRatio;
    }

    public ManualTransmission(String transmissionType, String modelNumber, String forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double forthGearRatio, float fifthGearRatioInFloat) {
        super(transmissionType, modelNumber, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, forthGearRatio);
        this.fifthGearRatioInFloat = fifthGearRatioInFloat;
    }

    public ManualTransmission(String transmissionType, String modelNumber, String forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double forthGearRatio, float fifthGearRatioInFloat, float sixthGearRatioInFloat) {
        super(transmissionType, modelNumber, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, forthGearRatio);
        this.fifthGearRatioInFloat = fifthGearRatioInFloat;
        this.sixthGearRatioInFloat = sixthGearRatioInFloat;
    }

    public void showSpecs()
    {
        if (getModelNumber().equalsIgnoreCase("MP4"))
        {
            super.showSpecs();
        }
        else if (getModelNumber().equalsIgnoreCase("MP5"))
        {
            super.showSpecs();
            System.out.println("6. 5th Gear Ratio : "+fifthGearRatio);
        }
       else if (getModelNumber().equalsIgnoreCase("MP6"))
        {
            super.showSpecs();
            System.out.println("6. 5th Gear Ratio : "+fifthGearRatio);
            System.out.println("7. 6th Gear Ratio : "+sixthGearRatio);
        }
       else if (getModelNumber().equalsIgnoreCase("MD5"))
        {
            super.showSpecs();
            System.out.println("6. 5th Gear Ratio : "+fifthGearRatioInFloat);
        }
       else
        {
            super.showSpecs();
            System.out.println("6. 5th Gear Ratio : "+fifthGearRatioInFloat);
            System.out.println("7. 6th Gear Ratio : "+sixthGearRatioInFloat);
        }
    }

}
