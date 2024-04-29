package usuful.ch03;

public class NickName {

	private String nickName;

	// 겟터
	public String getNickName() throws NickNameException {
		return nickName;
	}

	// 셋터
	public void setNickName(String nickName) {
		if (nickName == null) {
			throw new NickNameException("닉네임을 입력해주세요");
		}
		if (nickName.length() < 5) {
			throw new NickNameException("5자이상의 닉네임을 입력하세요");
		}
		if (nickName.matches("^[가-힣]*$")) {
			throw new NickNameException("닉네임에는 특수 문자를 포함 할 수 없습니다");

		}
		this.nickName = nickName;
	}

}
