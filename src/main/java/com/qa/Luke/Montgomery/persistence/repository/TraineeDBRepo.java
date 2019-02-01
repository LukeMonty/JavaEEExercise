package com.qa.Luke.Montgomery.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.Luke.Montgomery.persistence.domain.Trainee;
import com.qa.Luke.Montgomery.util.*;

@Transactional(SUPPORTS)
@Default
public class TraineeDBRepo implements TraineeInterface {
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil json;

	public String getAllTrainees() {
		Query query = manager.createQuery("SELECT t FROM Trainee t");
		return json.getJSONForObject(query.getResultList());
	}

	public String getAllTraineesInClassroom(Long id) {
		Query query = manager.createQuery("SELECT t FROM Trainee t WHERE id = " + id);
		return json.getJSONForObject(query.getResultList());
	}
	@Transactional(REQUIRED)
	public String amendTrainee(Long id, String updatedTrainee) {
		Trainee t = json.getObjectForJSON(updatedTrainee, Trainee.class);
		manager.createQuery("UPDATE TRAINEE SET name = " + t.getName(), Trainee.class);
		return "Update successful";
	}
	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		Trainee t = json.getObjectForJSON(trainee, Trainee.class);
		manager.persist(t);
		return "Trainee successfully created";
	}
	@Transactional(REQUIRED)
	public String removeTrainee(Long id) {
		Trainee t = manager.find(Trainee.class, id);
		if(manager.contains(t)) {
			manager.remove(t);
			return "Trainee " + t.getName() + " has been removed";
		} else {
			return "Trainee doesn't exist";
		}
		
	}

}
