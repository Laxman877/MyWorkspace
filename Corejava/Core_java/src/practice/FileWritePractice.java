package practice;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritePractice {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\File\\laxman.txt");
			String s= "my name is laxman and i am not fram ramayan yug..";
			fw.write(s);
			fw.flush(); 
			System.out.println("file create and content writen");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
