package basic.ch22;

public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect {

	@Override
	public void turnOn() {
		System.out.println("냉장고를 연다");
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고를 닫는다");
		
	}

	@Override
	public void soundOn() {
		System.out.println(" 문 닫으소!!!! ");
	}
	
	

}
