package com.ust.exam.controller;



import java.util.List;
//import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.ust.exam.dao.DoctorDAO;
import com.ust.exam.domine.Doctor;

//Fill your code
@RestController
@RequestMapping("/doctor")
@EnableAutoConfiguration
public class DoctorController {
	
	@Autowired
	DoctorDAO doctorDAO;


	@GetMapping("/getDoctors")
	public ResponseEntity<List<Doctor>> getDoctors() {
		//Fill your code
		return new ResponseEntity<List<Doctor>>(doctorDAO.list(), HttpStatus.OK) ;
		
	}
	
	@PostMapping("/createDoctor")
	public  ResponseEntity<Boolean> create( @RequestBody Doctor doctor) {
		return new ResponseEntity<>(doctorDAO.save(doctor), HttpStatus.CREATED);
		//Fill your code	
	}
	
	@GetMapping("/getDoctor/{id}")
	public ResponseEntity<Doctor> get(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(doctorDAO.get(id),HttpStatus.OK) ;
		//Fill your code
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Boolean> update(@PathVariable("id") Integer id, @RequestBody Doctor doctor) {
		//Fill your code
		return new ResponseEntity<>(doctorDAO.update(id, doctor),HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable("id") Integer id) {
		//Fill your code
		return new ResponseEntity<>( doctorDAO.delete(id),HttpStatus.OK);
	}
   
}
