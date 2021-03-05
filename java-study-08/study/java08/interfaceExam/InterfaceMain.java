package study.java08.interfaceExam;

public class InterfaceMain {
	/*
	 * Interface(인터페이스)
	 * - 추상 메소드로만 이루어진 것
	 * - 자기 자신의 이름으로 자기 자신을 생성할 수 없다.
	 * - 연관되어 있는 클래스가 아니라 기능을 구현하는 것들을 모아 놓은 구조
	 * - 인터페이스를 통해 다중속성을 흉내냄
	 * - 구현된 메소드가 하나라도 있으면 오류발생
	 * - 키워드는 interface
	 * - 상속할때 사용하는 키워드는 implements
	 * - 변수는 자동으로 상수가 된다.
	 * ex) int A = 1; // => public static final A = 1;
	 * - 변수를 선언만 할수는 없다.
	 * - 기본 접근 제한자는 private 말고 public를 사용한다.
	 * - 인터페이스의 추상 메소드를 구현하지 못하면 클래스는 추상 클래스가 된다.
	 * - 인터페이스가 여러개 일때는 ','로 구분한다.
	 * ex) class A implements IB, IC, ID {}
	 * - 일반 클래스와 인터페이스가 있을 경우에는 일반 클래스가 우선이다.
	 * ex) class A implements IC {}
	 * - 인터페이스 끼리 상속할 때는 키워드를 extends로 사용한다.
	 * ex) interface IA extnds IB, IC {}
	 */
	public static void main(String[] args) {
		Flying bird = new Bird();
		bird.canfly();
		bird.flying();
		
		Flying airplane = new AirPlane();
		airplane.canfly();
		airplane.flying();
		
		Flying superman = new SuperMan();
		superman.canfly();
		superman.flying();
		
		System.out.println("상수 Bird A : "+bird.A+", AirPlane A : "+airplane.A+", SuperMan A : "+ superman.A);
		System.out.println("상수 Bird B : "+bird.B+", AirPlane B : "+airplane.B+", SuperMan B : "+ superman.B);
	}
}
