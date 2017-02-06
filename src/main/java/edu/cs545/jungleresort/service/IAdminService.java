package edu.cs545.jungleresort.service;

import edu.cs545.jungleresort.domain.Admin;


public interface IAdminService {
	public Admin addAdmin(Admin admin);
	public void deleteAdmin(int id);
	public Admin getAdminById(int id);
}
