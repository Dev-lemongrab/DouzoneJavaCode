package ex04.For;

public class ForStar {
	public static void main(String[] args) {
		
		for(int i = 1 ; i <=5; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("3");
		for(int i = 4 ; i >=0 ; i--) {
			for(int j = 0; j <5 ; j++) {
				if(i<=j) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i = 1; i<=5; i++ ) {
			for(int j = 0; j<5-i; j++)System.out.print(" ");
			for(int k = 0 ; k<i; k++)System.out.print("*");
			System.out.println();
		}
		System.out.println();
		System.out.println("4");
		for(int i = 4 ; i >=0 ; i--) {
			for(int j = 0; j <5 ; j++) {
				if(i>=j) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		for(int i = 0; i<5; i++ ) {
			for(int j = 0; j<5-i; j++)System.out.print("*");
			for(int k = 0 ; k<i; k++)System.out.print(" ");
			System.out.println();
		}
		System.out.println();
		
		
		
		
	}
}
