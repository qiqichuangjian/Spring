package com.java.controller;

import com.java.dao.DepartmentDao;
import com.java.dao.EmployeeDao;
import com.java.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class EmployeeHandler {

	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields("lastName");
	}

	@Autowired
	private EmployeeDao employeeDao;
	@RequestMapping("/emps")
	public String list(Map<String, Object> map){
		map.put("employees", employeeDao.getAll());
		return "list";
	}

	@Autowired
	private DepartmentDao departmentDao;
	@RequestMapping(value="emp",method= RequestMethod.GET)
	public String input(Map<String,Object> map){
		map.put("departments", departmentDao.getDepartments());
		map.put("employee", new Employee());
		return "add";
	}


}
