package fileio;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputFile {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("D:\\Java\\test.txt");
			System.out.println("file created....");
			String str = "this is my first java io progarm for learnig purpose..";
			byte b[]=str.getBytes();
			fos.write(b);
			System.out.println("content written in file..");
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
