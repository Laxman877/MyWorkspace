package com;

import java.util.List;

public class Question {
	int id;
	String qname;
	List<Ans> ans;
	
	public void display() {
		System.out.println(id+" "+qname);
		System.out.println("***ans***");
		for(Ans a:ans) {
			a.display();	
		}
	}
	
	

	public List<Ans> getAns() {
		return ans;
	}



	public void setAns(List<Ans> ans) {
		this.ans = ans;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}
	
}
