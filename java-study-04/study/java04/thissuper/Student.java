package study.java04.thissuper;

public class Student extends People {
	private int sId;
	private String subject;
	public Student(String name, int age, String sex, int sId, String subject) {
		super(name, age, sex);
		this.sId = sId;
		this.subject = subject;
	}
	// sId
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	
	// subject
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Student [sId = " +sId+", subject = " + subject + "]";
	}	

}
