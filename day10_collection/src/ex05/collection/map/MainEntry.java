package ex05.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("kosa", "th2");
		map.put("kbs", "12345");
		map.put("it", "147");
		map.put("kosta", "th2");
		
		System.out.println("요소개수 : " + map.size());
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : "); String id = sc.nextLine().trim();
			System.out.print("password : "); String pwd = sc.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
				continue;
			}else {
				if(!map.get(id).equals(pwd)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시입력하세요.");
				}else {
					System.out.println(id + "님의 " + pwd + " 가 일치합니다.");
					break;
				}
			}
			
		}
	}

}
