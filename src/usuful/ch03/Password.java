package usuful.ch03;

public class Password {
	
	
	private String pwd;
	
	
	//getter
	public String getPwd() throws PasswordException {
		return pwd;
	}
	
	//setter
	public void setPwd(String pwd) {
		if (pwd == null) {
			throw new PasswordException("비빌번호는 null 값일 수 업습니다");
		}
		
		if ( pwd.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
		}
		// 정규 표현식을 활요 할 수 있다.
		// pwd <== a~z, A~Z ==>true
		// pwd <== a, 10 , !  ==>false
		if (pwd.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야합니다.");
		}
		// [...] : 대괄호는 문자열을 나타냄
		// a-z, A-Z 모든 알파벳 문자열을 말한다.
		// + : 바로앞에 표현식이 하나이상은 반복되어야한다.
		// 즉, "Hello", "Woeld" --> true 를 반환한다.
		// "A1", "bbb"(3글자) --> false
		this.pwd = pwd;
	}
	
	
	
	
	
}
