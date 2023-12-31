package com.example.demo.model;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "court")
public class Court {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer court_id;
	
	private String court_name;
	private String court_time;

	

	public Court() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Court(String court_name) {
		super();
		
		this.court_name = court_name;
	}

	public Integer getCourt_id() {
		return court_id;
	}

	public void setCourt_id(Integer court_id) {
		this.court_id = court_id;
	}

	public String getCourt_name() {
		return court_name;
	}
	
	public void setCourt_name(String court_name) {
		this.court_name = court_name;
	}
	
	public String getCourt_time() {
		return court_time;
	}

	public void setCourt_time(String court_time) {
		this.court_time = court_time;
	}
	
	@ManyToOne
	@JoinColumn(name = "status_id")
		private Court_status court_status;


	public Court_status getCourt_status() {
		return court_status;
	}

	public void setCourt_status(Court_status court_status) {
		this.court_status = court_status;
	}
	
	
	
	
}
