package basic.ch22;

public class Rabbit implements RaceParticipant {

	private final int speed = 10;

	@Override
	public String getName() {
		return "쉬웅쉬웅 토끼";

	}

	@Override
	public int getSpeed() {
		return speed;
	}

}
