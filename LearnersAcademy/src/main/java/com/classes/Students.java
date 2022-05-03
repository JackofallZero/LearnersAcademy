package com.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity
@Table(name="Student_Table")
public class Students {
	@Column(name="Student_name")
	private String student_name;
	
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private int roll_number;
	
	public Students(String student_name) {
		this.student_name = student_name;
	}
	public Students() {
		// TODO Auto-generated constructor stub
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	@Override
	public String toString() {
		return "Students [student_name=" + student_name + ", roll_number=" + roll_number + "]";
	}
	
	
	
	
}
