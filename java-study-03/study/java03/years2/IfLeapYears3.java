package study.java03.years2;


public class IfLeapYears3 {
	public int year;
	
	public void year(int startY, int endY) {
		for (int year = startY; year <= endY; year++) {
			if (isleapYear(year)) {
				printYear(isleapYear(year));
			}
			else {
				printYear(isleapYear(year));
			}
		}
		
	}
	
	public boolean isleapYear(int year) {
		boolean isT =false;
		this.year=year;
		
		if ((year%4)==0&& 0!=(year%100)||year%400==0) {
			isT=true;
		}
		else {
			isT=false;
		}
		return isT;
	}
	
	public void printYear(boolean isT) {
		if (isT) {
			System.out.println(year+"는 윤년입니다.");
		}
		else {
			System.out.println(year+"는 윤년이 아닙니다.");
		}
	}
}
