package basic.ch12;

// 번호를 뽑아주는기계
public class NumberPrinter {
	
	private int id;
	//private int waitNumber; 멤버 변수 
	//private static int waitNumber; // --> Method Area
	// waitNumber
	public static int waitNumber; // --> Method Area
	
	
	public NumberPrinter(int id) {
		this.id = id;
		waitNumber = 1;
		
	}
	
	// 기능 번호표를 출력한다.
	public void printWaithNumber() {
		System.out.println(id + "번에 기기의 대기 순번은" + waitNumber);
		waitNumber++;
	}

}
