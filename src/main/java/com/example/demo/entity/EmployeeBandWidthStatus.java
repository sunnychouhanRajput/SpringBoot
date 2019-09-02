package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "statusinformation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@IdClass(EmployeeBandWidthId.class)
public class EmployeeBandWidthStatus {
	
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Id
	private Date status_Date;
	private String bandWidth_status;
	private int bandWidth_Hours;
	@Id
	private int empId;

	
	public EmployeeBandWidthStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public EmployeeBandWidthStatus(Date status_Date, String bandWidth_status, int bandWidth_Hours) {
		super();
				this.status_Date = status_Date;
		this.bandWidth_status = bandWidth_status;
		this.bandWidth_Hours = bandWidth_Hours;
	}

	

	public int getBandWidth_Hours() {
		return bandWidth_Hours;
	}

	public void setBandWidth_Hours(int bandWidth_Hours) {
		this.bandWidth_Hours = bandWidth_Hours;
	}

	

	public Date getStatus_Date() {
		return status_Date;
	}

	public void setStatus_Date(Date status_Date) {
		this.status_Date = status_Date;
	}

	public String getBandWidth_status() {
		return bandWidth_status;
	}

	public void setBandWidth_status(String bandWidth_status) {
		this.bandWidth_status = bandWidth_status;
	}
	

}
