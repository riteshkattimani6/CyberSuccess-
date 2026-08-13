package Aug_5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class StudentDOAImpl implements StudentDAO {

	@Override
	public void saveStudent(Student student) throws Exception {
		 Connection con = DBUtil.createConnection();
		 String sql = "insert into student (id,name,course,cgpa) values(?,?,?,?)";
		 PreparedStatement statement =  con.prepareStatement(sql);
		 statement.setInt(1, student.getId());
		 statement.setString(2, student.getName());
		 statement.setString(3, student.getCourse());
		 statement.setDouble(4, student.getCgpa());
		 statement.execute();
	}

	@Override
	public Student getStudent(int id) {
		
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		
		return null;
	}

	@Override
	public void updateStudent(Student student) {
		
		
	}

	@Override
	public void deleteStudent(int id) {
		
		
	}

	@Override
	public void deleteAllStudent() {
		
		
	}

}
