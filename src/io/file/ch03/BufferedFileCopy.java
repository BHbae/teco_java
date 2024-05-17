package io.file.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {

	public static void main(String[] args) {
		// (바이트 기반 스트림)
		// 기반 스트림 + 보조스트림을 활용 해서
		// 파일 복사 기능을 만들고
		// 소요 시간을 측정하시오

		// 파일경로
		String sourceFilePath = "C:\\Users\\KDP\\Documents\\Lightshot//a.zip";
		// 복사한파일 이름 및 경로
		String destinetionFilePath = "copy2.zip";

		long startTime = System.nanoTime();

		try (FileInputStream in = new FileInputStream(sourceFilePath);
				BufferedInputStream bosIn = new BufferedInputStream(in);
				FileOutputStream out = new FileOutputStream(destinetionFilePath);
				BufferedOutputStream bosOut = new BufferedOutputStream(out);) {
			int data;
			while ((data = bosIn.read()) != -1) {
				bosOut.write(data);
			}
			bosOut.flush(); // 매번 입출력을 발생하는것이 아니라 한번에 입출력을 사용

		} catch (Exception e) {
			e.printStackTrace();
		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("소요시간" + duration);
		double seconds = duration / 1_100_100_100.0;
		String resultFormat = String.format("소요 시간은 : %.6f초 입니다.", seconds);
		System.out.println(resultFormat);

	}

}
