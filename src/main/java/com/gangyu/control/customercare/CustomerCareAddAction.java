package com.gangyu.control.customercare;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

import com.gangyu.model.CustomerCareInfo;
import com.gangyu.service.CustomerCareService;
import com.gangyu.service.imp.CustomerCareServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerCareAddAction extends ActionSupport {
	
	private boolean mark;
	
	public String add() throws Exception {
		// TODO Auto-generated method stub
		
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		
		request.setCharacterEncoding("utf-8");
		
		String careTheme = request.getParameter("careTheme");
		String careTimeString = request.getParameter("careTime");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
	    Date careTime = sdf.parse(careTimeString);
	    
		String careNexttimeString = request.getParameter("careNexttime");
		Date careNexttime = sdf.parse(careNexttimeString);
		
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		String carePeople = request.getParameter("carePeople");
		String careWay = request.getParameter("careWay");
		String careRemark = request.getParameter("careRemark");
		String customerName = request.getParameter("customerName");
		String isUsed = request.getParameter("isUsed"); 
		
		
		CustomerCareInfo cci = new CustomerCareInfo();
		cci.setCareTheme(careTheme);
		cci.setCareTime(careTime);
		cci.setCareNexttime(careNexttime);
		cci.setCarePeople(carePeople);
		cci.setCareRemark(careRemark);
		cci.setCareWay(careWay);
		cci.setCustomerId(customerId);
		cci.setCustomerName(customerName);
		cci.setIsUsed(isUsed);
		
		CustomerCareService dao = new CustomerCareServiceImpl();
		
		mark = dao.add(cci);
		
		if(mark)
		{
			/*System.out.println(carePeople);
			System.out.println(careTime);*/
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
	
}
