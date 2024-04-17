package basic.ch08;

public class UserInfo {

	public String userId;
	public String userPassword;
	public String userName;
	public String userADDress;
	public String phoneNumber;

	// 생상자 오버로딩이란
	// 생상자의 개수가 여러개 있다
	// 기본 생성자 형태 만들어보지
	public UserInfo() {
	}

	public UserInfo(String id) {
		userId = id;
	}

	public UserInfo(String id, String name) {
		userId = id;
		userName = name;
	}

	// 연습문제
	// 1 - 매개 변수 3개를 받는 생성자를 만들어주세요
	public UserInfo(String id, String name, String pw) {
		userId = id;
		userPassword = pw;
		userName = name;
	}

	// 2 - 매개 변수 4개를 받는 생성자를 만들어주세요
	public UserInfo(String id, String name, String pw, String add) {
		userId = id;
		userName = name;
		userPassword = pw;
		userADDress = add;
	}

	// 3- 매개 변수 5개를 받는 생성자를 만들어 주세요
	public UserInfo(String id, String name, String pw, String add, String pn) {
		userId = id;
		userName = name;
		userPassword = pw;
		userADDress = add;
		phoneNumber = pn;
	}

}// end