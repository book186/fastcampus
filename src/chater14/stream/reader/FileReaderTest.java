package chater14.stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fis = null;
		
		try {
			fis = new FileReader("reader.txt");

			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
