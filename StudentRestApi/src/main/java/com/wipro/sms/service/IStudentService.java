package com.wipro.sms.service;

import java.util.List;

import com.wipro.sms.dto.StudentDTO;
import com.wipro.sms.entities.Student;

public interface IStudentService {

	
	public  Student addStudent(StudentDTO dto);
	
	public   List<Student>    getAllStudents();
	
	
}
