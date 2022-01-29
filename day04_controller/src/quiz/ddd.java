package quiz;

import java.util.Scanner;

public class ddd {
	private static String [][] star;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1, 5, 9, 13,...
		//1+(N-1)*4;
		int N = sc.nextInt();
		star = new String[2*(1+(N-1)*4)][(1+(N-1)*4)];//2 [5][10];
		
		for(int i = 0 ; i < star.length; i++) {
			for(int j = 0; j < star[i].length ; j ++) {
				star[i][j] = " ";
			}
		}
		
		int startI = 0, startJ = 0;
		star(N, startI, startJ);
		
		
		for(int i = 0 ; i < star.length; i++) {
			for(int j = 0; j < star[i].length ; j ++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		//5 -> 10
	}
	public static void star(int N, int startI, int startJ) {
		if(N==1) {
			star[startI][startJ] = "*";
			return;
		}else {
			for(int i = startI ; i<2*(1+(N-1)*4); i++) {//3이면 9 012345678 0123456789 1011121314151617
				for(int j = startJ; j<1+(N-1)*4; j++) {
					if(i==startI||i==2*(1+(N-1)*4)-1) star[i][j] = "*";
					else {
						if(i%2!=0) {}
						else if(j==startJ||j==(N-1)*4) star[i][j] = "*";
					}
					
				}
			}
			star(N-1, startI+4, startJ+2);
		
		
	}
	
//	public static void main(String[] args) {
		
//		for(int i = 0 ; i < star.length ; i ++) {
//			for(int j = 0; j < star[i].length ;j ++) {
//				star[i][j] = " ";
//			}
//		}
//		for(int i = 0 ; i < 5 ; i +=2) {
//			for(int j = 0; j < 5 ;j ++) {
//				if(i==0||i==4)
//					star[i][j] = "*";
//				else star[i][j] = "*";
//			}
//		}
	}
	
	
	

}
