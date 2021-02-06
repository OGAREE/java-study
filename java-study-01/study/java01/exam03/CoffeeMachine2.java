package study.java01.exam03;

public class CoffeeMachine2 {

	private static int money = 7000;
	private static int cup;
	
	public static void makeCoffee() {
			cup=money/7000;
			System.out.println("커피 "+cup+"잔 나왔습니다.");
	}
	
	public static void main(String[] args) {
		makeCoffee();
	}
}