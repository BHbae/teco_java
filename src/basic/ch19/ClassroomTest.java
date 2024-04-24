package basic.ch19;

public class ClassroomTest {
	
	public static void main(String[] args) {
		
		Classroom classroomA = new Classroom("C4");
		Student student1 = new Student("현수", 31);
		Student student2 = new Student("민영", 32);
		
		classroomA.addStudent(student1);
		classroomA.addStudent(student2);
		classroomA.showStudents();
		
	}

}
