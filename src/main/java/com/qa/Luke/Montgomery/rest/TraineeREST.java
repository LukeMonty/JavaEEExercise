package com.qa.Luke.Montgomery.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.qa.Luke.Montgomery.business.TraineeBusInterface;

@Path("/trainee")
public class TraineeREST {
	
	@Inject
	private TraineeBusInterface business;
	
	@Path("/getAllTrainees")
	@GET
	@Produces({"application/json"})
	public String getAllAccounts() {
		return business.getAllTrainees();
	}
	
	@Path("/getAllTraineesInClassroom")
	@GET
	@Produces({"application/json"})
	public String getAllTraineesInClassroom(Long id) {
		return business.getAllTraineesInClassroom(id);
	}
	
	@Path("/ammendTrainee")
	@PUT
	@Produces({"application/json"})
	public String amendTrainee(Long id, String updatedTrainee) {
		return business.amendTrainee(id, updatedTrainee);
	}
	
	@Path("/createTrainee")
	@POST
	@Produces({"application/json"})
	public String createTrainee(String trainee) {
		return business.createTrainee(trainee);
	}
	
	@Path("/removeTrainee")
	@DELETE
	@Produces({"application/json"})
	public String removeTrainee(Long id) {
		return business.removeTrainee(id);
	}

}
