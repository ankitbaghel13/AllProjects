package cxfrestservice.internal;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import cxfrestservice.CxfRestService;
import cxfrestservice.dao.EmployeeDao;

public class CxfRestServiceImpl implements CxfRestService{

	@Autowired
	public EmployeeDao employeeDao;
	
	public Response getEmployeeDetail(String employeeId) {
		
		System.out.println("Hiiii 3");

		if(employeeId == null){
			return Response.status(Response.Status.BAD_GATEWAY).build();
		}
		else if(Integer.valueOf(employeeId)==1){
			System.out.println(employeeId.getClass());
			return Response.status(Response.Status.ACCEPTED).build();
		}
		return Response.ok(employeeDao.getEmployeeDetails(employeeId)).build();
	}

	
}
