package study.java01.exam07;

public class PassByValueExam {
	public static void main(String[] args) {
		// pass by value 예시 1
		int a = 10;
		int b = a + 20;
		a=b;
		System.out.println(a);
	}

}