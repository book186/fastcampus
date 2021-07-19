package chater14.stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) {
		RandomAccessFile rf = null;
		try {
			rf = new RandomAccessFile("random.txt", "rw");
			
			rf.writeInt(100);
			System.out.println(rf.getFilePointer());
			
			rf.writeDouble(3.14);
			System.out.println(rf.getFilePointer());
			
			rf.writeUTF("æ»≥Á«œººø‰!!!");
			System.out.println(rf.getFilePointer());
			
			rf.seek(0);
			int i = rf.readInt();
			double d = rf.readDouble();
			String str = rf.readUTF();
			
			System.out.println(i + ", " + d + ", " + str);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				rf.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}

}
