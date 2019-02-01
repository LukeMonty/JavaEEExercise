package com.qa.Luke.Montgomery.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.Luke.Montgomery.business.ClassroomBusInterface;
@Path("/classroom")
public class ClassroomREST {
	
	@Inject
	private ClassroomBusInterface business;
	@Path("/getAllClassrooms")
	@GET
	@Produces({ "application/json" })
	public String getAllClassrooms() {
		return business.getAllClassrooms();
	}
	@Path("/getAllTrainers")
	@GET
	@Produces({ "application/json" })
	public String getAllTrainers() {
		return business.getAllTrainers();
	}
	@Path("/createNewClassroom")
	@POST
	@Produces({ "application/json" })
	public String createNewClassroom(String classroom) {
		return business.createNewClassroom(classroom);
	}
	
	@Path("/changeTrainer")
	@PUT
	@Produces({ "application/json" })
	public String changeTrainer(Long id, String updatedClassroom) {
		return business.changeTrainer(id, updatedClassroom);
	}
	
	@Path("/removeClassroom")
	@DELETE
	@Produces({ "application/json" })
	public String removeClassroom(Long id) {
		return business.removeClassroom(id);
	}

}
