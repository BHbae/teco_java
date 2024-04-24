package basic.exercise.toy;

// 클래스 -- 인형뽑기
// 상품들이 존재가능
// 사자인형,  곰인현, 에어팟
// 배열 활용해서 객체들을 담자
public class ToyMachine {
	

	// 뽑다
	public void success(Product suc) {
		System.out.println(" 도전!!! ");
		System.out.println("결과 : " + suc.name + "을 뽑앗습니다");
		
	}

	// 실패
	public void failure(Product fai) {
		System.out.println(" 도전!!! ");
		System.out.println("결과 : " + fai.name + " 도전에 실패 했습니다.");
	}

} // end of class
