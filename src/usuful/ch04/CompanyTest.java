package usuful.ch04;

public class CompanyTest {
	
	public static void main(String[] args) {
		
		//생성 불가
		//Company company = new Company();
		
		// COmpay 객체를 어떨게 접근 할 수 있을까?
		
		// a 클래스에서 활용
		Company company = Company.getInstance();
		System.out.println(company);
		
		// b 클래스에서 활용
		Company company2 = Company.getInstance();
		System.out.println(company2);
		
	}// end of main

} // end of class
