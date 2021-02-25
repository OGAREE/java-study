package study.java05.polymorphism;

public class Polymorphism {
	/*
	 * 다형성
	 * - 다양한 형태를 나타내는 성질!!
	 * - 부모의 메소드가 자식에 형태에 따라 다양하게 호출되는 것!(OOP 3대 특징중 하나!!)
	 * 
	 * 다형성 발생 원리
	 * 1) 부모의 이름으로 자식을 생설할 수 있다.
	 *  Coffee c = new Americano();
	 * 2) 부모의 이름으로 자식을 받을 수 있다.
	 *  Americano a = new Americano();
	 *  Coffee c1 = a;
	 * 3) 부모의 메소드로 자식의 메소드를 호출할 수 있다.
	 * Americano a1 = new Americano();
	 * Coffee c2 = a1.make();
	 * (단, 상속과 overriding이 되어야 한다)
	 *   
	 * */
	
	public static void main(String[] args) {
		People p = new Student();
		p.show();
		
		People p1 = new Teacher();
		p1.show();
				
	}
}
