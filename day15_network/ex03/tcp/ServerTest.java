package day15_network.ex03.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTest {
	public static void main(String[] args) {
		ServerSocket  ss =null;
		Socket s = null;
		System.out.println("server Start!!!");
		
		try {
			ss = new ServerSocket(9000); // socket 1
			s = ss.accept();  // socket 2
			// I / O
			InputStream is = s.getInputStream();  // read
			OutputStream os = s.getOutputStream(); // write
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			String msg = "안녕~ 클라이언트야!!!";
			os.write(msg.getBytes());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				s.close();				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
