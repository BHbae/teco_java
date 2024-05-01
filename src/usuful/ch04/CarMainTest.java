package usuful.ch04;

public class CarMainTest {

	public static void main(String[] args) {
		
		Car aiCar = new AICar(); // 다형성 , 업캐스팅된상태
		//  프로그램을 실행시키기 위해서 run() 메서드를 호출해야한다 -약속
		aiCar.run();
		
		System.out.println("------------------------");
		
		Car manualCar = new ManualCar();
		manualCar.run();
		
		
		
	}// end of main
	
} // end of class
