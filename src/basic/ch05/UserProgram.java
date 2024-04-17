package basic.ch05;

public class UserProgram {
	
	public static void main(String[] args) {
		
		User userBox1 = new User();
		
		userBox1.a = "멍멍이";
		userBox1.b = 3;
		userBox1.c = 59595959;
		userBox1.d = "왈왈구 멍멍동";
		userBox1.e = "dogdog@dogdog.com";
		
		System.out.println(userBox1.a);
		System.out.println(userBox1.b);
		System.out.println(userBox1.c);
		System.out.println(userBox1.d);
		System.out.println(userBox1.e);
		
		
		
	}

}
