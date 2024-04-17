package basic.exercise;

import java.util.Scanner;

public class Exercise4 {
	// 코드의 시작(메인함수)
	public static void main(String[] args) {

		boolean flag = true;

		int choice;

		while (flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n메뉴 선택"); // \n --> 무조건 한줄 내림
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.print("선택 : ");

			choice = sc.nextInt();
			// int choice = sc.nextInt();
			// if else if else 사용시 조건식에 범위 점차 크게 설정해야한다.
			if (choice == 1) {
				System.out.println("등록을 선택했습니다.");
			} else if (choice == 2) {
				System.out.println("조회을 선택했습니다.");
			} else if (choice == 3) {
				System.out.println("수정을 선택했습니다.");
			} else if (choice == 4) {
				System.out.println("삭제을 선택했습니다.");
			} else if (choice == 0) {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
			} // end of if

		} // end of while

		// 만약. . . 사용자 1 -->

	} // end of main

}
// end of class
