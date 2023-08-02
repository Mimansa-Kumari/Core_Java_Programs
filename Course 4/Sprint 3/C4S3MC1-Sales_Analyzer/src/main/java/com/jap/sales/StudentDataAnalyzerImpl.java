package com.jap.sales;

public class StudentDataAnalyzerImpl {
    public static void main(String[] args) {
        SalesDataAnalyzer salesDataAnalyzer = new SalesDataAnalyzer();
        SalesRecord[] salesData = salesDataAnalyzer.readFile("F:\\NIIT\\Course 4\\Sprint 3\\C4S3MC1-Sales_Analyzer\\src\\main\\resources\\purchase_details.csv");
        for (SalesRecord s : salesData)
        {
            System.out.println(s);
        }
    }
}
