package basic.exercise.toy;

public class Sudal extends Product {
	
	String origin;
	
	public Sudal() {
		name = "우소우소짱";
		number = 1;
		origin = "바다";
				
	}
	
	public void bigSudal() {
		System.out.println("축하합니다! 1등경품 " + this.name + " 입니다!");
	}
	

}
