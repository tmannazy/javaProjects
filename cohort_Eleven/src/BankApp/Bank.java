package BankApp;

import java.util.ArrayList;

public class Bank {
  protected ArrayList<Customer> customers = new ArrayList<>();

   public void addNewCustomer(Customer newCustomer){
      this.customers.add(newCustomer);
   }

   public Customer getCustomerNameDetails(String fullName) {
      for (Customer customer : customers) {
         if (customer.getNames().equals(fullName)) {
            return customer;
         }
      }
         return null;
   }
}
