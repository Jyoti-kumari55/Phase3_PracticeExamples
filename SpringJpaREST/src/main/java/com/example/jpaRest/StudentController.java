package com.example.jpaRest;

import java.util.List;
import java.util.NoSuchElementException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentController {

	
	@Autowired
	StudentDAO dao;
	
	@PostMapping("insert")
	public Student insert(@RequestBody Student s) {
	return dao.insert(s);
	}
	
	@PostMapping("insertall")
	public List<Student> insertall(@RequestBody List<Student> s){
		return dao.insertall(s);
		
	}
	@GetMapping("student")
	public List<Student> list() {
	    return dao.getall();
	}
	
	@GetMapping("getbyid/{id}")
	public Student getByid(@PathVariable int id) {
		return dao.getByid(id);
	}
	
	@DeleteMapping("delete/{id}")
	public void delete( @PathVariable int id) {
	    dao.deleteByid(id);
	}
	@PutMapping("update")
	public Student update(@RequestBody Student s) {
		return dao.update(s);
	}
}