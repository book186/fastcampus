package test;

import java.util.HashMap;
import java.util.Scanner;

public class JavaHash {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("castello", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� pw�� �Է�");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			
			System.out.print("pw : ");
			String pw = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �����ϴ�." + "�ٽ� �Է�");
				continue;
			} else {
				if(!(map.get(id)).equals(pw)) {
					System.out.println("��й�ȣ ��ġ���� �ʽ��ϴ�. �ٽ� �Է�");
				} else {
					System.out.println("id, pw ��� ��ġ.");
					break;
				}
			}
		}
	}
}
