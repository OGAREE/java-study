package study.java01.exam02;

/*
 * 클래스, 멤버필드, 멤버메소드
 * */

public class CoffeeMachine {
		private int money;
		private int cup;

	public void makeCoffee() {
		if(money<=0) {
			System.out.println("돈이 없습니다.");
		}
		else {
			cup=money/7000;
			System.out.println("커피 "+cup+"잔 나왔습니다.");
		}
	}
}