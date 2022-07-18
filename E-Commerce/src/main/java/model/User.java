package model;

public class User {
	int id;
	String cname;
	String email;
	String mobile;
	String password;
	public User(int id, String cname, String email, String mobile, String password) {
		super();
		this.id = id;
		this.cname = cname;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}
	public User() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
