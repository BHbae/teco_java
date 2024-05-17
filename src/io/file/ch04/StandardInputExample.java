package io.file.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StandardInputExample {

	public static void main(String[] args) {

		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용 한다.!!
		List<String> lines = new ArrayList<String>();
		
		
		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8"); 
				BufferedReader br = new BufferedReader(isr)) {
			String line;
			// "" --> 엔터 --> line.isEmpty() --> ! --> F --> 실행에 종료가 된가
			while( (line = br.readLine() ) !=null && !line.isEmpty() ) {
				lines.add(line); // 한줄에 데이터를 자료구종에 저장
				//System.out.println("이력 확인 :" + line);
				}
			for (String data : lines) {
				System.out.println(data);
			}
				
			System.out.println("프로 그램 종료 ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end of main
} // end of class
