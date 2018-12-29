package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.user;
import model.Result;
import model.abc;
import service.impl.getUser;

@Controller
public class test {
	@Autowired
	private getUser get;
	@RequestMapping(value="/nihao",method={RequestMethod.POST})
	public@ResponseBody Result haha(HttpServletRequest request) {
		Result a=new Result();
		List<user> u=get.getUserList();
		a.setA(u);
		
		return a;
	}
	
	
}
