package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager {

	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PhoneBook[] phoneBooks = new PhoneBook[100];

		phoneBooks[0] = new PhoneBook("엄마덜", "010000");
		phoneBooks[1] = new PhoneBook("아빠덜", "010001");
		phoneBooks[2] = new PhoneBook("민영", "010002");
		phoneBooks[3] = new PhoneBook("현수", "010003");
		phoneBooks[4] = new PhoneBook("친구", "00000");

		LAST_INDEX_NUMBER = 5;
		final String SAVE = "1"; // 저장
		final String SEARCH_ALL = "2"; // 조회
		final String CORRECTION = "3"; // 수정
		final String DELETL = "4"; // 삭제
		final String SEARCH_NAME = "5"; // 선택조회
		final String END = "0"; // 종료
		boolean flag = true;

		while (flag) {
			System.out.println("메뉴선택");
			System.out.println("1.저장 2. 조회 3.수정 4.삭제 5.선택조회 0.종료");
			String select = sc.nextLine();
			if (select.equals(SAVE)) {
				System.out.println("저장하기");
				saveName(sc, phoneBooks);
			} else if (select.equals(SEARCH_ALL)) {
				System.out.println("조회하기");
				searchAll(phoneBooks);
			} else if (select.equals(CORRECTION)) {
				System.out.println("수정하기");
				correcTion(sc, phoneBooks);
			} else if (select.equals(DELETL)) {
				System.out.println("선택삭제");
				deletl(sc, phoneBooks);
			} else if (select.equals(SEARCH_NAME)) {
				System.out.println("선택조회");
				readName(sc, phoneBooks);
			} else if (select.equals(END)) {
				System.out.println("종료 합니다.");
				flag = false;
			} else {
				System.out.println("잘못된 선택입니다.");
			}

		} // end of while

	} // end of main

	public static void saveName(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("이름을 입력해주세요");
		String phonename = sc.nextLine();
		System.out.println("번호를 입력해주세요");
		String phonenumber = sc.nextLine();
		PhoneBook phoneBook = new PhoneBook(phonename, phonenumber);
		if (LAST_INDEX_NUMBER >= phoneBooks.length) {
			System.out.println("더이상 번호을 저장할 공간이 없습니다.");
			return;
		}
		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] == null) {
				phoneBooks[i] = phoneBook;
				LAST_INDEX_NUMBER++;
				break;
			}
		}

	} // end of saveName

	public static void searchAll(PhoneBook[] phonebook) {
		System.out.println("전체조회");
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				System.out.println(phonebook[i].getName() + ", " + phonebook[i].getNumBer());
			}
		}
	}// end of searchAll

	public static void correcTion(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("수정할 이름을 선택하세요");
		String selet = sc.nextLine();

		boolean isOk = false;

		for (int i = 0; i < phoneBooks.length; i++) {
			// 1. 존재 여부 확인

			if (phoneBooks[i] != null) {
				// 2. 만약 존재 한다면 이름을 받아서 해당 index 덮어쓰기
				// phoneBooks[i] <--- 객체
				if (phoneBooks[i].getName().equals(selet)) {
					System.out.println(phoneBooks[i].getName() + phoneBooks[i].getNumBer() + "를 수정합니다");

					System.out.println("이름을 입력하세요");
					String newName = sc.nextLine();
					System.out.println("번호를 입력하세요");
					String newNumber = sc.nextLine();

					phoneBooks[i].setName(newName);
					phoneBooks[i].setNumBer(newNumber);

					System.out.println(phoneBooks[i].getName() + ", " + phoneBooks[i].getNumBer() + "로 저장 됩니다.");
					break;
				}

			}

		}
	} // end of correcTion

	public static void deletl(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("삭제할 이름을 선택하세요");
		String selet = sc.nextLine();
		boolean isOk = false;

		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null) {
				if (phoneBooks[i].getName().equals(selet)) {
					System.out.println(phoneBooks[i].getName() + phoneBooks[i].getNumBer() + "를 삭제합니다");
					phoneBooks[i] = null;
				}
			}

		}

	} // end of deletl

	public static void readName(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println(" 선택 조회하기");
		System.out.println(" 이름을 입력해주세요");
		String phoneName = sc.nextLine();

		boolean isOk = false;

		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] != null) {
				if (phoneBooks[i].getName().equals(phoneName)) {
					System.out.println(phoneBooks[i].getName() + phoneBooks[i].getNumBer() + "입니다.");
					isOk = true;
					break;
				}
			}
		}
		if (isOk == false) {
			System.out.println("해당이름은 존재 하지 않습니다");
		}

	} // end of readName

} // end of class
