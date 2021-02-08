package study.java02.years;

public class IfLeapYears {
	public static void isLeapYears(int year) {
		boolean isT = false;
		if((year%4)==0 && 0!=(year%100) || year%400==0){
		isT=true;
		}
		else {
			isT=false;
		}
		printYear(isT,year);
	}
	
	private static void printYear(boolean isT, int year) {
		if(isT) {
			System.out.println(year+"년은 윤년입니다.");
		}
		else {
			System.out.println(year+"년은 윤년이 아닙니다.");
		}
	}
	public static void main(String[] args) {
		isLeapYears(2021);
	}
}
