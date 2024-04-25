package basic.ch22;

public class ToyRobot implements RemoteController, SoundEffect {

	int widtg;
	int height;
	String color;

	@Override
	public void turnOn() {
		System.out.println("웅치킨 우우우ㅜ우우치킨 움직입니다");
	}

	@Override
	public void turnOff() {
		System.out.println("우우우우우우웅..... 멈춥니다.");

	}

	@Override
	public void soundOn() {
		System.out.println("쉬우우우우우우우우웅");
	}

	// turnOn
	// turnOff

}
