package io.file.ch02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class MyBufferedOutStream {

	public static void main(String[] args) {
		
		// 현재 시간(시작)
		long start = System.nanoTime(); // (더정밀한 시간을 출력)
		
		

		String data = "기반 스트림 + 보조 스트림을 할용해보자";

		// try - catch - resource 활용
		try (FileOutputStream fos = new FileOutputStream("output2.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				)
		{
			// 코드 수행부분
			byte[] bytes = data.getBytes();
			
			// 보조 스트림(버퍼)
			bos.write(bytes);
			// 간혹 버터에 데이터가 남아있다면 중복된 데이터를 쓸 수 있다.
			// 한번 사용한다음에
			bos.flush(); // flush --> 물을 내리다.
			
			System.out.println("보조 스트림을 활용한 파일 출력 완료");
			// 시간 측정을 해보기
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 현재 시간(종료)
		long end = System.nanoTime();
		// 종료 -시작 ->소요시간하
		long duration = end -start;
		System.out.println("소요시간 : " + duration);
		// 나노포는 10분의 1
		
	}

}
