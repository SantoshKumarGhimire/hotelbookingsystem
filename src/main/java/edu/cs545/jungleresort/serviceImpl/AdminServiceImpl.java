package edu.cs545.jungleresort.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cs545.jungleresort.DAO.AdminDAO;
import edu.cs545.jungleresort.domain.Admin;
import edu.cs545.jungleresort.service.IAdminService;


public class AdminServiceImpl implements IAdminService {

	@Autowired
	private AdminDAO admindao;
	
	@Override
	public Admin addAdmin(Admin admin) {
		return admindao.save(admin);
	}

	@Override
	public void deleteAdmin(int id) {
		admindao.delete(id);		
	}

	@Override
	public Admin getAdminById(int id) {
		return admindao.findOne(id);
	}

}
