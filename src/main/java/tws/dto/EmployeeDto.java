package tws.dto;

import tws.entity.Employee;

public class EmployeeDto {
	
	private String desc;
	private String age;
	private String name;
	private String id;
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public EmployeeDto(String desc, String age, String name, String id) {
		
		this.desc = desc;
		this.age = age;
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public EmployeeDto() {
		
	}
	
	
	
}
