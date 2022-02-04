package quiz;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] lotto = new int[6];
		boolean flag  = true;
		int idx = 0;
		
		while (true) {
			int n = rand.nextInt(45)+1;
			//lotto숫자를 가진 배열의 길이 만큼만 반복 -> 갖고있는 수만큼만 검증하면 되기 때문 
			//검증길이가 0~5로 늘어남 
			for (int i = 0; i < idx; i++) {
				if(lotto[i] == n) flag = false;
			}
			
			if(flag) {
				lotto[idx] = n;
				idx++;
			}
			if(idx == 6) break;
		}
		System.out.println("로또당첨번호");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] +" ");
		}
	}
}
