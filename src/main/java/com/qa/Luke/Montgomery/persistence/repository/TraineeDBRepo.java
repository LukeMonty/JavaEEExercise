package com.qa.Luke.Montgomery.persistence.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.qa.Luke.Montgomery.util.*;

@Transactional(SUPPORTS)
public class TraineeDBRepo implements TraineeInterface {
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil json;

	public String getAllTrainees() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAllTraineesInClassroom(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String amendTrainee(Long id, String updatedTrainee) {
		// TODO Auto-generated method stub
		return null;
	}

	public String createTrainee(String trainee) {
		// TODO Auto-generated method stub
		return null;
	}

	public String removeTrainee() {
		// TODO Auto-generated method stub
		return null;
	}

}
