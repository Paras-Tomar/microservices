package com.wipro.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.sms.dto.StudentDTO;
import com.wipro.sms.entities.Student;
import com.wipro.sms.repository.StudentRepository;

@Service
public class StudentServiceImp implements IStudentService {

	@Autowired
	private  StudentRepository repo;
	
	
	@Override
	public Student addStudent(StudentDTO dto) {
	
		Student student = new Student();
		
			student.setUname(dto.getUname());
			student.setPassword(dto.getPassword());
			student.setGender(dto.getGender());
			student.setEmail(dto.getEmail());
			student.setPhone(dto.getPhone());
			student.setDob(dto.getDob());
			student.setCourse(dto.getCourse());
			
			
			
			return repo.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
	public static boolean  validateStudent(StudentDTO dto) {
		
		boolean flag = false;
		
			if(dto.getUname() != null && dto.getPassword() !=null) {
				
				
				
				flag = true;
				
			}
		
		return flag;
		
	}
	
	

}
