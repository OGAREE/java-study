package study.java04.constuctor;

public class Main {
	public static void main(String[] args) {
		People p = new People("홍길동",20,"남자");
		System.out.println(p);
		
		Student s = new Student("고길동", 21, "남자", 1972, "수학");
		System.out.println(s);
		
		Teacher t = new Teacher("둘리", 20, "남자", "t001", "프로그래밍");
		System.out.println(t);
	}
}
