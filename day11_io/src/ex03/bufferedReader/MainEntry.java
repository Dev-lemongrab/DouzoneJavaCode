package ex03.bufferedReader;

import java.io.*;

public class MainEntry {
	public static void main(String[] args) throws IOException {
//		InputStream in = System.in;
//		Reader reader = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(reader); 
//		String str =  br.readLine();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("더할 숫자를 입력하세요!");
		int su1, su2;
//		String s1 = bf.readLine();
//		String s2 = bf.readLine();
		su1 = Integer.parseInt(bf.readLine());
		su2 = Integer.parseInt(bf.readLine());
				
		System.out.println(su1 + su2);
		
		
		
		
	}
}
