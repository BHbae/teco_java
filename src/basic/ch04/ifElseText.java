package basic.ch04;

public class ifElseText {

	// 코드의 시작점 (메인 함수) 
	public static void main(String[] args) {
		
		// 조건문(제어문) if 
		// 주어진 조건에 따라서 실행이 이루어 지도록 흐름을 만든다. 
		// if ..... -> 만약 ... 이라면 
		
		boolean flag = true; 
		
		if(flag) {
			// 수행 구문
			System.out.println("출력됩니다.");
			flag = false; 
			
		} // end of if -> 블록에 범위를 기억 하자   
		// if 문 단독은 수행 될 수도 있고 안될 수도 있다. 
		
		System.out.println("코드가 여기까지 내려 옴. : " + flag);
		
	} // end of main 
	
} // end of class 
