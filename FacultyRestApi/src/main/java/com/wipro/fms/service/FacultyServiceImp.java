package com.wipro.fms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.fms.entity.Faculty;
import com.wipro.fms.repository.FacultyRepository;

import wipro.com.fms.dto.FacultyDTO;

@Service
public class FacultyServiceImp implements IFacultyService {

	@Autowired
	FacultyRepository repo;
	
	@Override
	public Faculty addFaculty(FacultyDTO dto) {
		
		Faculty faculty = new Faculty();
		
		faculty.setFacultyName(dto.getFacultyName());
		faculty.setCourse(dto.getCourse());
		faculty.setSalary(dto.getSalary());
		
		
		return repo.save(faculty);
	}

	@Override
	public List<Faculty> getAllFaculties() {
		
		return repo.findAll();
	}
	
	@Override
	public void deleteFacultyById(long id) {
		
		 repo.deleteById(id);
	}
	
	@Override
	public Faculty updateFacultyDetails(Faculty faculty) {
		
		return repo.save(faculty);
	}
	
	
	

}
