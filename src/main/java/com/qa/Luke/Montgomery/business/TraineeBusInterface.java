package com.qa.Luke.Montgomery.business;

public interface TraineeBusInterface {
	
	public String getAllTrainees();
	public String getAllTraineesInClassroom(Long id);
	public String amendTrainee(Long id, String updatedTrainee);
	public String createTrainee(String trainee);
	public String removeTrainee(Long id);
	

}
