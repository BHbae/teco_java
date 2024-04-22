package basic.exercise;

public class PhoneBook {
	private int total;
	private String name;
	private String numBer;
	
	//생성자
	public PhoneBook(String name, String number) {
		this.name = name;
		this.numBer = number;
	}
	// 오버로딩
	public PhoneBook(String name, String numBer, int total) {
		this(name, numBer);
		this.total = total;
	}

	
	public String getName() {
		return name;
	}

	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNumBer() {
		return numBer;
	}

	public void setNumBer(String numBer) {
		this.numBer = numBer;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + numBer);
	}
	
	
} // end of class
