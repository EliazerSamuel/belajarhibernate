package com.tog.service;

import java.util.List;

import com.tog.entity.MstAdmin;


public interface MstAdminSvc {
	
	public List<MstAdmin> findAll();
	public List<MstAdmin> findByUsernameAndPasswordAdmin(
			String usernameadmin,
			String passwordadmin);
	void save(MstAdmin mstAdmin);

	
}
