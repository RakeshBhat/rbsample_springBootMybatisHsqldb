package com.rbsample_springBootMybatisHsqldb;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserMapper {

	void saveUser(User user);
	List<User> getUsers();
}
