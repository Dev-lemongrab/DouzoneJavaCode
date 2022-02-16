package day15_network.ex04.net.tcp;
import java.io.*;
import java.net.*;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		ServerSocket server = null;  // socket 1
		Socket client = null;  // socket 2
		
		System.out.println("연결된....나는 서버야~~~");
		
		try {
			server = new ServerSocket(9999);
			client = server.accept(); // 응답대기, 클라이언트 소켓
			
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			// 키보드로부터 입력스트림
			stin = new BufferedReader(	new InputStreamReader(System.in));
			// 클라이언트로의 출력스트림
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String inputMessage;
			
			while(true) {
				inputMessage = br.readLine();
				if( inputMessage.equalsIgnoreCase("exit")) break;
				System.out.println(inputMessage);
				String outputMessage = stin.readLine();
				bw.write("kingsmile서버> " + outputMessage + "\n");
				bw.flush();
			} // end while
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				client.close();    server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
