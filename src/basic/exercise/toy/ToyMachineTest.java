package basic.exercise.toy;


public class ToyMachineTest {

	public static void main(String[] args) {

		Product product1 = new Sudal();
		Product product2 = new Bbororo();
		Product product3 = new Dobot();

		Product[] products = new Product[3];
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
		
	} // end of main
	

} // end of class
