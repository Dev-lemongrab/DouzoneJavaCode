package ex07.io;
import java.io.*;

public class DataOutputStreamEx {
	public static void main(String[] args) throws Exception { //
		
		File file = new File("test.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65);  // ASCII code --> 'A'
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeLong(888000);
		dos.writeFloat(8.8f);
		dos.writeDouble(12.3456870);
		dos.flush(); // buffer
		
		System.out.println("test.txt 파일에" + 
									dos.size() + "byte save");
		dos.close();
		
	}
}










