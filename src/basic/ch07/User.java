package basic.ch07;

import basic.ch05.book;

public class User {

	String id;
	String password;
	String name;
	String gender;
	int age;
	
	// 패스워드 체크 기능 만들어 보기
	// 동사로 시작하는것이 권장 사항
	public boolean checkPasword(String inputPwd) {
		// 만약 나의 멤버 변수에 들어가 있는
		// password 값과 외부에서 넣을 ㅑㅞㅕ솆ㅇ 값이
		// 같다면 true 반환 아니면 false 반환
		// == 주소값, 산술식 사용한다.
		// 문자열 비교는 equals 라는 메서드를 사용한다.
		if(password.equals(inputPwd)) {
			return true;
		}
		return false;
	}
	
	// 독립적인 함수로서 여기서 실행 시킬 수 있다.
	public static void main(String[] args) {
		//User 클래스를 인스턴스화 시키자
		User user1 = new User(); // 메모리에 올라간다.(heep)
		user1.password = "123";
		
		User user2 = new User();
		user2.password = "555";
		
		System.out.println("-------------------------------------------------------");
		
		// user1 pwd 를 확인 하고 싶다
		//1
		boolean user1Result =  user1.checkPasword("333");
		System.out.println("user1 : " + user1Result);
		//2
		boolean user1Result2 = user1.checkPasword("123");
		System.out.println("user1 두번쨰 결과 : " + user1Result2);
		
		System.out.println("---------------------------------------------");
		
		// 참조 변수 user2 기능인  checkPassword 호출해서 결과를 확인 해주세요
		// --F
		// --T
		
		//실행에 흐름 만드는 방법 연습
		// if 구문을 활용
		// 콘솔창에 비밀번호가 틀렷습니다. 출력
		// 콘솔창에 비밀번호가 맞습니다. 출력
		
		boolean user2Result = user2.checkPasword("111");
//		System.out.println(user2Result + "비밀번호가 틀렷습니다");
//		boolean user2Result2 = user2.checkPasword("555");
//		System.out.println(user2Result2 + "비밀번호가 맞습니다");
		
		//boolean user2Result;
		if( user2 = user2Result ) {
			
		}
		
		
		
		
		
	}// end of main
	
}// end of class
