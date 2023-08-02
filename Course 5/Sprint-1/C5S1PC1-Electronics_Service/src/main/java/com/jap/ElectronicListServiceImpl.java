package com.jap;
import java.util.*;
public class ElectronicListServiceImpl {
    public static void main(String[] args) {
        String electronicItems = "TV,Computer,Refrigerator,TV";
        List<String> list = ElectronicListService.addElectronicsItemsToList(electronicItems);
        System.out.println("Electronic Items : ");
        System.out.print(list+" ");
        System.out.println("\n");

        System.out.println("Item present at "+ElectronicListService.searchElectronicItemInList(list,"Computer")+" index");
        System.out.println();

        System.out.println("Removed Electronics Item From List : "+ElectronicListService.removeElectronicsItemFromList(list,"Computer"));
    }
}
