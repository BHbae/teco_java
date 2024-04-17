package basic.exercise;

import java.util.Scanner;

public class IfExercise1 {

	public static void main(String[] args) {
		
		
		System.out.println("성적을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int abc = sc.nextInt(); 
		
		System.out.println("로깅 - 받은 값 확인: " + abc);
		if (abc >= 90) {
			System.out.println("A학점입니다.");
		} else if (abc >= 80) {
			System.out.println("B학점입니다.");
		} else if (abc >= 70) {
			System.out.println("C학점입니다.");
		} else if (abc >= 60) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		} // end of if

		// 조건문을 완성 하세요
		// 90점 이상 -> A 학점 입니다.
		// 80점 이상 -> B 학점 입니다.
		// 70점 이상 -> C 학점 입니다.
		// 60점 이상 -> D 학점 입니다.
		// 59점 이하 -> F 학점 입니다.


	}

}
