package basic.ch07;
/**
 * 객체의 속성은 멤버 변수로
 * 객체의 기능은 메서드로 구련한다.
 */
public class Student {
	
	// 멤버 변수
	// 특징 - 초기화 값을 넣지 않는 다면 ㅣ본 값으로 초기호하된다.
	// new . .생성 -->>>heap 메모리에 올라갔을 시 값이 없다면 기본값으로 초기화된다.
	int studentID;
	String studentNAME;
	String address;
	
	// 메서드 설계 하기
	public void study() {
		System.out.println(studentNAME +"학생이 공부를 합니다.");
	}
	
	public void breakTime() {
		System.out.println(studentNAME +"학생이 휴식을 합니다.");
	}
	
	public void showInfo() {
		System.out.println("-----------------------------");
		System.out.println("학생 ID " + studentID);
		System.out.println("학생 이름 " + studentNAME);
		System.out.println("학생 주소 " + address);
	}
	
	//메서드란?
	// 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
	// 멤버함수(memver funcion)이라고도 한다.
	// 메서드 - 멤버 변수을 활용해서 기능을 구현한다.
	
}// end of class
