package com.rbsample_springBootMybatisHsqldb;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IStudentMapper {

	void saveStudent(Student student);
	List<Student> getStudents();
}
