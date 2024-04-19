package basic.ch12;

public class Employee {

	private int employee; // 멤버변수(객체바다 고유에 밧을 가져야한다)
	private String name;
	private String department;

	// 요구조건
	// 사원이 존재하게 될떄 마다 고유한 사원번호를
	// 할당하고싶다. 단사원 번호는 중복 되어서는 안된다.

	// static 과 멤버 변수에 활용
	// 객체 생성자, 멤버변수, 함수흫 필요하다 호출또는 초기화할수있다.
	public Employee(String name) {
		this.name = name;
		this.employee = Company.empSeriaNumber;
		Company.empSeriaNumber++;
	}

	public int getEmployee() {
		return employee;
	}

	public void setEmployee(int employee) {
		this.employee = employee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
