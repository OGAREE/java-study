package study.java03.years2main;

import study.java03.years2.IfLeapYears2;
import study.java03.years2.IfLeapYears3;

public class Main {
	public static void main(String[] args) {
		
		IfLeapYears2 ify2 = new IfLeapYears2();
		ify2.printYear(ify2.isLeapYear(2000));
		
		
		IfLeapYears3 lfy3 = new IfLeapYears3();
		lfy3.year(2000, 2010);
	}
}
