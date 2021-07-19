package chater14.stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("writer.txt");
			
			fw.write('A');
			
			char[] buf = {'B', 'C', 'D', 'E', 'F'};
			fw.write(buf);
			
			fw.write("æ»≥Á«œººø‰!");
			fw.write(buf, 2, 2);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fw.close();
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("END");
	}

}
