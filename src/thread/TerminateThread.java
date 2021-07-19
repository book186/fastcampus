package thread;

import java.io.IOException;

public class TerminateThread extends Thread {
	
	private boolean flag = false;
	int i;
	
	public TerminateThread(String name) {
		
		super(name);
	}
	
	public void run() {
		
		while(!flag) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " END");
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public static void main(String[] args) {
		
		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		
		threadA.start();
		threadB.start();
		
		int in;
		
		while(true) {
			
			try {
				in = System.in.read();
				if (in == 'A') {
					threadA.setFlag(true);
				} else if (in == 'B') {
					threadB.setFlag(true);
				} else if (in == 'M') {
					threadA.setFlag(true);
					threadB.setFlag(true);
					break;
				} /*else {
					System.out.println("try again");
				} */
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main END");
	}

}
