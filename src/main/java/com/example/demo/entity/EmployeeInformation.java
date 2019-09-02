package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employeesinformation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeInformation {
	@Id
	@GeneratedValue
	private int emp_Id;
	private String emp_FullName;
	private String emp_Project;
	
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="empId")  
	  
	private List<EmployeeBandWidthStatus> empStatus;
	public List<EmployeeBandWidthStatus> getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(List<EmployeeBandWidthStatus> empStatus) {
		this.empStatus = empStatus;
	}

	public EmployeeInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeInformation(int emp_Id, String emp_FullName, String emp_Project) {
		super();
		this.emp_Id = emp_Id;
		this.emp_FullName = emp_FullName;
		this.emp_Project = emp_Project;
	}

	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_FullName() {
		return emp_FullName;
	}
	public void setEmp_FullName(String emp_FullName) {
		this.emp_FullName = emp_FullName;
	}
	public String getEmp_Project() {
		return emp_Project;
	}
	public void setEmp_Project(String emp_Project) {
		this.emp_Project = emp_Project;
	}
	
	

}
