package basic.ch02;

public class TraingleArea {

	public static void main(String[] args) {
		
		// 삼각형의 밑변 BASE ,  단 상수로 선언
		// 삼각형의 높이 HEIGHT ,  단 상수로 선언
		// 결과 값을 area 변수에 저장
		
		final double BASE = 13;
		final double HIGHT = 6;
		
		double area = (BASE*HIGHT) / 2; 
		
		
		//결과 출력 하기
		System.out.println("삼각형의 면적 : " +area);
		

	} // end of main

} // end of class
