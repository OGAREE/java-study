package study.java02.oop.hiearachy;

public class OOPMain {
	public static void main(String[] args) {
		
		//부모
		People p = new People();
		p.setName("홍길동");
		p.setAge(10);
		p.setSex("남성");
		System.out.println(p.toString());
		
		// 자식
		Student s = new Student();
		s.setName("고길동");
		s.setAge(10);
		s.setSex("남자");
		s.setsId("2021");
		s.setSubject("수학/과학");
		System.out.println(s.toString());
	}
}
