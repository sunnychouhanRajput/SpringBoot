package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class EmployeeBandWidthId implements Serializable{
	private Date status_Date;
	private int empId;
	public EmployeeBandWidthId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeBandWidthId(Date status_Date, int empId) {
		super();
		this.status_Date = status_Date;
		this.empId = empId;
	}
	public Date getStatus_Date() {
		return status_Date;
	}
	public void setStatus_Date(Date status_Date) {
		this.status_Date = status_Date;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((status_Date == null) ? 0 : status_Date.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeBandWidthId other = (EmployeeBandWidthId) obj;
		if (empId != other.empId)
			return false;
		if (status_Date == null) {
			if (other.status_Date != null)
				return false;
		} else if (!status_Date.equals(other.status_Date))
			return false;
		return true;
	}
	
	
}
