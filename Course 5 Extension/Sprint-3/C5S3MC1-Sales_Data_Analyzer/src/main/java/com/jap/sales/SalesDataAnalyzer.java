package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SalesDataAnalyzer {
    // Read the data from the file and store in a List
   public List<SalesRecord> readFile(String fileName) {
       List<SalesRecord> salesData = new ArrayList<>();
        try (FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);){
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null)
            {
                String[] data = line.split(",");
                SalesRecord salesRecord = new SalesRecord();
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

    // Sort the customers based on purchase amount
    public List<SalesRecord> getAllCustomersSortedByPurchaseAmount(List<SalesRecord> salesData, AmountComparator amountComparator){

    Collections.sort(salesData,amountComparator);
    Collections.reverse(salesData);
       return salesData;
    }

    // Find the top customer who spent the maximum time on the site
    public SalesRecord getTopCustomerWhoSpentMaxTimeOnSite(List<SalesRecord> salesData,TimeOnSiteComparator timeOnSiteComparator){
       Collections.sort(salesData, timeOnSiteComparator);
        return salesData.get(0);
    }
}
