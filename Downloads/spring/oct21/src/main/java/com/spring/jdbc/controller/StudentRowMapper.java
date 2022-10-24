package com.spring.jdbc.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.model.Student;

public class StudentRowMapper implements RowMapper <Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student st = new Student(rs.getString("stu_id"), rs.getString("first_name"), rs.getString("last_name"),rs.getDate("joining_date"));
	
		return st;
	}

}
