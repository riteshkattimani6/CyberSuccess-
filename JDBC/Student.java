package Aug_5;

public class Student {
	int id;
	String name;
	String course;
	double cgpa;
	public Student() {
		super();
	}
	public Student(int id, String name, String course, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", cgpa=" + cgpa + "]";
	}
	
}
