package basic.ch11;

public class Person {
	
	// this 의 3가지 사용방법
	// 1. this 는 자기 자신을 가리킨다(인스턴스주소)
	// 2. 생성자에 다른 생성자를 호출할 떄 사용 할수있다.
	//변수 --> private
	private String name;
	private int age;
	private String phone;
	private String gender;
	
	public Person (String name, int age) {
		// 자기 자신의 멤버 변수 name 외부에서 들어오는 지역 변수 name 을대입
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, String phone) {
		// 생성자에서 다른생성자를 호출할수있다
		this(name, age);
		this.name = name;
		//다른 생성자를 가장먼저 호출하고 다른수식을 작성해야한다.
		
		//this.age = age;
		//this.phone = phone;
	}
	
	public Person(String name, int age, String phone, String gender) {
		this(name, age, phone);
		this.gender = gender;
	}
	// 3. 자신의 주소(참조값,주소값)을 반환 시킬 수 있다.
	public Person getPerson() {
		// 자신에 주소값을 반환 시킨다
		return this;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + ",나이 : " + age);
	}
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getphone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
