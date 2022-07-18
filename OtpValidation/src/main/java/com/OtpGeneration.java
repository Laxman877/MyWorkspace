package com;

import java.util.Random;

public class OtpGeneration {
	public static void main(String[] args) {
		Random rad=new Random();
		int otp=rad.nextInt(9999);
		System.out.println(otp);
	}
}
