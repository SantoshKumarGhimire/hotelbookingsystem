package edu.cs545.jungleresort.service;

import java.util.List;

import edu.cs545.jungleresort.domain.Customer;

public interface ICustomerService {
	 public List<Customer> getAllCustomer();
	 public Customer getCustomerById(int id);
	 public void addCustomer(Customer customer);
	 public void updateCustomer(int id);
	 public void deleteCustomer(int id);
	 public Customer getCustomerByUserName(String userName);
}
