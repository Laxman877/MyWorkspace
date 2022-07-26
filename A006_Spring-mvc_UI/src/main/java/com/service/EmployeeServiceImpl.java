package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	@Override
	public void addOrUpdateEmp(Employee emp) {
		employeeDao.addOrUpdateEmp(emp);

	}

	@Override
	public List<Employee> getAllEmp() {
		
		return employeeDao.getAllEmp();
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getById(id);
	}

	@Override
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmp(id);
	}

}
