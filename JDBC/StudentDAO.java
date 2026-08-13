package Aug_5;

import java.util.List;

public interface StudentDAO {
	void saveStudent	(Student student) throws Exception;
	Student getStudent(int id);
	List<Student> getAllStudent();
	void updateStudent(Student student);
	void deleteStudent(int id);
	void deleteAllStudent();
	
	
}
