package quiz;

import java.util.Scanner;

public class ddd {
	private static String [][] star;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1, 5, 9, 13,...
		//1+(N-1)*4;
		int N = sc.nextInt();
		star = new String[(1+(N-1)*4)][(1+(N-1)*4)];//2 [5][10];
		
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
			for(int i = startI ; i<1+(N-1)*4+startI; i++) {//0일땐 ~흘러가고 5
				for(int j = startJ; j<1+(N-1)*4 +startJ; j++) {
					if(i==startI||i==(1+(N-1)*4)-1+startI) star[i][j] = "*";
					else {
						if(j==startJ||j==(N-1)*4+startJ) star[i][j] = "*";
					}
				}
			}
			star(N-1, startI+2, startJ+2);
	}
	

	}
	
	
	

}
