package com.rbsample_springBootMybatisHsqldb;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RbsampleSpringBootMybatisHsqldbApplicationTests {

	@Autowired
	IUserMapper userMapper;

	@Autowired
	IStudentMapper studentMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void saveUser() {
		User user = new User(111, "t1", "in");

		userMapper.saveUser(user);
		List<User> users = userMapper.getUsers();

		users.forEach(uer -> System.out.println(uer));

		System.out.println("=============================================");

		User user2 = new User(111, "t2", "us");

		userMapper.saveUser(user2);
		List<User> users2 = userMapper.getUsers();

		users2.forEach(us2 -> System.out.println(us2));

		System.out.println("=============================================");
	}

	@Test
	public void saveStudent() {
		Student student = new Student(111, "st1", "G");

		studentMapper.saveStudent(student);

		List<Student> stud1 = studentMapper.getStudents();

		stud1.forEach(stu1 -> System.out.println(stu1));

		System.out.println("=============================================");

		Student student2 = new Student(111, "st3", "B");

		studentMapper.saveStudent(student2);

		List<Student> stud2 = studentMapper.getStudents();

		stud2.forEach(stu2 -> System.out.println(stu2));

		System.out.println("=============================================");
	}

}
