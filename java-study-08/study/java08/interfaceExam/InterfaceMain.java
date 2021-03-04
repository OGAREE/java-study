package study.java08.interfaceExam;

public class InterfaceMain {
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
