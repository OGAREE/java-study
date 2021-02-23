package study.java07.abstractclass;

abstract class AbstractExam {
	/*
	 * 추상 클래스(abstract class)
	 * - 추상 메소드가 1개 이상인 클래스
	 * - 추상 메소드가 바디({})가 없는 메소드를 말한다.
	 * ex) void show();
	 * 
	 * - 연관이 있는 클래스들 끼리의 상속 관계를 나타낸다.
	 * - 추상 메소드 앞에는 abstract 키워드를 붙여 준다.
	 * - 추상 클래스 앞에도 abstract 키워드를 붙여 준다.
	 * 
	 * - 상속을 강요한다
	 * - 상속받는 클래스는 반드시 추상 메소드를 구현해야 한다.
	 * 	 그렇지 않을 경우 오류가 발생한다.
	 * - 상속할 때 키워드는 extends를 사용한다.
	 * 
	 * - 추상 클래스는 추상 클래스의 이름으로 추상 클래스를 생성할 수 없다.
	 * - 용도 : 공통적인 것들을 구현하고, 상속 받은 곳에서 다시 구현해야 하는 기능들은 추상 메소드로 선언만 해 놓는다.
	 * */
	public static void main(String[] args) {

		// 다형성 발생 원리 1
		Elephant aisaele = new AsiaElephant();
		aisaele.eat();
		aisaele.show();

		Elephant afreele = new AfreecaElephant();
		afreele.eat();
		afreele.show();

		//추상 클래스의 이름으로 추상 클래스를 생성
		// Elephant e = new Elephant(); //오류 발생!
		// 추상 클래스를 사용하려면, 부모의 이름으로 자식을 생성해서 사용

	}
}
