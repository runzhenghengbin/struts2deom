package com.zhb.action;

import com.opensymphony.xwork2.ActionSupport;


public class HelloWorldAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("ִ��Action");
		return SUCCESS;
	}


}
