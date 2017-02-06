package edu.cs545.jungleresort.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.cs545.jungleresort.domain.Customer;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer>{

}
