package innerclass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {
		int iNum = 100;
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
			System.out.println(iNum);
		}
	}
	
	public void usingInnser() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int inNum = 1000;
		static int sInNum = 2000;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
		static void sTest() {
			System.out.println(sInNum);
			System.out.println(sNum);			
		}
	}
}


public class InnerTest {
	
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInnser();
		
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest();
		
		System.out.println("*******************");
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		OutClass.InStaticClass.sTest();
		System.out.println("*******************");
		sInClass.inTest();
	}
}
