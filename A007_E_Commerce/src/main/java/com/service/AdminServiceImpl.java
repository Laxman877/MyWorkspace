package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDao;
import com.model.Admin;
@Service
public class AdminServiceImpl implements Adminservice {
	@Autowired
	AdminDao adminDao;
	@Override
	public Admin validateUser(Admin admin) {
		// TODO Auto-generated method stub
		return adminDao.validateUser(admin);
	}

}
