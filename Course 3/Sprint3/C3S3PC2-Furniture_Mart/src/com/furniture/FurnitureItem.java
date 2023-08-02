package com.furniture;

public class FurnitureItem {
    private int furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String color;
    private String furnitureUsage;
    private float price;
    final static float DISCOUNT=5;
    FurnitureItem()
    {
        this.furnitureCode=0;
        this.furnitureType=null;
        this.gradeOfFurniture=null;
        this.color=null;
        this.furnitureUsage=null;
        this.price=0.0f;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }
    public int getFurnitureCode() {
        return furnitureCode;
    }


    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }
    public String getFurnitureType() {
        return furnitureType;
    }


    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }
    public String getGradeOfFurniture() {
        return gradeOfFurniture;
    }


    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }


    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }
    public String getFurnitureUsage() {
        return furnitureUsage;
    }


    public void setPrice(float price) {
        this.price = price;
    }
    public float getPrice() {
        return price;
    }


    public float calculateDiscount()
    {
        if (getGradeOfFurniture().equalsIgnoreCase("grade1") && getFurnitureUsage().equalsIgnoreCase("outdoor"))
        {
            return getPrice()-(DISCOUNT/100.0f)*getPrice();
        }
        else
        {
            return 0.0f;
        }
    }
}
