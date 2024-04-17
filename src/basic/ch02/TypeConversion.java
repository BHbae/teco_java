package basic.ch02;
/**
 * 형변이란?
 * 데이터 타입을 다른 타입으로 변경 하는것
 * 자동 형변환, 강제 형변환 
 */
public class TypeConversion {
	
	// 코드의 시작점
	public static void main(String[] args) {
		
		int intDataBox = 100; //4byte
		double doubleDataBox; // 8byte
		
		doubleDataBox = intDataBox; 
		//작은 상자에서 큰상자로 들어가는 개념이다.
		System.out.println(doubleDataBox);
		// 자동 형변환 이다.
		
		System.out.println("--------------------");
		
		
		// 그럼 강제 형 변환이란
		final double PI = 3.14159;
		
		// int intBox = PI; // 컴파일러가 작은상자에 큰상자로 값을 넣을 수 없다.!
		//컴파일러야 괜찮으니깐 그냥 강제로 넣어
		int intBox = (int)PI;
		System.out.println(intBox);
		//소수점 값을 그냥 버려 버림
		
		// 연습
		double interstRate;
		int discount;
		
		interstRate = 15.5;
		discount = (int)interstRate;
		System.out.println(discount);
		
		System.out.println( (int)7.5 );
		

	} // end of main
	

}  // end of class
