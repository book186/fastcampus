package chater14.stream.inputstream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		
		Console console = System.console();
		
		System.out.println("�̸� : ");
		String name = console.readLine();
		System.out.println("��й�ȣ : ");
		char[] pw = console.readPassword();
		
		System.out.println(name);
		System.out.println(pw);
	}

}
