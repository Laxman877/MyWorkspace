package com;

import org.springframework.stereotype.Component;

@Component
public class BasicInfo implements CustomerDetails {

	public void getBasicDeatils() {
		int id=10;
		String name="laxman";
		System.out.println(id+" "+name);
	}

}
