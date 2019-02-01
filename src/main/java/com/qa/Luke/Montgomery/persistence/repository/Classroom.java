package com.qa.Luke.Montgomery.persistence.repository;

import com.qa.Luke.Montgomery.persistence.domain.Trainee;

public interface Classroom {
	
	public String getAllClassrooms();
	public String getAllTrainers();
	public String getAllTraineesForClassroom(Long id);
	public String addToClassroom(Trainee trainee);

}
