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
			System.out.println("id와 pw를 입력");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			
			System.out.print("pw : ");
			String pw = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 없습니다." + "다시 입력");
				continue;
			} else {
				if(!(map.get(id)).equals(pw)) {
					System.out.println("비밀번호 일치하지 않습니다. 다시 입력");
				} else {
					System.out.println("id, pw 모두 일치.");
					break;
				}
			}
		}
	}
}
