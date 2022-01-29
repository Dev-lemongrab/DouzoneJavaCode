package ex01.array;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
//		int[][] a = new int[2][3];
		Scanner sc = new Scanner(System.in);
//		
//		int x = sc.nextInt();
//		System.out.println("x = " + x);
//		
//		System.out.println("array data 2 row, 3col = ");
//		for(int i = 0; i<2; i++) {
//			for(int j = 0 ; j < 3; j++) {
//				System.out.println("a[" +i+ "]["+j+"] = " + a[i][j]);
//			}//j end
//		}//i end
//		
//		for(int i = 0; i<2;i++) {
//			for(int j = 0; j<3;j++) {
//				System.out.println(a[i][j] + "\t");
//			}//j end
//			System.out.println();
//		}//i end
		
		//1,2,3,4
		//5,6,7,8
		
		
		int[][] b = new int[3][4];
		for(int i = 0; i<b.length-1 ; i++) {
			for(int j = 0; j<b[i].length ; j++) {
				b[i][j] = sc.nextInt(); 
			}
		}
		
		for(int i = 0; i < b[1].length ; i ++) {
			b[2][i] = b[0][i]+ b[1][i];
			
		}
		for(int i = 0; i<b.length ; i++) {
			for(int j = 0; j<b[i].length ; j++) {
				System.out.print(b[i][j] + " "); 
			}
			System.out.println();
		}
	
		
		
	}
}
