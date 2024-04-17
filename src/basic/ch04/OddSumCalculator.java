package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator {

	public static void main(String[] args) {
		// 사용자의 입력 값을 박아서 1 부터 x 까지 숫자에 홀수를 덧샘하고 출력하라
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 입력 하세요 : ");
		int max = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= max; i +=2 ) {
			
			sum = (sum + i) ;
			
		} //  end of for
		
		System.out.println("sum : " + sum);
	} // end of main

} // end of class
