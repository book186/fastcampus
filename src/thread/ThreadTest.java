package thread;

class MyThread implements Runnable {

	public void run() {
		int i;
		
		for(i = 0; i <= 50; i++) {
			System.out.println(i + "\t");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		System.out.println("END!!!");
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("START");
		
		/*
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		 */
		
		/*
		MyThread runner1 = new MyThread();
		MyThread runner2 = new MyThread();
		Thread th1 = new Thread(runner1);
		Thread th2 = new Thread(runner2);
		
		th1.start();
		th2.start();
		*/
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("END");
	}

}
