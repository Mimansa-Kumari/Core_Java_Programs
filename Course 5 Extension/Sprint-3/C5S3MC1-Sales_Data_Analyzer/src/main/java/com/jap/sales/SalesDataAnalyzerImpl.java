package com.jap.sales;

import java.util.List;

public class SalesDataAnalyzerImpl {
    public static void main(String[] args) {
        SalesDataAnalyzer salesDataAnalyzer = new SalesDataAnalyzer();
        List<SalesRecord> list = salesDataAnalyzer.readFile("F:\\NIIT\\Course 5\\Sprint-3\\C5S3MC1-Sales_Data_Analyzer\\src\\main\\resources\\purchase_details.csv");
        for (SalesRecord s : list)
        {
            System.out.println(s);
        }
        System.out.println();

        AmountComparator amountComparator = new AmountComparator();
        System.out.println(salesDataAnalyzer.getAllCustomersSortedByPurchaseAmount(list,amountComparator));
        System.out.println();

        TimeOnSiteComparator timeOnSiteComparator = new TimeOnSiteComparator();
        System.out.println(salesDataAnalyzer.getTopCustomerWhoSpentMaxTimeOnSite(list,timeOnSiteComparator));
    }
}
