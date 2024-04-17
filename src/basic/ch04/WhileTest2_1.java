package basic.ch04;

public class WhileTest2_1 {

	public static void main(String[] args) {
	      
	      //1부터 5까지를 모두 더하라
	      
	      int start = 1; //시작점은 1
	      int end = 10; //10번 반복
	      int sum = 0; 
	      //첫번째 반복
	      //6번째
	      // 6 <=  5->  거짓  ->  반복시 종료
	      
	      while(start <= end) {         
	         //while(true) 를 할시 무한 반복한다.
	         //만약 strat 값이 10일때 종료 하라
	         if(start ==11) {
	            //실행에 제어권을 반납한다
	            return;
	         }
	         
	         sum = sum + start;
	         System.out.println("sum("+start +"): " + sum );
	         start++; //1씩 증가
	      }

	   }
	}