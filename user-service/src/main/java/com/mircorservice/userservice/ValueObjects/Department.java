package com.mircorservice.userservice.ValueObjects;

public class Department {
	
	private Long departmentId;
	private String departmenName;
	private String departmentCode;
	private String deparmentAddress;
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmenName() {
		return departmenName;
	}
	public void setDepartmenName(String departmenName) {
		this.departmenName = departmenName;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public String getDeparmentAddress() {
		return deparmentAddress;
	}
	public void setDeparmentAddress(String deparmentAddress) {
		this.deparmentAddress = deparmentAddress;
	}
	
	

}
