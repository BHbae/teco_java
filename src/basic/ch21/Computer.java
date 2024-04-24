package basic.ch21;

public abstract class Computer {

	String name;

	public void turnOn() {
		System.out.println("온");
	}

	public void turnOff() {
		System.out.println("오프");

	}

	public abstract void displat();

	public abstract void typing();
	
	
	//메인함수
	public static void main(String[] args) {
		NoteBook notebook = new NoteBook();
		notebook.typing();
		
	} // end of main

} // end of class
