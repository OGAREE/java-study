package study.java08.interfaceExam;

public class AirPlane implements Flying{
	@Override
	public void canfly() {
		System.out.println("비행기는 날수 있어요!");
	}
	
	@Override
	public void flying() {
		System.out.println("비행기는 나는 중!");
	}
}
