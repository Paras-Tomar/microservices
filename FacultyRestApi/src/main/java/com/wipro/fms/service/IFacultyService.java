package com.wipro.fms.service;

import java.util.List;

import com.wipro.fms.entity.Faculty;

import wipro.com.fms.dto.FacultyDTO;



public interface IFacultyService {
	
   public  Faculty addFaculty(FacultyDTO dto);
	
   public   List<Faculty>    getAllFaculties();
	
   public void deleteFacultyById(long id);

   public Faculty updateFacultyDetails(Faculty faculty);

	

}
