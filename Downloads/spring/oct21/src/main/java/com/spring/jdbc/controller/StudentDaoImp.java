package com.spring.jdbc.controller;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.spring.jdbc.model.Student;

public class StudentDaoImp extends JdbcDaoSupport  implements StudentDao {

	private static String GET_ALL = "select * from stdent";
	public List<Student> getAllStudent() {
		List<Student> students= getJdbcTemplate().query(GET_ALL, new StudentRowMapper());
		return students;
	}

}
