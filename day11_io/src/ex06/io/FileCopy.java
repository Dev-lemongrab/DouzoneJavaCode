 package ex06.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception{
		//읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("/Users/macbookpro/YunSeongOh/오용진님 증명.jpg");
		//쓰기 객체 - FileOutputStream
		OutputStream out = new FileOutputStream("/Users/macbookpro/YunSeongOh/copy.jpg");
		byte[] buffer = new byte[1024*8];
		
		long start = System.currentTimeMillis();
		while(true) {
			int inputData = is.read(buffer);
			if(inputData == -1) break;
			out.write(buffer, 0, inputData);
		}
		long end = System.currentTimeMillis();
		System.out.println(end- start);
		is.close(); out.close();
		System.out.println("copy success!");
	}

}
