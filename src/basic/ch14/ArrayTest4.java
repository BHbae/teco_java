package basic.ch14;

public class ArrayTest4 {

	public static void main(String[] args) {
		String[] arrayStr = new String[26];

		arrayStr[0] = "A";
		arrayStr[1] = "B";
		arrayStr[2] = "C";
		arrayStr[3] = "D";
		arrayStr[3] = "E";
		arrayStr[25] = "Y";

		int fCount = 0;
		int eCount = 0;
		
		for(int i = 0; i < arrayStr.length; i++) {
			if ( arrayStr[i] != null) {
				eCount++;
				System.out.println(arrayStr[i]);
			}
			fCount++;
		}
		System.out.println("동작횟수 : " + arrayStr.length);
		System.out.println("요소횟수 : " + eCount);

	} // end of main

} // end of class
