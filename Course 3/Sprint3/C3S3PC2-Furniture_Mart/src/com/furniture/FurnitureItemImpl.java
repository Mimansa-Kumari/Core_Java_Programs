package com.furniture;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem();
        furnitureItem.setFurnitureCode(101);
        furnitureItem.setFurnitureType("table");
        furnitureItem.setGradeOfFurniture("grade1");
        furnitureItem.setFurnitureUsage("outdoor");
        furnitureItem.setPrice(10.0f);
        System.out.println("Discounted price is $"+furnitureItem.calculateDiscount());
    }
}
