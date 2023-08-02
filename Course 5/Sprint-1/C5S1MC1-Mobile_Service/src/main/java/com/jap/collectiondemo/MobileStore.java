package com.jap.collectiondemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MobileStore {


    private List<Mobile> allMobiles;
    private String record = "";
    private String splitBy = ",";
    public MobileStore()
    {
        allMobiles = new ArrayList<>();
    }

    //Write logic to read the fileName that is "mobile.csv"
    //read all the lines one by one
    //Create Mobile class object and store data from file in the respective attributes of Mobile class
    // ex - Store brandName - Samsung in  mobile.setBrandName(brandName);
    //add mobile object in the List object and return the List
    //handle all the exceptions
    public List<Mobile> readMobileData(String fileName)
    {
        Mobile mobile = null;
    try (FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);){
        String line = bufferedReader.readLine();
        while ((line = bufferedReader.readLine())!=null)
        {
            String[] data = line.split(splitBy);
            mobile = new Mobile();
            mobile.setBrandName(data[0]);
            Arrays.toString(data);
            mobile.setModelName(data[1]);
            Arrays.toString(data);
            mobile.setCost(Double.parseDouble(data[2]));
            Arrays.toString(data);
            mobile.setScreenSize(data[3]);
            Arrays.toString(data);
            mobile.setBatteryLife(data[4]);
            Arrays.toString(data);
            mobile.setStorageSpace(data[5]);
            Arrays.toString(data);
            mobile.setCameraPixels(Integer.parseInt(data[6]));
            Arrays.toString(data);
            allMobiles.add(mobile);
        }
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
        return allMobiles;
    }

    //Iterate the List created in the above method and retrieve the bandName
    //Return the List with specific Mobile having brandName coming from method parameter
    public List<Mobile> findPhoneByBrand(String brandName)
    {
        List<Mobile> mobilesByBrand = new ArrayList<>();
      for (Mobile m : allMobiles)
      {
          if (m.getBrandName().equals(brandName))
          {
              mobilesByBrand.add(m);
          }
      }
        return mobilesByBrand;
    }

    //Iterate through the List created in the first method
    //Return the List of Mobile whose cost is more than $500
    public List<Mobile> findPhoneCostMoreThan$500()
    {
        List<Mobile> mobilesMoreThan500 = new ArrayList<>();
        for (Mobile m : allMobiles)
        {
            if (m.getCost()>500)
            {
                mobilesMoreThan500.add(m);
            }
        }
        return mobilesMoreThan500;
    }

    //Iterate through the List created in the first method
    //Return the List of Mobile whose Pixel is more than 12MP
    public List<Mobile> findPhonePixelMoreThan12MP()
    {
        List<Mobile> mobilesMoreThan12MP = new ArrayList<>();
        for (Mobile m : allMobiles)
        {
            if (m.getCameraPixels()>12)
            {
                mobilesMoreThan12MP.add(m);
            }
        }
        return mobilesMoreThan12MP;
    }


}

