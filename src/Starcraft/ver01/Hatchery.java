package Starcraft.ver01;

public class Hatchery {
	public int Hatchery;
	public int count;
	
	public Hatchery(int hatcheryNumber) {
		this.Hatchery = hatcheryNumber;
		count = 0;
	}
	public int getCount() {
		return count;
	}
	
	public int getHatchery() {
		return Hatchery;
	}
	
	public Zergling createZegling(String name) {
		count++;
		return new Zergling(name);
	}
	
}
