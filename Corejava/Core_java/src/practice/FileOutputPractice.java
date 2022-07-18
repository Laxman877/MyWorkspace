package practice;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputPractice {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:\\File\\java.txt");
			System.out.println("file created successfully....");
			String str = "this is file creation by java application";
			byte b[]=str.getBytes();
			fos.write(b);
			System.out.println("content written in file...");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
