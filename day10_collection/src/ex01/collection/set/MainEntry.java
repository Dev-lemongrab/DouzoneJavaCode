package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;

//1) Set : 순서없고, 중복허용하지 않습니다.
public class MainEntry {
	public static void main(String[] args) {
//		HashSet<String> hs = new hashSet();
		HashSet<String> hs = new HashSet<String>();
		HashSet<Object> hs2 = new HashSet<Object>();
		hs.add("키보드"); 
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");
		System.out.println("요소개수 : " + hs.size());//요소개수
		hs2.add(10);
		hs2.add(100);
		hs2.add(1000);
		
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {//다음요소가 있다면...
			System.out.println(it.next());//요소를 꺼내와서 출력함
		}
		System.out.println("-------------------");
		for (Object obj : hs2) {
			System.out.println(obj);
		}
		System.out.println("-------------------");
		System.out.println(hs);
	}
}
/*/
public class MainEntry {
	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "3", "4", "t", 1, 12.34};
		Set set = new HashSet<>();
		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);
	}
}
//*/

