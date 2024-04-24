package basic.exercise.toy;

public class Product extends ToyMachine {

	String name;
	int number;

	public void showInfo() {
		System.out.println("상품 이름 ; " + name);
		System.out.println("상품 번호 ; " + number);

	}

}
