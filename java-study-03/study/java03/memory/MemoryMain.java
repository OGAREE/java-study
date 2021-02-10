package study.java03.memory;

public class MemoryMain {
	public static void main(String[] args) {
		//부모
		People p = new People();
		p.sleep();
		p.eat();
		
		//자식
		Child c = new Child();
		c.sleep();
		c.eat();
		c.study();
		c.game();
		
		// 설계도가 부모로 변경됐을때 호출되는 메소드 확인
		People p1 = new Child();
		p1.sleep();
		p1.eat();
		
		// 자식의 인스턴스가 존재하고, 부모의 설게도로 되어있는 객체를 
		// 자식의 설계도로 변경하면, 부모와 자식의 메소드르 다 사용할 수 있다.
		People p2 = new Child();
		Child c2 = (Child)p2;
		
	}
}
