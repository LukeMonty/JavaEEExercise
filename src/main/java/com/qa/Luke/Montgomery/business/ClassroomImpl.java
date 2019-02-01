package com.qa.Luke.Montgomery.business;

import javax.inject.Inject;

import com.qa.Luke.Montgomery.persistence.repository.ClassroomInterface;

public class ClassroomImpl implements ClassroomBusInterface {
	
	@Inject
	private ClassroomInterface repo;


	public String getAllClassrooms() {
		
		return repo.getAllClassrooms();
	}


	public String getAllTrainers() {
		return repo.getAllTrainers();
	}


	public String createNewClassroom(String classroom) {
		return repo.createNewClassroom(classroom);
	}


	public String changeTrainer(Long id, String updatedClassroom) {
		return repo.changeTrainer(id, updatedClassroom);
	}


	public String removeClassroom(Long id) {
		return repo.removeClassroom(id);
	}

}
