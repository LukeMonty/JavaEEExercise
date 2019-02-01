package com.qa.Luke.Montgomery.business;

import javax.inject.Inject;

import com.qa.Luke.Montgomery.persistence.repository.TraineeInterface;

public class TraineeImpl implements TraineeBusInterface {
	
	@Inject
	private TraineeInterface repo;

	@Override
	public String getAllTrainees() {
		return repo.getAllTrainees();
	}

	@Override
	public String getAllTraineesInClassroom(Long id) {
		return repo.getAllTraineesInClassroom(id);
	}

	@Override
	public String amendTrainee(Long id, String updatedTrainee) {
		return repo.amendTrainee(id, updatedTrainee);
	}

	@Override
	public String createTrainee(String trainee) {
		return repo.createTrainee(trainee);
	}

	@Override
	public String removeTrainee() {
		return repo.removeTrainee(id);
	}

}
