package basic.ex13;

public class LottoGame2 {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수
		int gameNUmber1 = LottoNumberMaker.makeNumber();
		int gameNUmber2 = LottoNumberMaker.makeNumber();
//		int gameNUmber3 = LottoNumberMaker.makeNumber();
//		int gameNUmber4 = LottoNumberMaker.makeNumber();
//		int gameNUmber5 = LottoNumberMaker.makeNumber();
//		int gameNUmber6 = LottoNumberMaker.makeNumber();

		System.out.print(gameNUmber1 + "\t");
		System.out.print(gameNUmber2 + "\t");
//		System.out.print(gameNUmber3 + "\t");
//		System.out.print(gameNUmber4 + "\t");
//		System.out.print(gameNUmber5 + "\t");
//		System.out.print(gameNUmber6 + "\t");

		// 오름 차순으로 정렬해보자
		// 만약 1상자가 2상자보다 크다면 어떤 행복을하라

		if (gameNUmber1 > gameNUmber2) {

			int temp = gameNUmber1;
			gameNUmber1 = gameNUmber2;
			gameNUmber2 = temp;
		}
		System.out.println();
		System.out.println("-----------------");
		System.out.println();
		System.out.println();
		
	} // end of main

} // end of class
