package Aug_5;

public class Client {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student(1,"Ritesh","AIDS",7.8);
		Student s2 = new Student(2,"Amit","ME",7.8);
		Student s3 = new Student(3,"Aditya","CSE",7.8);
		//Student s4 = new Student(4,"Onkar","ENTC",7.8);
		//Student s5 = new Student(5,"Samarth","CSE",7.8);
		
//		ArrayList<Student> list = new ArrayList<Student>();
//		list.add(s1);
//		list.add(s2);
//		list.add(s3);
//		list.add(s4);
//		list.add(s5);
		
		StudentDOAImpl studentDOAImpl = new StudentDOAImpl();
		studentDOAImpl.saveStudent(s3);
		
	}

}
