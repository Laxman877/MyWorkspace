package com.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "prod_cat")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int catId;
	String cat_name;
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
	List<Product> products;
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	
}
