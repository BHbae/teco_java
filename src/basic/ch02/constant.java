package basic.ch02;

/**
 * 컴파일 시점과
 * 런타임 시점
 * 
 * JAVA 명령어는 프로그램을 실행시키는 명형어이다.
 * JAVA 명형어는 번역하는 과정이다.
 * 
 * 자바 언어로 코드를 작성하고 있어요
 * JDK 도구를 설치해야 자바 프로그래밍 가능 -> 도구들이 존재
 * JDK --> JRE(자바프로그램 실행환경이라고 한다)
 * JRE --> JVM(자바 가상 머신)
 * JVM 은 .CLASS 파일을 실행 시켜주는 녀석이다.
 * JVM 은 어떤 연산을 거져 이진코드(바이너리 파일로 변환 시켜서 수랭하는 녀석이다)
 */

class constant {
	
	// 메인함수 - 코드의 시작점
	public static void main(String[] args) {
		
	// 상수선언 --> 값이 한번 정해지면 변경할 수 없는 수(값,데이터)	
	final int MAX_NUM =	10;
	final int MIN_NUM;
	MIN_NUM = 0;
	
	// MAX_NUM  = 100; // 컴파일 오류 발생 
	
	// crtl + s 누르면 IDE 툴이 javac Constant.java 명령어를 수행한다. 
	// 명령어의 결과로 Constant.clss 파일이 생성 된다. 
	// why? JVM 이해할 수 있는 언어이기 때문에 번역을 해주어야 한다. 
	
	System.out.println("------------------------");
	// 원주율 상수로 선언 
	final double PI = 3.14159;
	// 원에 반지름을 상수로 선언 하자. 
	final int RADIUS = 10; 
	
	// 원의 둘레 계산 
	System.out.println(2 * PI * RADIUS);
	// 원의 면적 계산 (원 내부의 공간의 크기) 
	System.out.println(PI * RADIUS * RADIUS);
		
	} //end of main

}  //end of class
