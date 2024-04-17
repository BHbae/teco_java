package basic.ch09;

import java.util.Scanner;

public class GoingToSchool {
	// 메인함수
	public static void main(String[] args) {

		// 객체 체지향 프로그래밍이란 객체와 객체간에 관계를 형성 하고
		// 상호 작용 하세 프로그래밍 하는 것

		// 설계된 클래스를 가지고 본인이 의도한 대호
		// 실행에 흐름을 만들어보자.

		// 스캐너를 활용해서 1번을 누르면 버스를 태워서
		// 실행에 흐름 만들기

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int choice;
//				Bus bus2 = new Bus(200);
//				Student s2 = new Student("오른", 100_100);

		while (flag) {
			choice = sc.nextInt();

			if (choice == 1) {
				Bus bus1 = new Bus(100);
				Student s1 = new Student("오른", 100_000);
				s1.TakeBus(bus1);
				s1.showInfo();
			} else {
				System.out.println("다시 선택해주세요");
			}
			return;
		}
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);

	}// end of main

} // end of class
