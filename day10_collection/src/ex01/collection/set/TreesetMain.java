package ex01.collection.set;

import java.util.*;

public class TreesetMain {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {85,95,50,35,45,65,10,100};
		for (int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		System.out.println(set);
		
//		System.out.println("50보다 작은 값 : " + set.headSet(toElement));
		System.out.println("50보다 작은 값 : " + set.headSet(50));//50보다 작은
		System.out.println("50보다 큰 값 : "  + set.tailSet(50));//50보다 큰
		
	}
}
