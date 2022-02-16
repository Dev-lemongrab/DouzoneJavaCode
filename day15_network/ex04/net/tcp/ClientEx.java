package day15_network.ex04.net.tcp;

import java.io.*;
import java.net.*;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		Socket client = null;  // socket 1

		try {
			client = new Socket("localhost", 9999);  // ip , port numbeer
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String outputMessage;
			
			while(true) {
				System.out.println("message input : ");
				outputMessage = stin.readLine();
				
				if( outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
				} // end if
				
				bw.write("클라이언트> " +outputMessage + "\n");
				bw.flush();  // 버퍼 비우기
				
				String inputMessage = br.readLine();
				System.out.println(inputMessage);
			} // end while

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				client.close();
			} catch (IOException e) {
				System.out.println("Server와 채팅 중 오류 발생.....");
			}
		} //end try

	}
}
