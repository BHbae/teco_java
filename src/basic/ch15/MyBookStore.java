package basic.ch15;

import java.util.Scanner;

/**
 * author -- 배병호 모든 프로그래밍의 기본으 C R U D 이다.
 */
public class MyBookStore {

	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		// 준비물
		Scanner sc = new Scanner(System.in);

		// 배열 선언
		Book[] books = new Book[100];

		// 샘플 데이터 만들어 놓기
		books[0] = new Book("플러더UI실전", "김근호");
		books[1] = new Book("무궁화꽃이 피었습니다.", "김진명");
		books[2] = new Book("흐르는 강물처럼", "이지성");
		books[3] = new Book("리딩으로 리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");
		LAST_INDEX_NUMBER = 5;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_TITLE = "3";
		final String DELETL_ALL = "4";
		final String END = "0";
		boolean flag = true;

		while (flag) {
			System.out.println("메뉴선택");
			System.out.println("1. 저장 2.전체 조회 3.선택조회 4.전체삭제 0.종료");
			String selectebNumber = sc.nextLine();

			if (selectebNumber.equals(SAVE)) {
				System.out.println(">>저장하기<<");
				save(sc, books);

			} else if (selectebNumber.equals(SEARCH_ALL)) {
				System.out.println(">>전체 조회<<");
				realALL(books);

			} else if (selectebNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">>선택 조회<<");
				readByTitle(sc, books);

			} else if (selectebNumber.equals(DELETL_ALL)) {
				System.out.println(">>전체 삭제<<");
				deletALL(books);

			} else if (selectebNumber.equals(END)) {
				System.out.println(">>종료<<");
				flag = false;

			} else {
				System.out.println(">>잘못된 선택입니다.<<");

			}

		}

	} // end of main

	// 함수에 활용
	// 전체 조회
	public static void realALL(Book[] books) {
		System.out.println("--- 전체 조회하기 ---");

		for (int i = 0; i < books.length; i++) {
			// 방저적 코드 작성
			if (books[i] != null) {
				System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
			}
		}
	} // end of realALL

	// 전체 삭제 하기
	public static void deletALL(Book[] books) {
		System.out.println("--- 전체 삭제하기 ---");
		for (int i = 0; i < books.length; i++) {
			books[i] = null;
		}
	} // end of deletALL

	// 저장하기(하나의 북 객체를 저장)
	public static void save(Scanner sc, Book[] books) {
		System.out.println("--- 저장하기 ---");
		System.out.println("책의 제목을 입력하세요");
		String bookTitle = sc.nextLine();
		System.out.println("책의 저자를 입력하세요");
		String bookAuthor = sc.nextLine();

		Book book = new Book(bookTitle, bookAuthor);

		if (LAST_INDEX_NUMBER >= books.length) {
			System.out.println("더이상 책을 저장할 공간이 없습니다.");
			return;
		}

		// [0] <--
		// [1] <--
		// [2] <-- new Book(bookTitle, bookAuthor)
		// [3] <-- new Book(bookTitle, bookAuthor)
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				LAST_INDEX_NUMBER++; // 요소의 갯수로 사용해보자
				break;
			}
		}
		System.out.println("책이 저장 되었습니다");
	} // end of save

	public static void readByTitle(Scanner sc, Book[] books) {
		System.out.println("--- 선택 조회 하기 ---");
		System.out.println("--- 책 제목을 입력 해주세요 ---");
		String bookTitle = sc.nextLine();

		boolean isFind = false;

		// 사용자가 입력한 책제목
		// books 전부조사 books[0] --> 객체 --> 객체.getTitle()
		// 문자열 --> equals

		for (int i = 0; i < books.length; i++) {
			// 방어적 코드 작성
			if (books[i] != null) {
				if (books[i].getTitle().equals(bookTitle)) {
					System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
					isFind = true;
					break;
				}

			}
		}
		// 만약 선택된 값이 없다면
		if (isFind == false) {
			System.out.println("해당 제목에 책은 존재하지않습니다.");
		}

		// 만약 사용자가 입력하 책제목과 배열 요소안에 title 값이 같다면 화면에
		// 화면에 책제목, 책저자 이름을 출력하고
		// 아니라면
		// 하당하는 책이 없습니다. 문구를 출력하시오

		// 심화 -- 반복문을 전부 돌리면 안됩니다.
	}// end of readByTitle

} // end of class
