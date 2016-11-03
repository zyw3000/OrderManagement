package com.ordermanagement.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

public class BaseActionSupport extends ActionSupport implements ServletRequestAware,ServletResponseAware{

	protected static ApplicationContext context=
		new ClassPathXmlApplicationContext("applicationContext.xml");
	protected HttpServletResponse res;
	protected HttpServletRequest req;
	
	public void setServletRequest(HttpServletRequest req) {
		this.req=req;
	}

	public void setServletResponse(HttpServletResponse res) {
		this.res=res;
	}
	
	public void post(String jsonString) throws IOException{
		PrintWriter out=res.getWriter();
		out.print(jsonString);
		out.flush();
		out.close();
	}
}
