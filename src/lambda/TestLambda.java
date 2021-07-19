package lambda;

interface PrintString {
	
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
	
			PrintString lambdaStr = s -> System.out.println(s);
			lambdaStr.showString("wow");
			
			showMyString(lambdaStr);
			
			PrintString test = returnString();
			test.showString("wwwwwwwwwww");
	}

	public static void showMyString(PrintString p) {
		p.showString("sdfsdf");
		
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "!!!!!!!!!!");
	}
}
