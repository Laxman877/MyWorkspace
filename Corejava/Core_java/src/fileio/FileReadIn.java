package fileio;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadIn {
	public static void main(String[] args) {
        FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("D:\\Java\\test.txt");
			int i =  fis.read();
			
			while(i!=-1)
			{
				char c = (char) i;
				System.out.print(c);
				i = fis.read();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}