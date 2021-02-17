package study.java04.thissuper;

public class ThisSuperExam {
	/*
	 * this
	 * 	클래스 내부에서 자기자신을 참조할 때 사용하는 키워드이다.
	 * 	this.member field or this.member method를 사용할 수 있다.
	 * 	ex) People p = new People();
	 * 	this() : 생성자로 사용이 가능합니다.
	 * 	this("고길동", 20); : 오버로딩
	 * 
	 * super
	 * 	자식 클래스에서 부모 클래스에 접근할 때 사용하는 키워드이다.
	 * 	super.member field or super.member method는 부모의 멤버 필드나 메소드를 사용하는 것이다.
	 * 
	 * 	부모의 생성자를 오버로딩할 수 있다.
	 * 	super()
	 * 	super("홍길동", 20, "남자");
	 * 	
	 * */	
	public static void main(String[] args) {
		Student s =  new Student("고길동", 20, "남자", 1234, "과학");
		System.out.println(s.toString());
	}
}
