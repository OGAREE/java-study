package study.java01.exam09;

public class Main{

	public static void main(String[] args){
		People p1 = new People();
		p1.setName("홍길동");
		System.out.println(p1.getName());
		
		p1.age=10;
		System.out.println(p1.age);
		
		// 오류! 이유 : 메소드가 private라서
		//	p1.setAge(10); 
		//	System.out.println(p1.getAge());
	}
}