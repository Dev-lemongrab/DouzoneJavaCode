package day11_io.src.ex07.io;

import java.io.*;

public class DataInputStreamEx {
	public static void main(String[] args)
			throws IOException {
		
		File file = new File("test.txt");
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		
		dis.close();
	}
}





