package ex03.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("사과 = 10|초코렛 = 3|샴페인 = 1","=|");
		while(token.hasMoreTokens()) {//토큰이 더 있으면 
			String str = token.nextToken();
			if(str.equals("=")) System.out.print("\t");
			else if(str.equals("|")) System.out.print("\n");
			else System.out.print(str);
		}
	}
}
