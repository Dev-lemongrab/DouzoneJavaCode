package ex06.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {
	public static void main(String[] args) {
		File src = new File("/Users/macbookpro/YunSeongOh/💕20200807/청주크리스마스/IMG_1351.JPG");
		File dist = new File("/Users/macbookpro/YunSeongOh/ie.JPG");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		try {
			fis = new FileInputStream(src);//파일 입력 바이트 스트림 연결
			fos = new FileOutputStream(dist);// 파일 출력 바이트 스트림 연결
			bis = new BufferedInputStream(fis);// 버퍼 입력 스트림 연결
			bos = new BufferedOutputStream(fos);//버퍼출력 스트림 연결
			
			while((c= bis.read())!=-1) {
				bos.write((char)c);
			}
			
			System.out.println("파일복사성공");
			
		} catch (Exception e) {
			System.out.println("파일복사 중 오류 발생");
		}finally {
			try {
				bis.close(); bos.close(); fis.close(); fos.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
