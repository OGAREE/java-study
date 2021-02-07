package study.java02.exam02;

public class CoffeMachine {
	//member field
	private int money;
	
	// 이름이 동일할 때의 우선순위는 블록 변수 > 멤버 필드
	public void setMoney(int money) { // 지역 변수
		this.money=money;
	}
}
