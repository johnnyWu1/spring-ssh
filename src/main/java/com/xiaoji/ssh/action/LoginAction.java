package com.xiaoji.ssh.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaoji.ssh.service.UserService;

/** 

 * Struts2基于注解的Action配置

 *  ParentPackage 继承父包
 *  Namespace命名空间
 *  Results跳转页面
 *  Action访问方法
 */   

@ParentPackage("struts-default") 

@Namespace("/login") 

@Results( { @Result(name = "success", location = "/views/main.jsp"), 

        @Result(name = "error", location = "/views/error.jsp") }) 

@ExceptionMappings( { @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") }) 
public class LoginAction extends ActionSupport {
	
	private String username;
	private String password;
	
	@Autowired
	private UserService userService;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Action(value="",results={@Result(name="success",location= "/index.jsp")})
	public String index(){
		return SUCCESS;
	}
	
	@Action(value="doLogin",results={@Result(name="success",location= "/index.jsp")})
	public String doLogin(){
		boolean ok = userService.checkLogin(username, password);
		if(ok){
			return SUCCESS;
		}else{
			return ERROR;
		}
		
		
	}
	
	
	
}
