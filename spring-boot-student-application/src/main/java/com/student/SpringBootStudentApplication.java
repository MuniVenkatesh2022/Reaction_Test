package com.student;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.student.model.Student;
import com.student.repository.StudentRepository;

@SpringBootApplication
public class SpringBootStudentApplication {

	public static void main(String[] args) {
		 ApplicationContext context= SpringApplication.run(SpringBootStudentApplication.class, args);
		 
		 StudentRepository srpo= context.getBean(StudentRepository.class);
		 
		 //Student s=new Student("Muni","MCA",'M',23,9441352693l,"muni@gmail.com","12-394 AP");
			/*
			 * Student s1=new Student("Venkateh","BTech",'M',21,9988776654l,
			 * "venkatesh@gmail.com","23-87 Gandhi Nagar"); Student s2=new
			 * Student("Lakshmi","BE",'F',20,9441527153l,
			 * "lakshmi@gmail.com","39-23 shivali AP"); Student s3=new
			 * Student("Likitha","BSc",'F',19,9865776654l,
			 * "likitha@gmail.com","86-23 Nehru Nagar");
			 * 
			 * List<Student> list=List.of(s1,s2,s3);
			 * 
			 * srpo.saveAll(list);
			 */
	}

}
