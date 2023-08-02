package com.Transmission;

public class Transmission {
    private String transmissionType;
    private String modelNumber;
    private String forwardGears;
    private double firstGearRatio;
    private double secondGearRatio;
    private double thirdGearRatio;
    private double forthGearRatio;


    public Transmission(String transmissionType, String modelNumber, String forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double forthGearRatio) {
        this.transmissionType = transmissionType;
        this.modelNumber = modelNumber;
        this.forwardGears = forwardGears;
        this.firstGearRatio = firstGearRatio;
        this.secondGearRatio = secondGearRatio;
        this.thirdGearRatio = thirdGearRatio;
        this.forthGearRatio = forthGearRatio;
    }


    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getForwardGears() {
        return forwardGears;
    }

    public void setForwardGears(String forwardGears) {
        this.forwardGears = forwardGears;
    }

    public double getFirstGearRatio() {
        return firstGearRatio;
    }

    public void setFirstGearRatio(double firstGearRatio) {
        this.firstGearRatio = firstGearRatio;
    }

    public double getSecondGearRatio() {
        return secondGearRatio;
    }

    public void setSecondGearRatio(double secondGearRatio) {
        this.secondGearRatio = secondGearRatio;
    }

    public double getThirdGearRatio() {
        return thirdGearRatio;
    }

    public void setThirdGearRatio(double thirdGearRatio) {
        this.thirdGearRatio = thirdGearRatio;
    }

    public double getForthGearRatio() {
        return forthGearRatio;
    }

    public void setForthGearRatio(double forthGearRatio) {
        this.forthGearRatio = forthGearRatio;
    }

    public  void showSpecs()
    {
        System.out.println("Transmission Type : "+getTransmissionType());
        System.out.println("Transmission Model Number : "+getModelNumber());
        System.out.println("Key Specifications : ");
        System.out.println("1. Forward Gears : "+getForwardGears());
        System.out.println("2. 1st Gear Ratio : "+firstGearRatio);
        System.out.println("3. 2nd Gear Ratio : "+secondGearRatio);
        System.out.println("4. 3rd Gear Ratio : "+thirdGearRatio);
        System.out.println("5. 4th Gear Ratio : "+forthGearRatio);
    }
}
