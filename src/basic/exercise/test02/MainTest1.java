package basic.exercise.test02;

public class MainTest1 {

	public static void main(String[] args) {

		// 문제2
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		// 메서드 의존 주입
		a.setB(b);
		b.setC(c);
		c.setC(d);
		// 내부에서 객체를 생성하지 않고 외부에서
		// 객체을 주입한 후에 D에 getName() 호출 하시오

		// 외부에서

		System.out.println(a.getB().getC().getD().getName());

	}

}
