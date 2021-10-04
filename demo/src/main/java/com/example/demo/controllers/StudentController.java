package com.example.demo.controllers;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Students;

@RestController
public class StudentController {
static List<Students> list=new CopyOnWriteArrayList<>();
	static {
		
		list.add(new Students(101,"ram",25));
		list.add(new Students(102,"rupam",26));
		list.add(new Students(103,"rajiv",28));
		list.add(new Students(104,"sumit",20));
	
	}
	
	@GetMapping("/students")
	public List<Students> getStudent()
	{
		return list;
	}
	@PostMapping("/students")
	public Students saveStudent(@RequestBody Students student)
	{
		list.add(student);
		return student;
		
	}
	@DeleteMapping("/students/{id}")
	public Boolean deleteStudent(@PathVariable int id)
	{
	Boolean result=false;
	 for (Students students : list) {
		if(students.getId()==id)
		{
			result=list.remove(students);
		}
	}
	 return result;
	}
	
}
