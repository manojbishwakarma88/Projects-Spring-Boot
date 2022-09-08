package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentrepo;
	

//	getAllData
	
	public List<Student> getAllStudent(){
		return studentrepo.findAll();		
	}
//	post
	public void postStudent(@RequestBody Student st) {
		studentrepo.save(st);
	}
	public  void updatestudent(@RequestBody Student st) {
		studentrepo.save(st);
		
//	}
}
	public void deleteStudent( @PathVariable Integer rollno) {
	  studentrepo.deleteById(rollno);
	}
	public Optional<Student> getstudentById( @PathVariable Integer rollno) {
	
		return studentrepo.findById(rollno);
	}
}