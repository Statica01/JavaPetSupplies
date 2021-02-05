package domain.entities.shop;

import domain.entities.customer.Customer;

import java.util.ArrayList;

public class CustomerBank {

    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public static Customer getCustomerByName(String name) {

        Customer customer = null;
        for(Customer c : customers) {
            //System.out.println("in for loop");
            if(c.getUserName() == name) {
                System.out.println("found " + name + "!");
                customer = c;
            }
        }

        return customer;
    }
}
