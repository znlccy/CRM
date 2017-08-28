package com.gangyu.control.customercare;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.gangyu.service.CustomerCareService;
import com.gangyu.service.imp.CustomerCareServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Chencongye
 * @version 0.0.0.1
 * @
 */
public class CustomerCareDeleteAction extends ActionSupport {
	
	//声明一个标签
	private boolean mark;
	
	public String delete() throws Exception {
		// TODO Auto-generated method stub
		
		//用来获取客户端浏览器提交的参数			
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		
		//设置客户端提交参数的编码格式和响应给客户端的编码格式
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String careId = request.getParameter("careId");
		
		CustomerCareService ccs = new CustomerCareServiceImpl();
		
		mark = ccs.delete(Integer.parseInt(careId));
		
		if (!mark) {
			System.out.println(mark);
			return SUCCESS;
		}
		else
		{
			System.out.println(mark);
			return ERROR;
		}
	}
}
