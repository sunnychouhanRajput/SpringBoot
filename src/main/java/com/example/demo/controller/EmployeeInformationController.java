package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeBandWidthStatusDao;
import com.example.demo.dao.EmployeeInformationDao;
import com.example.demo.entity.EmployeeBandWidthStatus;
import com.example.demo.entity.EmployeeInformation;
import com.example.demo.service.EmployeeInformationSerivce;



@RestController
@RequestMapping("/employeeBandWidth")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeInformationController {
	@Autowired
	private EmployeeInformationDao employeeInformationDao;
	
	@Autowired
	private EmployeeBandWidthStatusDao employeeBandWidthStatusDao;
	
	
	@GetMapping("/employees")
	public List<EmployeeInformation>getAllEmployees(){
		return (List<EmployeeInformation>)employeeInformationDao.findAll();
	}
	@PostMapping("/statusUpdate")
	public String getEmployeesStatus(@RequestBody List<EmployeeBandWidthStatus> empStatus) {
		
		try{ 
			employeeBandWidthStatusDao.save(empStatus);
		}
		catch(Exception e) {
			System.out.println("Exce[tion E" + e);
			return "error";
		}
		
		return "status updated : " + empStatus.size();
	}
}
