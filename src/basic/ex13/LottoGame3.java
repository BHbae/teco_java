package basic.ex13;

public class LottoGame3 {

	public static void main(String[] args) {

		int gameNUmber1 = LottoNumberMaker.makeNumber();
		int gameNUmber2 = LottoNumberMaker.makeNumber();
		int gameNUmber3 = LottoNumberMaker.makeNumber();
		int gameNUmber4 = LottoNumberMaker.makeNumber();
		int gameNUmber5 = LottoNumberMaker.makeNumber();
		int gameNUmber6 = LottoNumberMaker.makeNumber();

		int temp = 0;
		for (int i = 1; i <= 6; i++) {
			if (gameNUmber1 > gameNUmber2) {
				temp = gameNUmber1;
				gameNUmber1 = gameNUmber2;
				gameNUmber2 = temp;
			}
			if (gameNUmber2 > gameNUmber3) {
				temp = gameNUmber2;
				gameNUmber2 = gameNUmber3;
				gameNUmber3 = temp;
			}
			if (gameNUmber3 > gameNUmber4) {
				temp = gameNUmber3;
				gameNUmber3 = gameNUmber4;
				gameNUmber4 = temp;
			}
			if (gameNUmber4 > gameNUmber5) {
				temp = gameNUmber4;
				gameNUmber4 = gameNUmber5;
				gameNUmber5 = temp;
			}
			if (gameNUmber5 > gameNUmber6) {
				temp = gameNUmber5;
				gameNUmber5 = gameNUmber6;
				gameNUmber6 = temp;
			}
		}

		System.out.print(gameNUmber1 + "\t");
		System.out.print(gameNUmber2 + "\t");
		System.out.print(gameNUmber3 + "\t");
		System.out.print(gameNUmber4 + "\t");
		System.out.print(gameNUmber5 + "\t");
		System.out.print(gameNUmber6 + "\t");

	} // end of main

} // end of class
