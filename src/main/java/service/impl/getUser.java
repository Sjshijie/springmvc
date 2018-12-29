package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.getUserInfo;
import entity.user;


@Service
public class getUser  {

	@Autowired
	private getUserInfo dao;
	
	public List<user> getUserList() {
		// TODO Auto-generated method stub
		return this.dao.getUser();
	}

}
