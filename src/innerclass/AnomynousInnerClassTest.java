package innerclass;

class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		
		int num = 1000;
		
		return new Runnable() {

			@Override
			public void run() {
				
				System.out.println(num);
				System.out.println(i);
				
				System.out.println("***************");
				
				System.out.println(outNum);
				System.out.println(Outer.sNum);
				System.out.println(sNum);
			}
		};
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("test");
		}
	};
}

public class AnomynousInnerClassTest {

	public static void main(String[] args) {
		
		Outer2 outer = new Outer2();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
		
		outer.runner.run();
	}
}
