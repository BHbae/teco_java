package basic.ch03;

public class Operation2 {

	public static void main(String[] args) {
		
		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		// 고민해볼 사항
		//int result4 = 5.0 / 3;
		double result4 = 5.0 / 3;
		int result5 = 5 % 3;
		
		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		System.out.println("result3 " + result3);
		System.out.println("result4 " + result4);
		System.out.println("result5 " + result5);
		
		// 문제
		// 1.(12+3)/3 값을 화면에 출력해보세요
		// 변수명, 데이터 유형 스스로 결정하고 식을 만들어 보세요
		int a1 = (12 + 3);
		System.out.println("1번 답 : " + a1/3);
		
		
		// 2. (25 % 2) 값을 화면에 출력해보세요
		// 어떤수를 2로 나누었을 떄 나머지가 0이면 짝수 1이면 홀수
		int a2 = 25 % 2;
		System.out.println("2번 답 : " + a2);
		
		// 3. 15를 4로 나눈후, 그 결과의 절대 값을 출력하시오
		int a3 = 15 / 4;
		System.out.println("3번 답 : " + Math.abs(a3));
		
		// 도전 문제
		// 직접 산술 연산자 문제 만들기 - (2문제 새성)
		
		int Class = 30;
		int Strob = 66;
		int tomato = 44;
		
		double tomato1 = (tomato/ Class);
		System.out.println("토마토 받은 학생수 : " + tomato1);
		
		
		
		

	} //end of main

} // end of class
