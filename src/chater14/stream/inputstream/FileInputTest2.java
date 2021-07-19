package chater14.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt");) {
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("END");
	}
}
