package structure;

public class MainTest1 {
	
	public static void main(String[] args) {
		TenacoIntArray tenacoIntArray = new TenacoIntArray();
		tenacoIntArray.addElement(100);
		tenacoIntArray.addElement(200);
		tenacoIntArray.addElement(300);
		tenacoIntArray.addElement(400);
		// tenacoIntArray.insertElement(5, 50); // 테드스 이후에 수정 - Todo
		
		// system.out.println(tenacoIntArray.getElement(0));
		tenacoIntArray.printAll();
		System.out.println("------------------------------------------");
		System.out.println(tenacoIntArray.getCountSize());
		System.out.println("------------------------------------------");
		System.out.println(tenacoIntArray.isEmpty());
		System.out.println("------------------------------------------");
		tenacoIntArray.removeAll();
		tenacoIntArray.printAll();
		
		
	}

}
