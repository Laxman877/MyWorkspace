package model;

import javax.persistence.*;

@Entity
@Table(name = "customer_mst")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	@Column(name = "cname")
	String cname;
	@Column(name = "email")
	String email;
	@Column(name = "mobile")
	String mobile;
	@Column(name = "pass")
	String pass;
	public Customer(int id, String cname, String email, String mobile, String pass) {
		super();
		this.id = id;
		this.cname = cname;
		this.email = email;
		this.mobile = mobile;
		this.pass = pass;
	}
	public Customer() {
		
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
