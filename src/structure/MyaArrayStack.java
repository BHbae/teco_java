package structure;

public class MyaArrayStack {
	
	int top; // 스택의 최상위 요소를 가르킴
	TencoIntArray arrayStack;
	
	public MyaArrayStack() {
		top = 0; // 스택 포인터 초기화
		arrayStack = new TencoIntArray(); // 배열칸 10개 생성
		
	}
	
	public MyaArrayStack(int size) {
		top = 0;
		arrayStack = new TencoIntArray(size);
	}
	
	// 스택의 크기(요소 갯수)를 반환
	public int getSize() {
		return top;
	}
	// 스택이 비어 있는지 확인
	public boolean isEmpty() {
		return top == 0;
	}
	// 스택의 요소가 가득 찼는지 확인 하는 메서드
	public boolean isFull() {
		//      10 ==               10
		return top == arrayStack.ARRAY_SIZE;
	}
	// 스택의 모든 요소를 출력
	public void printAll() {
		arrayStack.printAll();
	}
	// 스택에 데이어를 추가
	public void push(int data) {
		// 방어적코드 작성
		if(isFull()) {
			System.out.println("메모리가 꽈아아아아악 찼음");
			return;
		}
		arrayStack.addElement(data);
		top++;
	}
	// 스택에서 데이터를 제거하고 반환하는 메서드
	public int pop() {
		if(top == 0) {
			System.out.println("아무것도없어예....");
		}
		int temp = peek();
		System.out.println("LOG1 : " + (top -1));
		arrayStack.removerElement(top - 1);
		top--;
		return temp;
	}
	// 스택의 최상위 요소를 반환 하지만 제거는 하지않음
	public int peek() {
		if(top == 0) {
			return TencoIntArray.ERROR_NUM;
		}
		return arrayStack.getElement(top -1);
	}
	// 코드 테스드
	public static void main(String[] args) {
		
		MyaArrayStack stack = new MyaArrayStack();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		
		// 전체 출력
		stack.printAll();
		stack.pop(); // 버그 해결
		System.out.println("--------------------");
		System.out.println(stack.peek());
		System.out.println("--------------------");
		stack.printAll();
		
		
	}// end of main
}
