package basic.exercise;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
		System.out.println("성적을 입력하세요 (0-100): ");
		Scanner Scanner = new Scanner(System.in);
        int score = Scanner.nextInt();
        
        
        char grade = 'X'; // 초기값을 'X'로 설정해 잘못된 입력을 쉽게 확인
        String message = ""; // 추가적인 피드백 메시지
        
        
        if (score <= 100 || score <= 90) {
        	System.out.println("A학점입니다.");
        } else if (score <= 80 || score > 90) {
        	System.out.println("B학점입니다.");
        } else if (score <= 70 || score > 80 ) {
        	System.out.println("C학점입니다.");
        } else if (score <= 60 || score >70 ) {
        	System.out.println("D학점입니다.");
        } else {
        	System.out.println("F학점입니다.");
        }
        
        
        // .. 코드를 작성해주세요 
        // 힌트 - 비교 연산자와 논리연사자를 활용 
        // ...
        
        
        Scanner.close(); // 자원 닫기 
		

	}

}
