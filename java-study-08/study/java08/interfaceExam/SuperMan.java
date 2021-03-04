package study.java08.interfaceExam;

public class SuperMan implements Flying{
	@Override
	public void canfly() {
		System.out.println("슈퍼맨은 날수 있어요!");
	}
	@Override
	public void flying() {
		System.out.println("슈퍼맨은 나는 중!");
	}
}
