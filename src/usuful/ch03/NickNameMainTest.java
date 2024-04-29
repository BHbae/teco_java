package usuful.ch03;

public class NickNameMainTest {

	public static void main(String[] args) {

		NickName nick = new NickName();
		String inputNick = null;
		inputNick = "배병호호호!";

		try {
			nick.setNickName(inputNick);
		} catch (NickNameException e) {
			System.out.println("닉네임 오류 발생 ");
		} catch (Exception e) {
			System.out.println("오류 발생 :" + e.getMessage());
		}
		
		//nick.setNickName(inputNick);

	}// end of main

}
