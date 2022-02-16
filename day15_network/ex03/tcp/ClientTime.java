package day15_network.ex03.tcp;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class ClientTime {
	public static void main(String[] args) {
		String serverIP = "211.200.90.77";
		int port = 7000;
		Date date = null;
	
		try {
			Socket client = new Socket(serverIP, port);
			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			System.out.println("222Server측 날짜/시간 확인.... 여기는 클라이언트 입니다. \n");
			
			date = (Date)ois.readObject();
			System.out.println("현재 시간 : "+date+" 입니다.");
			ois.close();
			client.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}








