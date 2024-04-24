package basic.ch19;

public class Classroom {

	private String className;
	private Student[] students;
	private int studentCount;
	private final int MAX_STUDEND = 30;

	public Classroom(String className) {
		this.className = className;
		students = new Student[MAX_STUDEND];
		this.studentCount = 0;
	}

	// 학생을 추가하는 기능 만들기
	public void addStudent(Student student) {
		if (studentCount < MAX_STUDEND) {
			students[studentCount] = student;
			studentCount++;
		} else {
			System.out.println("정원초가");
		}
	}

	// 학급에 속한 모든 학생 정보를 출력하는 기능을 만드시오
	public void showStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println("name : " + students[i].getName() + " , age : " + students[i].getAge());
			}
		}

	}

}
