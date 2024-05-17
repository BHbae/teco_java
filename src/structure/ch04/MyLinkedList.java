package structure.ch04;

import java.util.LinkedList;

public class MyLinkedList {
	
	private Node head; // 요소의 맨처음을 가리킴
	private int count; // 링크드리스트에 몇개의 요소가 연결 되어 있는지 개수
	
	// MyLinkedList 맨 처음 생성시 노드는 없는 상태
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	// 저장된 Node 갯수를 반환하는 메서드
	public int getCount() {
		return count;
	}
	
	// 새로운 노드(Node)를 1개 추가하는 메서드를 만들자
	public Node addElement(String data) {
		Node createNode = new Node(data);
		
		if(head == null) {
			// 맨 처음 요소를 저장하는 동작
			head = createNode;
		} else {
			// 항상 요소 찾기는 head 부터 시작
			Node preNode = head;
			while(preNode.next != null) {
				preNode = preNode.next;
			}
			// 핵심 코드
			preNode.next = createNode;
			
		}
		count++;
		return createNode; // 추후 수정
	}
	
	public Node removeElement(int index) {
		// 방어적 코드
		if(index >= count) {
			System.out.println("삭제할 위치 오류. 현재 리스트 개수는 " + count + "입니다");
			return null;
		}
		
		// 맨 앞 요소를 삭제 요청 시
		// 항상 요소를 찾을 떄 시작은 head 부터 시작
		Node tempNode = head;
		if(index == 0) {
			// 코드의 시작전 모습 
			// [야스오][티모.주소값] ---> [티모][null]
			head = tempNode.next;
		} else {
			// 코드의 시작전 모습 : positon -> 2 라고 가정 --> n - 1 --->[1]
			// [야스오][티모.주소값] ---> [티모][소라카.주소값] --> [소라카][null]
			Node preNode = null;
			for(int i = 0; i < index; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		} // end of if
		count--;	
		// System.out.println(position + " 번쨰 요소를 삭제함");
		return tempNode; // todo 추후수정
	}
	// 전체 출력
	public void printAll() {
		if (count ==0) {
			System.out.println("출력할게 없어요!");
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp != null) {
				System.out.print("-->");
			}
		}
		System.out.println();
	}
	
	// 지정한 위치의 노드 하나만 출력 하기
	public Node getNodeByIndex(int index) {
		if(index >= count) {
			System.out.println("검색위치 오류");
		}
		Node tempNode = head;
		if(index == 0) {
			return head;
		}
		for(int i = 0; i < index; i ++) {
			tempNode = tempNode.next;
		}
		
		return tempNode;
	}
	
	// 전체 삭제 기능
	public void removerAll() {
		head = null;
		count = 0;
	}
	
	
	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addElement("깨꾹이");
		linkedList.addElement("말랑이");
		linkedList.addElement("빵빵이");
		linkedList.addElement("옥지얌");
		linkedList.addElement("끼꼬");
		
		linkedList.printAll();
		linkedList.removeElement(5);
		linkedList.printAll();
		System.out.println(linkedList.getNodeByIndex(1).getData() );
		//System.out.println(linkedList.getCount());
		linkedList.removerAll();
		linkedList.printAll();
		
	} // end of main
	
	
	
	
	
}// end of class
