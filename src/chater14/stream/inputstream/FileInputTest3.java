package chater14.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest3 {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt");) {
			int i;
			byte[] bs = new byte[10];

			while((i = fis.read(bs)) != -1) {
				for(int j = 0; j < i; j ++) {
					System.out.print((char)bs[j]);
				}
				System.out.println();
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
