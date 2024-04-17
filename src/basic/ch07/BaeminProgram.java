package basic.ch07;



public class BaeminProgram {
	
	public static void main(String[] args) {
		
		
		Baemin baemin1 = new Baemin();
		System.out.print("메뉴를 선택 해주세요. ");
		
		baemin1.foodName = "마라마라탕";
		baemin1.foodMoney = 15000;
		baemin1.foodEA = 1;
		baemin1.Discaunt = 2500;
		baemin1.Apat = "하단동";
		baemin1.Dondon = (baemin1.foodMoney - baemin1.Discaunt);
		
		System.out.println("음식" + baemin1.foodName);
		System.out.println("가격" + baemin1.foodMoney);
		System.out.println("수량" + baemin1.foodEA);
		System.out.println("할인률" + baemin1.Discaunt);
		System.out.println("주소" +baemin1.Apat);
		System.out.println("합산가격" + baemin1.Dondon);
		
	}
	

}
