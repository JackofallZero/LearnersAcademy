package com.classes;

import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Class_Table")
public class Classes {
	@Id
	@Column(name = "Class_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int Class_ID;
	
	@Column(name = "Class_name")
	private String class_name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Class_ID")
	private List<Students> student_list;
	
	
	@OneToOne
	@JoinColumn(name = "Subject_ID")
	private Subjects subject;
	
	@OneToOne
	@JoinColumn(name = "Teacher_ID")
	private Teachers teacher;
	
	public Classes() {
	}

	public Classes(String class_name) {
		super();
		this.class_name = class_name;
		
	}

	public int getClass_ID() {
		return Class_ID;
	}

	public void setClass_ID(int class_ID) {
		Class_ID = class_ID;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public List<Students> getStudent_list() {
		return student_list;
	}

	public void setStudent_list(List<Students> student_list) {
		this.student_list = student_list;
	}

	public Subjects getSubject() {
		return subject;
	}

	public void setSubject(Subjects subject) {
		this.subject = subject;
	}

	public Teachers getTeacher() {
		return teacher;
	}

	public void setTeacher(Teachers teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Classes [Class_ID=" + Class_ID + ", class_name=" + class_name + ", student_list=" + student_list
				+ ", subject=" + subject + ", teacher=" + teacher + "]";
	}
	
	
}
