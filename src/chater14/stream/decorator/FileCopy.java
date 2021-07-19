package chater14.stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {

	public static void main(String[] args) {
		long milliseconds = 0;
		
		try(FileInputStream fis = new FileInputStream("test.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			milliseconds = System.currentTimeMillis();
			
			int i;
			while ((i = bis.read()) != -1) {
				bos.write(i);
			}
			
			milliseconds = System.currentTimeMillis() - milliseconds;
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		Socket socket = new Socket();
		try {
			BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			isr.readLine();
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("�ð� : " + milliseconds);
	}

}
