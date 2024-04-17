package basic.ch06;

// 자의 모든 코드는 class xxx {} 블록안에 코드를 작성 하기로 약속 되어있다.
public class FuntionMainTest1 {

	// 메인 함수 void - 텅빈 (리턴값이 없다)
	public static void main(String[] args) {
		System.out.println("메인 함수를 시작 합니다");
		int result1 = add(5, 10);
		System.out.println("result1 : " + result1);
		
		int result2 = add(90, 80);
		System.out.println("result2 : " + result2);
		
	} // end of main
	
	// 두 수를 받아서 덧셈하는 함수를 만들자.
	static int add(int n1, int n2) {

		int result; // 변수 --> 지역변수
		result = n1 + n2;
		return  result;

	} // end of add (함수) - 함수 안에 선언하는 변수는 지역 변수

} // end of class


