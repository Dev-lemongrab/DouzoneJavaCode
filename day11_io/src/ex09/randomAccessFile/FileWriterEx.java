package day11_io.src.ex09.randomAccessFile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class FileWriterEx {
	public static void main(String[] args)
			throws IOException  {  //예외처리 위임

		String str, file;
		Date date = new Date();
		str = "파일 생성 시간 \r\n" + date + "\r\n";

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.println("파일 이름 입력 요망 : ");
		file = br.readLine();  // 예외발생
		System.out.println("저장할 문자열 입력 하세요. ");
		str += br.readLine();

		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(str);
		bw.close();
		System.out.println(file + " 파일을 성공적으로 저장했습니다.");
	}
}















