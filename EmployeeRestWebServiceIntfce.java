package com.cg.webservice;

import java.util.Map;

import javax.jws.WebService;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.cg.model.Employee;

@WebService(name = "EmployeeRestWebServiceIntfce", targetNamespace = "http://webservice.cg.com/")
@Path("/EmployeeServiceInterface/")
@Consumes({"application/xml","application/json"})
@Produces({"application/xml","application/json"})


public interface EmployeeRestWebServiceIntfce {
	@GET
	@Path("/saveEmployee/{id}/{name}/{salary}/{designation}")
	public Map<Integer,Employee> saveEmployee(@PathParam("id")int id,@PathParam("name")String name,@PathParam("salary")float salary,@PathParam("designation")String designation);
	@DELETE
	@Path("/deleteEmployee/{id}")
	public void deleteEmployee(@PathParam("id")int id);
	@GET
	@Path("/editEmployee/{id}")
	public void editEmployee(@PathParam("id")int id,@PathParam("name")String name,@PathParam("salary")float salary,@PathParam("designation")String designation);
	@GET
	@Path("/fetchEmployee/{id}")
	public Map<Integer,Employee> fetchEmployee( @PathParam("id")int id, @PathParam("name")String name,@PathParam("salary")float salary,@PathParam("designation") String designation);
	@GET
	@Path("/showEmployee")
	public Map<Integer,Employee> showEmployee();
	
	

}
