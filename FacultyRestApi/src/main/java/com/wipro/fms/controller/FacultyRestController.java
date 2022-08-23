package com.wipro.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.fms.entity.Faculty;
import com.wipro.fms.service.IFacultyService;

import wipro.com.fms.dto.FacultyDTO;

@RestController
@RequestMapping("api/v1/faculties")
public class FacultyRestController {
	
	@Autowired
	IFacultyService service;
	
	@PostMapping("/add")
	public Faculty addFaculty(@RequestBody FacultyDTO dto) {
		
		return service.addFaculty(dto);
	}
	
	
	@GetMapping("/get-all")
	public List<Faculty> getAll(){
		
		return service.getAllFaculties();
	}
	
	@DeleteMapping("/deleteFacultyById/{id}")
	public void deleteFacultyById(@PathVariable long id) {
		
		 service.deleteFacultyById(id);
		
		
	}
	
	@PutMapping("/updateFacultyDetails")
	public Faculty updateFacultyDetails(@RequestBody Faculty faculty ) {
		
		return service.updateFacultyDetails(faculty);
	}
	

}
