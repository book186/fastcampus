package scheudler;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) {
		
		System.out.println("��ȭ ���� �Ҵ� ����� �Է��ϼ���");
		System.out.println("R : �Ѹ� ���ʴ��");
		System.out.println("L : ��Ⱑ ���� ���� �켱");
		System.out.println("P : �켱������ ���� ���켱 or ���õ� ���� ����");
		
		try {
			int ch = System.in.read();
			
			Scheduler scheduler = null;
			
			if (ch == 'R' || ch == 'r') {
				scheduler = new RoundRobin();
			} else if (ch == 'L' || ch == 'l') {
				scheduler = new LeastJob();
			} else if (ch == 'P' || ch == 'p') {
				scheduler = new PriorityAllocation();
			} else {
				System.out.println("�������� �ʴ� ����Դϴ�.");
				return;
			}
			
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
