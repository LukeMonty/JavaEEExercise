package com.qa.Luke.Montgomery.persistence.repository;

import com.qa.Luke.Montgomery.persistence.domain.Classroom;
import com.qa.Luke.Montgomery.persistence.domain.Trainee;

public interface TraineeInterface {
	
	public String getAllTrainees();
	public String getAllTraineesInClassroom(Long id);
	public String amendTrainee(Long id, String updatedTrainee);
	public String createTrainee(String trainee);
	public String removeTrainee(Long id);
	
	
}
