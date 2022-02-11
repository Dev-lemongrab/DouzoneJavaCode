package ex04.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInpurEx {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		try {
			OutputStream os = new FileOutputStream("ex.txt");//상대경로
			while(true) {
				System.out.println("문자열 입력 : ");
				String str = sc.nextLine()+"\r\n";
				if(str.toUpperCase().equals("EXIT\r\n")) break;
				os.write(str.getBytes());
			}
			
			System.out.println("memo.txt save success");
			
		} catch (Exception e) {
		}		
	}
}
