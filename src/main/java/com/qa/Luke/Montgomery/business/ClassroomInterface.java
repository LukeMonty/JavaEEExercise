package com.qa.Luke.Montgomery.business;

public interface ClassroomInterface {
	public String getAllClassrooms();
	public String getAllTrainers();
	public String createNewClassroom(String classroom);
	public String changeTrainer(Long id, String updatedClassroom);
	public String removeClassroom(Long id);
}
