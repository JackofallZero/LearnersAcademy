package com.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher_table")
public class Teachers {
	
	@Column(name="Teacher_name")
	private String teacher_name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Teacher_ID;

	public Teachers(String teacher_name) {
		this.teacher_name = teacher_name;
		
	}

	public Teachers() {
		
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public int getTeacher_ID() {
		return Teacher_ID;
	}

	public void setTeacher_ID(int teacher_ID) {
		Teacher_ID = teacher_ID;
	}

	@Override
	public String toString() {
		return "Teachers [teacher_name = " + teacher_name + ", Teacher_ID = " + Teacher_ID + "]";
	}
	
	
}
