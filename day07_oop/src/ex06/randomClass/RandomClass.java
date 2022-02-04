package ex06.randomClass;

import java.util.Random;

public class RandomClass {
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println(rand.nextInt());//nextInt() int형 크기 안에 있는 임의적인 숫자 추출됨
		
		System.out.println(rand.nextInt(5)); // 0 ~ 4
		System.out.println(rand.nextInt(10)+1); //1 ~ 10
	}
}
