package basic.ch12;

public class NumberPrinterTest {

	public static void main(String[] args) {

		NumberPrinter n1 = new NumberPrinter(1);
		NumberPrinter n2 = new NumberPrinter(2);
		
		
		
		n1.printWaithNumber(); //고객1
		n2.printWaithNumber(); //고객2
		n1.printWaithNumber(); //고객3
		n1.printWaithNumber(); //고객4
		n1.printWaithNumber(); //고객 5
		n2.printWaithNumber(); //고객 6
	}

}
