package basic.exercise.toy;

import java.util.Random;

public class ToyMachineTest2 {

	public static void main(String[] args) {

		Product product1 = new Sudal();
		Product product2 = new Bbororo();
		Product product3 = new Dobot();

		Product[] products = new Product[9];
		products[0] = product1;
		products[1] = product2;
		products[2] = product3;
		
		System.out.println("---------------------------------");
		
		product1.showInfo();
		
		System.out.println("---------------------------------");
		
		product1.success(product1);
		product1.failure(product3);
		
		System.out.println("---------------------------------");
		
		System.out.println( ((Sudal)products[0]).origin );
		
		System.out.println("---------------------------------");
		for (int i = 0; i < products.length; i++) {
			
			if (products[i] instanceof Sudal) {
				((Sudal) products[i]).bigSudal();
			} else {
				System.out.println(products[i].name + "당첨을 축하합니다.");
			}

		}
		System.out.println("-----------------------");
		
		int[] ran = makeNumbers();
		for(int i = 0; i < ran.length; i++) {
			System.out.println("도전");
			
		}
		
	} // end of main
	
	public static int makeNumber() {
		// static 함수안에 멤버 변수를 사용할 수 없다.
		// 메모리가 뜨는 순서 !!
		// System.out.println("ver : " + version);
		Random random = new Random();
		int resultNumber = random.nextInt(10); // 0 ~~~~ 44
		return resultNumber;
	}
	public static int[] makeNumbers() {
		int[] numbers = new int[1];
		Random random = new Random();
		
		return numbers;
	}
	

} // end of class
