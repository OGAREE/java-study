package study.java01.exam04;

public class CoffeeMachine3 {
	
	private int money;
	
	// 리턴타입 X
	public void setMoney(int money) {
		this.money=money;
	}
	
	// 리턴타입 O
	public int getMoney() {
		return money;
	}

}