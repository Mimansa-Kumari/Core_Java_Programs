package com.jap.customers;
import java.util.*;

public class CustomerService {

    // This method will return the names of the customers in sorted alphabetical order.
public List<String> getListOfCustomersSortedByName(List<Customer> customerList){

    Collections.sort(customerList);
    List<String> list = new ArrayList<>();
    for (Customer c:customerList)
    {
        list.add(c.getCustomerName());
    }
    return list;
}

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        List<Customer> li = new ArrayList<>();
        Customer c1 = new Customer(11,"Rahul","Male",true,"Kolkata");
        Customer c2 = new Customer(12,"Meera","Female",false,"Delhi");
        Customer c3 = new Customer(13,"Krishna","Male",true,"Pune");
        Customer c4 = new Customer(14,"Vivek","Male",false,"Mumbai");
        Customer c5 = new Customer(15,"Pushpa","Female",true,"Bangalore");
        Customer c6 = new Customer(16,"Shubham","Male",true,"Dehradun");
        li.add(c1);
        li.add(c2);
        li.add(c3);
        li.add(c4);
        li.add(c5);
        li.add(c6);
        System.out.println(customerService.getListOfCustomersSortedByName(li));
    }

}
