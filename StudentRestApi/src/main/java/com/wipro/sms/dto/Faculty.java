package com.wipro.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Faculty {
	
	private long id;
	private String facultyName;
	private String course;
	private double salary;

}
