package io.file.ch02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutputStream {

	// 코드에 시작점
	public static void main(String[] args) {
		
		// 현재 시간(시작)
		long start = System.nanoTime();

		// 데이터가 존재
		String data = "Hello, Java MyFileOutputStream \n 하이 방가루";
		// 1. 파일에다가 데이터를 저장하고 싶다면(바이트 기반)
		// 자바 8버전 부터 제공
		// try catch
		try (FileOutputStream fos = new FileOutputStream("output.txt", false)

		) {
			// data(String) 라지고 있는 문자열들을 바이트 배열로 반환 처리
			// byte[] bytes = data.getBytes();
			byte[] bytes = { 72, 101, 108, 108, 111 };// Hello
			System.out.println("bytes : " + bytes);
			for (int i = 0; i < bytes.length; i++) {
				System.out.println("bytes[i] : " + bytes[i]);
			}

			// 연결된 스트림을 활용해서 바이트 배열을 파일에다가 흘려 보냄
			fos.write(bytes);

			System.out.println("파일출력스트림을 통해서 데이터를 쓴다");

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없음");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 동작 이해해 보기
		// 파일에 바이트 단위로 데이터를 쓰고
		// 그 파일을 열었을 때 글자로 보이틑 이유는 파일을 읽는 프로그램
		// 파일 내에 바이트 데이터를 문자로 해석해서(문자인코딩) 보여 주었다.
		
		// 현재 시간(종료)
		long end = System.nanoTime();
		// 종료 -시작 ->소요시간하
		long duration = end - start;
		System.out.println("기반 스트림 파일 입출력 소요 시간 : " + duration);
		
	}// end of main

} // end of class
