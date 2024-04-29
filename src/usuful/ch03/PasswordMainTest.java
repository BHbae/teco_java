package usuful.ch03;

public class PasswordMainTest {
	
	//메인 쓰레드
	public static void main(String[] args) {
		
		Password password = new Password();
		
		String inputPwd = null;
		inputPwd = "abaaa";
		
		//테스트 해보니깐 아래 코드는 실행 시점에 예외발되는 코드
		// 해결
		try {
			password.setPwd(inputPwd);
		} catch (PasswordException e) {
				System.out.println("패스워드 예외가 발생");
		} catch (Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		password.setPwd(inputPwd);
		
		
	}// end of main

} // end of class
