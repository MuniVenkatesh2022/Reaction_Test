package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.model.Student;
import com.student.repository.StudentRepository;


@Controller
public class StudentController {
	
	
	@Autowired
	StudentRepository sRepo;
	
	@RequestMapping(path = "/studentlist")
	public String getStudentList(Model model)
	{
		List<Student> studentList=sRepo.findAll();
		model.addAttribute("studentList", studentList);
		return"student_list";
	}
	
	@RequestMapping(path = "/addStudentList")
	public String addStudentList(Model model)
	{
		Student s=new Student();
		model.addAttribute("s", s);
		return "add-student-list";
	}
	
	@RequestMapping(path = "/saveStudentList")
	public String saveStudentList(@ModelAttribute("s") Student s)
	{
		sRepo.save(s);
		return "redirect:/studentlist";
	}
	
	@RequestMapping(path = "/updateDetails/{id}")
	public String updateDetails(@PathVariable(value = "id")int id,Model model)
	{
		Optional<Student> s=sRepo.findById(id);
		model.addAttribute("s", s);
		return "update_details";	
	}
	
	@RequestMapping(path = "/deleteDetails/{id}")
	public String deleteDetails(@PathVariable(value = "id")int id)
	{
		sRepo.deleteById(id);
		return "redirect:/studentlist";
	}	
}
