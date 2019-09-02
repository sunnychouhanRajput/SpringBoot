package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.EmployeeInformation;


public interface EmployeeInformationDao extends CrudRepository<EmployeeInformation, Integer> {

}
