package ex05.randomMethod;

import java.util.Random;

public class MathRandom {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println();
		//random() : 난수발생 0.0 ~ 1.0
		
		System.out.println(Math.random());
		//0 ~ n-1 값 
		System.out.println(Math.random() * 5); //0 ~ 4
		System.out.println(Math.random()*5+1);
		System.out.println();
		for(int i = 1; i< 7 ; i++) {
			System.out.print((int)(Math.random()*45)+1 + " ");
		}
		System.out.println();
		Random rand = new Random();
		System.out.println(rand.nextInt(5)+1);
	}
}
