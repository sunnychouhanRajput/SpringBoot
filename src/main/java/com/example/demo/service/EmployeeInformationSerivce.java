package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeInformation;

@Service
public class EmployeeInformationSerivce {
	
	private List<EmployeeInformation>EmployeeInformations = Arrays.asList(
			new EmployeeInformation(101,"ram","developer"),
			new EmployeeInformation(102,"shyam","testesr"),
			new EmployeeInformation(103,"sunny","developer"));
	
	public List<EmployeeInformation>getAllEmployees(){
		return EmployeeInformations;
	}

}
