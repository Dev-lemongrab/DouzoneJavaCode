package ex05.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("상윤", new Integer(90));
		map.put("태문", new Integer(55));
		map.put("봉제", new Integer(85));
		map.put("중호", new Integer(100));
		map.put("지호", new Integer(75));
		System.out.println(map);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next(); 	
			System.out.println("이름 : " + e.getKey() + ", 점수 : "+ e.getValue());
		}
		//키만 꺼내오기
		set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		//값만 갖고 오기
		Collection values = map.values();
		System.out.println(values);
		it = values.iterator();
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue();
		}
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고 점수 : " + Collections.max(values));
		System.out.println("최하 점수 : " + Collections.min(values));
		
		
		
		
		
	}
}
