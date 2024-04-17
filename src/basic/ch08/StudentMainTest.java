package basic.ch08;

public class StudentMainTest {

	public static void main(String[] args) {

		Student s1 = new Student("오른", 101, 3); //객체
		// System.out.println(s1); // 주소값이 출려
		// s1.showInfo();
		
		// 연습문제
		// s2 참조 변수에 이름으로 학생을 메모리에 올리고
		// 호출해주세요
		Student s2 = new Student("병호", 33113311, 3);
		s2.showInfo();
		
		
		Student s3 = new Student();
		s3.name = "블리츠";
		s3.grade = 213;
		s3.number = 21212;
		s3.showInfo();
		
		// 생성자 여러개 만들어 줄 수 있다
		// 생성자 오버 로딩이라고 한다.
		
		
	} // end of main

} // end of class
