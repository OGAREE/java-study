package study.java04.constuctor;

public class Student extends People {
	private int sId;
	private String subject;

	public Student(String name, int age, String sex, int sId, String subject) {
		super(name, age, sex);
		this.sId=sId;
		this.subject = subject;
	}

	//Id
	public int getssId() {
		return sId;
	}

	public void setsId(int sid) {
		sId = sid;
	}

	//subject
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return super.toString()+" Student [학번 = "+ sId +", 과목 = "+ subject +"]";
	}
}
