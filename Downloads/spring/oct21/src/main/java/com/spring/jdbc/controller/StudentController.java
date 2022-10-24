package com.spring.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.jdbc.model.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentDao dao;
	@RequestMapping("/getAllStudent")
	public ModelAndView getAllStudent(){
		List<Student> students = dao.getAllStudent();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("students");
		mv.addObject("students",students);
	 
		return mv;
	}

}
