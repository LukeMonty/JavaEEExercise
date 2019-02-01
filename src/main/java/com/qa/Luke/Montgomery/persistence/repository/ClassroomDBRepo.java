package com.qa.Luke.Montgomery.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.Luke.Montgomery.persistence.domain.Classroom;
import com.qa.Luke.Montgomery.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ClassroomDBRepo implements ClassroomInterface {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil json;

	public String getAllClassrooms() {
		Query query = manager.createQuery("SELECT a FROM Classroom a");
		return json.getJSONForObject(query.getResultList());
	}


	public String getAllTrainers() {
		Query query = manager.createQuery("SELECT trainer FROM Classroom");
		return json.getJSONForObject(query.getResultList());
	}

	@Transactional(REQUIRED)
	public String createNewClassroom(String classroom) {
		Classroom newClassroom = json.getObjectForJSON(classroom, Classroom.class);
		manager.persist(newClassroom);
		return "New Classroom made";
	}
	@Transactional(REQUIRED)
	public String changeTrainer(Long id, String updatedClassroom) {
		
		Classroom updated = json.getObjectForJSON(updatedClassroom, Classroom.class);
		manager.createQuery("UPDATE CLASSROOM SET trainer = " + updatedClassroom + " WHERE id = " + id);
		return "Successfully updated";
	}
	@Transactional(REQUIRED)
	public String removeClassroom(Long id) {
		Classroom c = manager.find(Classroom.class, id);
		if(manager.contains(c)) {
			return "Classroom " + c + " has been removed";
		} else {
			return "Classroom doesn't exist";
		}
		
	}

}
