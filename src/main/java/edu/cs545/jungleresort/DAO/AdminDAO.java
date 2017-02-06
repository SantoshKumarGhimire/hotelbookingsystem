package edu.cs545.jungleresort.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.cs545.jungleresort.domain.Admin;

@Repository
public interface AdminDAO extends CrudRepository<Admin, Integer>{

}
