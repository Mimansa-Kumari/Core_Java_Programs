package com.jap.collectiondemo;

import java.util.List;

public class MobileStoreImpl {
    public static void main(String[] args) {
        MobileStore mobileStore = new MobileStore();
        List<Mobile> li = mobileStore.readMobileData("F:\\NIIT\\Course 5\\Sprint-1\\C5S1MC1-Mobile_Service\\mobile.csv");
        for (Mobile m : li)
        {
            System.out.println(m);
        }
        System.out.println();
        System.out.println(mobileStore.findPhoneByBrand("Sony"));
        System.out.println();
        System.out.println(mobileStore.findPhoneCostMoreThan$500());
        System.out.println();
        System.out.println(mobileStore.findPhonePixelMoreThan12MP());
    }
}
