package study.java08.interfaceExam;

public class Bird implements Flying{
	@Override
	public void canfly() {
		System.out.println("새는 날수 있어요!");
	}
	@Override
	public void flying() {
		System.out.println("새는 나는 중!");
	}
}
