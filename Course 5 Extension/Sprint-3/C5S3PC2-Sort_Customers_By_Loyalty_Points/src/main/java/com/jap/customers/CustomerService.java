package com.jap.customers;


import java.util.*;

public class CustomerService {

    public List<Customer> getListOfCustomersSortedByCustomerName(List<Customer> customerList)
    {
        customerList.sort(new CustomerNameComparator());
        return customerList;
    }

    // This method returns the customer's loyalty points in sorted order
    public List<Integer> getListOfCustomersSortedByLoyaltyPoints(List<Customer> customerList, LoyaltyPointComparator loyaltyPointComparator){
        Collections.sort(customerList,loyaltyPointComparator);
        List<Integer> li = new ArrayList<>();
        for (Customer s : customerList)
        {
            li.add(s.getLoyaltyPoints());
        }
        Collections.reverse(li);
    return li;
    }
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        Customer c1 = new Customer(11,"Rahul","Male",true,"Kolkata",8);
        Customer c2 = new Customer(12,"Meera","Female",false,"Delhi",9);
        Customer c3 = new Customer(13,"Krishna","Male",true,"Pune",6);
        Customer c4 = new Customer(14,"Vivek","Male",false,"Mumbai",7);
        Customer c5 = new Customer(15,"Pushpa","Female",true,"Bangalore",5);
        Customer c6 = new Customer(16,"Shubham","Male",true,"Dehradun",4);
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);

        CustomerService customerService = new CustomerService();
        System.out.println("Sorted by Names : ");
        List<Customer> l1 ;
        l1 = customerService.getListOfCustomersSortedByCustomerName(list);
        for (Customer customer : l1) {
            System.out.println(customer);
        }
        LoyaltyPointComparator loyaltyPointComparator = new LoyaltyPointComparator();
        List<Integer> l2;
        l2 = (customerService.getListOfCustomersSortedByLoyaltyPoints(list,loyaltyPointComparator));
        System.out.println(l2);
    }
}
