package com.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name="emp100")
@PrimaryKeyJoinColumn(name="id")
public class Reg_Employee1 extends Employee  {
	
	private float salary;
	private String dept;
	
	
	public Reg_Employee1() {
		super();
	}
	public Reg_Employee1(float salary, String dept,String name) {
		super(name);
		this.salary = salary;
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
