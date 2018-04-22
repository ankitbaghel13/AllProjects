package cxfrestservice.internal;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import cxfrestservice.CxfRestService;
import cxfrestservice.dao.EmployeeDao;

public class CxfRestServiceImpl implements CxfRestService{

	@Autowired
	public EmployeeDao employeeDao;
	
	public Response getEmployeeDetail(String employeeId) {

		if(employeeId == null){
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok(employeeDao.getEmployeeDetails(employeeId)).build();
	}

	
}
