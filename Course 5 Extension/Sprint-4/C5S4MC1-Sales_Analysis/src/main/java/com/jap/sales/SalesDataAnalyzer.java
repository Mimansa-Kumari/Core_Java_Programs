package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SalesDataAnalyzer {
   public List<SalesRecord> readFile(String fileName) {
       SalesRecord salesRecord = null;
       List<SalesRecord> salesData = new  ArrayList<>();
       try (FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);){
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null)
            {
             String[] data = line.split(",");
             salesRecord = new SalesRecord();
             salesRecord.setDate(data[0]);
             Arrays.toString(data);
             salesRecord.setCustomer_id(Integer.parseInt(data[1]));
             Arrays.toString(data);
             salesRecord.setProduct_category(Integer.parseInt(data[2]));
             Arrays.toString(data);
             salesRecord.setPayment_method(data[3]);
             Arrays.toString(data);
             salesRecord.setAmount(Double.parseDouble(data[4]));
             Arrays.toString(data);
             salesRecord.setTime_on_site(Double.parseDouble(data[5]));
             Arrays.toString(data);
             salesRecord.setClicks_in_site(Integer.parseInt(data[6]));
             Arrays.toString(data);
             salesData.add(salesRecord);
            }
       }
       catch (IOException exception)
       {
           exception.printStackTrace();
       }
       return salesData;
    }

    public List<SalesRecord> getAllCustomersSortedByPurchaseAmount(List<SalesRecord> salesData){
        Comparator<SalesRecord> comparator = (o1, o2) -> (int) (o2.getAmount()-o1.getAmount());
        Collections.sort(salesData,comparator);
       return salesData;
    }
    public SalesRecord getTopCustomerWhoSpentMaxTimeOnSite(List<SalesRecord> salesData){
        Comparator<SalesRecord> comparator = (o1, o2) -> (int) (o2.getTime_on_site()-o1.getTime_on_site());
        Collections.sort(salesData,comparator);
        return salesData.get(0);
    }

}
