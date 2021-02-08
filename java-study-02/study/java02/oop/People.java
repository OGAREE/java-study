package study.java02.oop;

public class People {
	private String name;
	private int age;
	private String id;
	private String sex;
	
	//getter, setter 한번에 만드는 법
	// 우클릭 → Source → Generate Getters and Setters → 원하는 멤버 필드 선택
	
	// name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	//sex
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
