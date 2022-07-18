package practice;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputPracice {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\File\\java.txt");
			int i = fis.read();
			
			while(i!=-1) {
				char c = (char)i;
				System.out.print(c);
				i=fis.read();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
