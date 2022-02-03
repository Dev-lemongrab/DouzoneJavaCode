package ex04.sort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a = {7,3,5,2,8};
		int temp;
		
		System.out.println("****** sort 전 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "\t");			
		}
		
	//sort
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[i] <a[j]+1) {
					temp = a[i];
					a[i] = a[j+1];
					a[j] = a[i];
				}
			}
		}

	}

}
