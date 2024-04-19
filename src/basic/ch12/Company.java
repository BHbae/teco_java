package basic.ch12;

public class Company {
	
	public static String companyName = "병호컴퍼니";
	static int empSeriaNumber = 1000;
	
	
	//코드 테스트
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("현수");
		System.out.println(employee1.getEmployee());
		
		Employee employee2 = new Employee("선명");
		System.out.println(employee2.getEmployee());
		
		Employee employee3 = new Employee("진혁");
		System.out.println(employee3.getEmployee());
		
		
		
		
	}
	
}
