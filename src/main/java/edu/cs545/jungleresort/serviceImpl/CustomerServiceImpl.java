package edu.cs545.jungleresort.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cs545.jungleresort.DAO.CustomerDAO;
import edu.cs545.jungleresort.domain.Customer;
import edu.cs545.jungleresort.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	CustomerDAO customerdao;
	
	@Override
	public List<Customer> getAllCustomer() {
		return (List<Customer>) customerdao.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		return customerdao.findOne(id);
	}

	@Override
	public void addCustomer(Customer customer) {
		customerdao.save(customer);
	}

	@Override
	public void updateCustomer(int id) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void deleteCustomer(int id) {
		customerdao.delete(id);
	}

	@Override
	public Customer getCustomerByUserName(String userName) {
		return null;
	}

}
