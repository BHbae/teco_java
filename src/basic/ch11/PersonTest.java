package basic.ch11;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person person1 = new Person("홍길동", 100);
		Person personBox = person1;
		Person personBox2 = person1.getPerson();
		Person personLee = new Person("이순신", 101);
		System.out.println("--------------------------");
		// 위코드까지는 Heap 메모리 영역에 객체 2개가 생겅된상태이다.
		// 지역변수인 person1, personBox, personBox2 는 같은 객체를 가리킨다.
		
		// 연습 문제 -
		// setName 메서드를 만들자
		
		personBox2.setName("티모");
		person1.showInfo();
		
	}// end of main

} // end of class
