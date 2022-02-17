package day15_network.ex05.net.chat;
import java.io.*;
import java.net.*;
import java.util.*;

public class TcpMultiChatServer {  // outer class

	HashMap clients;  // key, value
	ServerSocket ss = null; // socket 1
	Socket s = null;  // socket 2
	
	public TcpMultiChatServer() {  // 생성자함수 
		clients = new HashMap();  // 객체 생성
		Collections.synchronizedMap(clients);  // 동기화
	}
	public void start() {
		try {
			ss = new ServerSocket(8001);
			System.out.println("서버 시작 되었습니다. 쳇 준비 완료!");
			
			while(true) {
				s = ss.accept(); // 응답대기, 클라이언트 소켓 
				System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속하셨습니다.");
				ServerReceiver thread = new ServerReceiver(s); // user class
				thread.start();  // run() method 유도된다
			}
//		} catch (Exception e) {  e.printStackTrace(); }
		}  catch (Exception e) {  System.out.println("서버 접속 실패!!");  }
	} // start() end
	
	public void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator(); // key 값 출력
		
		while( it.hasNext() ) {
			try {
				DataOutputStream dos = (DataOutputStream) clients.get(it.next());
				dos.writeUTF(msg);
			} catch (Exception e) {			e.printStackTrace();			}
		}
	} //sendToAll( ) end
	
	class ServerReceiver extends Thread { // inner class
		Socket s;  // 클라이언트 소켓
		DataInputStream dis;
		DataOutputStream dos; 
		String name = "";
		
		public ServerReceiver(Socket s) {  // 생성자함수
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream()); //네트워크를 통해서 읽기
				dos = new DataOutputStream(s.getOutputStream()); // 네트워크를 통해서 쓰기
			} catch (Exception e) {			System.out.println("서버 리시브 실패!!!");		}
		} // constructor end

		@Override
		public void run() {  // 스레드 실행부(구현부)
			try {
				name = dis.readUTF();
				sendToAll("#"+name+" 님이 입장하셨습니다. "); // user method
				clients.put(name, dos);  // MashMap에 넣기
				System.out.println("현재 서버 접속자 수는 : "+clients.size() + " 입니다."); // 접속자 수 확인
				
				while( dis != null ) {
					sendToAll(dis.readUTF());
				}
				
			} catch (Exception e) {		e.printStackTrace();
			} finally {
				sendToAll("#"+name+" 님이 나가셨습니다. ");
				clients.remove(name);  // 접속자 수 제거
				System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속 종료 하셨습니다.");
				System.out.println("현재 서버 접속자 수는 : "+clients.size() + " 입니다."); 
			}
		} // run() end 
		
	} // end ServerReceiver class
	
	public static void main(String[] args) {
		new TcpMultiChatServer().start(); // 
	}
}






