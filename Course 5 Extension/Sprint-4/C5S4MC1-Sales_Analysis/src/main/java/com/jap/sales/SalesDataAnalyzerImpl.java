package com.jap.sales;

import java.util.List;

public class SalesDataAnalyzerImpl {
    public static void main(String[] args) {
        SalesDataAnalyzer salesDataAnalyzer = new SalesDataAnalyzer();
        List<SalesRecord> list = salesDataAnalyzer.readFile("F:\\NIIT\\Course 5\\Sprint-4\\C5S4MC1-Sales_Analysis\\src\\main\\resources\\purchase_details.csv");
        for (SalesRecord s : list)
        {
            System.out.println(s);
        }
        System.out.println();
        List<SalesRecord> sortedAmount = salesDataAnalyzer.getAllCustomersSortedByPurchaseAmount(list);
        for (SalesRecord s : sortedAmount)
        {
            System.out.println(s);
        }
        System.out.println();
        System.out.println(salesDataAnalyzer.getTopCustomerWhoSpentMaxTimeOnSite(list));
    }
}
