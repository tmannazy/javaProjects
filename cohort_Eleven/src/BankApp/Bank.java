package BankApp;

import java.util.ArrayList;

public class Bank {
    protected ArrayList<Customer> customers = new ArrayList<>();


    public void addNewCustomer(Customer newCustomer) {
        for (Customer customer : customers) {
            if (customer.getPhoneNumber().equals(newCustomer.getPhoneNumber())) {
                throw new IllegalArgumentException("A customer with these details already exists");
            }
        }
        this.customers.add(newCustomer);
    }

    public Customer getCustomerNameDetails(String fullName) {
        for (Customer customer : customers) {
            if (customer.getNames().equalsIgnoreCase(fullName)) return customer;
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

//c
    @Override
    public String toString() {
        String listOfCustomers = "";
        int count = 1;
        for (Customer customer : customers) {
//            if (account.getCustomerName().equalsIgnoreCase(customer.getNames()))
//            for (Customer cust: customer) {
//
//            }
           listOfCustomers += customer.getAccounts().toString();
            }
//                listOfCustomers += (account.toString());
//            listOfCustomers += ("Customer " + count + ": " + customer.getNames().toUpperCase() + "\n");
//            count++;
//        }
        return listOfCustomers;

    }
}
