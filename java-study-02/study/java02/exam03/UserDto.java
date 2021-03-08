package study.java02.exam03;
//DTO(Data Transfer Object) 
//PL (javascript/화면) DTO
//BL (java)      DTO
//DL (DAO...)    DTO
public class UserDto {
	private String id;
	private String passwd;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
}
