package test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JavaHash2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("선동열", new Integer(140));
		map.put("류현진", new Integer(130));
		map.put("임창용", new Integer(135));
		map.put("오승환", new Integer(147));
		map.put("박찬호", new Integer(137));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection<Integer> values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		System.out.println("구속의 합 : " + total);
		System.out.println("팀 평균 : " + (float)total/set.size());
		System.out.println("최고 구속 : " + Collections.max(values));
		System.out.println("최저 구속 : " + Collections.min(values));
	}
}
