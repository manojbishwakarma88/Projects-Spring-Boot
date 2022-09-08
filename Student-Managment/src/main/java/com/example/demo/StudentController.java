package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	
	//ApiCreation
	
		@GetMapping("/getdata")
		public List<Student> getStudent(){
			return studentservice.getAllStudent();
		}
		@GetMapping("/getdata/{rollno}")
		public Optional<Student> getById(@PathVariable Integer rollno) {
			return studentservice.getstudentById(rollno);
		}
	//	
		@PostMapping("/savestudent")
		public void postdata(@RequestBody Student st) {
			studentservice.postStudent(st);
		}
		
//		
		@PutMapping("/update")
		public void update(@RequestBody Student stu){
		   studentservice.postStudent(stu);
		}
		@DeleteMapping("/delete/{rollno}")
		public void deletedata(@PathVariable Integer rollno) {
			studentservice.deleteStudent(rollno);
		}

}
