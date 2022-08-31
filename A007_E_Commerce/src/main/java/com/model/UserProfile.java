package com.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "User_details")
public class UserProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int userId;
	@Size(min = 1,message = "FirstName cannot be blank..")
	String firstName;
	@Size(min = 1,message = "LastName cannot be blank..")
	String lastName;
	@NotEmpty(message = "Email id must be enter..")
	@Email
	String email;
	@Size(min = 10,max = 11,message = "Number should be 10 digit..")
	String phno;
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8,16}$",message = "Invalid password format..")
	String password;
	String gender;
	
	@ManyToMany(mappedBy = "products")
	List<ShopCart> shopCarts;
	
	public List<ShopCart> getShopCarts() {
		return shopCarts;
	}
	public void setShopCarts(List<ShopCart> shopCarts) {
		this.shopCarts = shopCarts;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
