package wipro.com.fms.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FacultyDTO {
	
	private long id;
	private String facultyName;
	private String course;
	private double salary;

}
