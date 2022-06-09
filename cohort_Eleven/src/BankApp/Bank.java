package BankApp;

import java.util.ArrayList;

public class Bank {
    protected ArrayList<Customer> customers = new ArrayList<>();


    public void addNewCustomer(Customer newCustomer) {
        for (Customer customer : customers) {
            if (customer.getNames().equals(newCustomer.getNames())) {
                throw new IllegalArgumentException("A customer with these details already exists.\n");
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

    @Override
    public String toString() {
        StringBuilder listOfCustomers = new StringBuilder();
        int count = 1;
        for (Customer customer : customers) {
            listOfCustomers.append("Customer ").append(count).append(customer.getAccounts().toString());
            count++;
        }
        return listOfCustomers.toString();

    }

    public void removeCustomer(String customerName) {
        Customer customerToBeDeleted = null;
        for (Customer customer : customers) {
            if (customer.getNames().equalsIgnoreCase(customerName)) {
                customerToBeDeleted = customer;
                customer.removeAccount(customerToBeDeleted);
            }
        }
        if (customerToBeDeleted == null)
            throw new IllegalArgumentException("Account with customer name '" + customerName.toUpperCase() + "' not found.\n");
        customers.remove(customerToBeDeleted);
    }
}
