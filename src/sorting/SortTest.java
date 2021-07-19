package sorting;

import java.io.IOException;

public class SortTest {
	public static void main(String[] args) {
		System.out.println("���Ĺ���� �����ϼ���.");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		try {
			Sort sort = null;
			int ch = System.in.read();
			
			if (ch == 'B' || ch == 'b') {
				sort = new BubbleSort();
			} else if (ch == 'H' || ch == 'h') {
				sort = new HeapSort();
			} else if (ch == 'Q' || ch == 'q') {
				sort = new QuickSort();
			} else {
				System.out.println("�߸��� �Է��Դϴ�.");
				return;
			}
			
			int[] arr = new int[10];
			sort.ascending(arr);
			sort.descending(arr);
			sort.description();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
