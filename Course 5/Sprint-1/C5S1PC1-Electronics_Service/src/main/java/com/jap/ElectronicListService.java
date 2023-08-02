package com.jap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService {
    //add all the electronics items inside the List

    //computer", "Refrigerator", "smartphone", "printer
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
       String[] splitElectronic = electronicsItems.split(",");

       List<String> itemList = new ArrayList<>();
       itemList.addAll(Arrays.asList(splitElectronic));

       List<String> list = new ArrayList<>();
       for (String l : itemList)
       {
           if (!list.contains(l))
           {
               list.add(l);
           }
       }
       return list;
    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        return itemList.indexOf(searchItem);
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem)
    {
        boolean flag = false;
        Iterator itr = itemList.iterator();
        while (itr.hasNext())
        {
            String item = (String)itr.next();
            if(item.equalsIgnoreCase(removeItem))
            {
                itr.remove();
                flag = true;
            }
        }

        return flag;
    }

}
