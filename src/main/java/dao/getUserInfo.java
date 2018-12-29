package dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import entity.user;
@MapperScan
public interface getUserInfo {
	public List<user> getUser() ;
}
