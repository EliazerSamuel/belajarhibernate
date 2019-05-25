package com.tog.service.impl;


import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tog.dao.MstAdminDao;
import com.tog.dao.MstUserDao;
import com.tog.entity.MstAdmin;
import com.tog.entity.MstUser;
import com.tog.service.MstAdminSvc;


@Service
@Transactional
public class MstAdminSvcImpl implements MstAdminSvc {
	
	@Autowired
	private MstAdminDao mstAdminDao;

	@Override
	public List<MstAdmin> findAll() {
		try {
			return mstAdminDao.findAll();
		} catch (Exception exception) {
			exception.printStackTrace();
			throw new HibernateException(exception);
		}
	}

	@Override
	public List<MstAdmin> findByUsernameAndPasswordAdmin(String usernameadmin,
			String passwordadmin) {
		try {
			return mstAdminDao.findByUsernameAndPasswordAdmin(usernameadmin, passwordadmin);
		} catch (Exception e) {
			throw new HibernateException(e);
		}
	}

	@Override
	public void save(MstAdmin mstAdmin) {
		try {
			mstAdminDao.save(mstAdmin);
		} catch (Exception e) {
			throw new HibernateException(e);
		}
	}
	
	

}
