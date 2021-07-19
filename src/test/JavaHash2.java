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
		map.put("������", new Integer(140));
		map.put("������", new Integer(130));
		map.put("��â��", new Integer(135));
		map.put("����ȯ", new Integer(147));
		map.put("����ȣ", new Integer(137));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� : " + e.getKey() + ", ���� : " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("������ ��� : " + set);
		
		Collection<Integer> values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		System.out.println("������ �� : " + total);
		System.out.println("�� ��� : " + (float)total/set.size());
		System.out.println("�ְ� ���� : " + Collections.max(values));
		System.out.println("���� ���� : " + Collections.min(values));
	}
}
