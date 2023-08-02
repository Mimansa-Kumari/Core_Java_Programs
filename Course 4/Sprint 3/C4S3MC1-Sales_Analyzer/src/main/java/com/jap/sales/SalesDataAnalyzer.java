package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class SalesDataAnalyzer {
    SalesRecord salesRecord = null;
    int count = 0;
    // This method reads a file and adds each line of the file into the corresponding SalesRecord object
    public SalesRecord[] readFile(String fileName) {
        try (FileReader fileReader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line = bufferedReader.readLine();

            while ((line = bufferedReader.readLine())!=null)
            {
                count++;
            }
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
        SalesRecord[] salesRecords = new SalesRecord[count];
        try (FileReader fileReader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(fileReader);){
            String line = bufferedReader.readLine();
            int index = 0;
            while ((line=bufferedReader.readLine())!=null)
            {
                String[] salesData = line.split(",");
                salesRecord = new SalesRecord();
                salesRecord.setDate(salesData[0]);
                Arrays.toString(salesData);
                salesRecord.setCustomer_id(Integer.parseInt(salesData[1]));
                Arrays.toString(salesData);
                salesRecord.setProduct_category(Integer.parseInt(salesData[2]));
                Arrays.toString(salesData);
                salesRecord.setPayment_method(salesData[3]);
                Arrays.toString(salesData);
                salesRecord.setAmount(Double.parseDouble(salesData[4]));
                Arrays.toString(salesData);
                salesRecord.setTime_on_site(Double.parseDouble(salesData[5]));
                Arrays.toString(salesData);
                salesRecord.setClicks_in_site(Integer.parseInt(salesData[6]));
                salesRecords[index] = salesRecord;
                index++;
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return salesRecords;
    }
}
