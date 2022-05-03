package com.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Subject_Table")
public class Subjects {
	
	@Column(name = "Subject_name")
	private String subject_name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Subject_ID")
	private int subject_id;
	
	public Subjects() {
		
	}

	public Subjects(String subject_name) {
		this.subject_name = subject_name;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	@Override
	public String toString() {
		return "Subjects [subject_name=" + subject_name + ", subject_id=" + subject_id + "]";
	}

	
	
}
