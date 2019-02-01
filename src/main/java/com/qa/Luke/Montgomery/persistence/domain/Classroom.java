package com.qa.Luke.Montgomery.persistence.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classroom {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String trainer;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Trainee> trainee =  new ArrayList<>();
	
	public Classroom(Long id, String trainer, List<Trainee> trainee) {
		this.id = id;
		this.trainer = trainer;
		this.trainee = trainee;
	}
	
	public Classroom() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public List<Trainee> getTrainee() {
		return trainee;
	}
	public void setTrainee(List<Trainee> trainee) {
		this.trainee = trainee;
	}
	

}
