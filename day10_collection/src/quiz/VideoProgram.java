package quiz;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class VideoProgram {
	Scanner sc = new Scanner(System.in);
	HashMap<String, Video> videoList = new HashMap<String, Video>();

	public void operation() {
		while (true) {
			try {
				System.out.println("비디오 대여리스트 프로그램 입니다.");
				System.out.println("원하시는 서비스를 입력해주세요!\n1 : 비디오 추가 \n2 : 삭제 \n3 : 수정 \n4 : 리스트출력 \n5 : 대여하기 \n아무 키 입력 : 프로그램종료");
				System.out.println("=======================================");
				int option = sc.nextInt();
				switch (option) {
				case 1:
					System.out.println("비디오를 등록하겠습니다.");
					add();
					break;
				case 2:
					System.out.println("비디오정보를 삭제하겠습니다.\n");
					del();
					break;
				case 3:
					System.out.println("비디오정보를 수정하겠습니다.");
					modify();
					break;
				case 4:
					print();
					break;
				case 5: 
					System.out.println("비디오를 대여합니다.");
					lend();
					break;
				default:
					System.out.println("종료합니다.");
					System.exit(0);
					break;
				}

			} catch (Exception e) {
				// 아무키를 입력하면 예외발생
				sc = new Scanner(System.in);
				System.out.println("종료합니다.");
				System.exit(0);

			}
		}
	}
	public void print() {
		System.out.println("============비디오리스트===========");
		Iterator it = videoList.entrySet().iterator();
		System.out.println(videoList.size()+"개의 비디오리스트가 있습니다.");
		while(it.hasNext()) {
			Map.Entry e = (Entry)it.next();
			System.out.println("----영화 정보----");
			System.out.println(e.getValue());		
			System.out.println("---------------");
		}
		System.out.println("================================");
	}
	
	public void modify() {
		main : while(true) {
			System.out.println("수정할 영화이름 입력");
			String title = sc.next();
			if(videoList.containsKey(title)) {
				while(true) {
					try {
						System.out.println("수정을 원하는 항목을 하나씩 입력하여 수정해주세요!");
						System.out.println("1. 영화이름 변경\n2. 대여자 이름 변경\n3. 대여여부변경\n4. 종료");
						Video video = videoList.get(title);
						int op = sc.nextInt();
						switch (op) {
						case 1:
							System.out.print("영화이름을 입력해주세요 : ");
							String moTitle = sc.next();
							video.setTitle(moTitle);
							break;
						case 2:
							System.out.print("대여자이름을 입력해주세요 : ");
							String moName = sc.next();
							video.setLendName(moName);
							break;
						case 3:
							System.out.print("대여여부를 입력해주세요 : ");
							String moLend = sc.next();
							video.setLend(moLend);
							break;
						case 4: 
							System.out.println("수정끝");
							if(!title.equals(video.getTitle())) {
								videoList.remove(title);
							}
							videoList.put(video.getTitle(), video);//새롭게 입력
							break main;
						default:
							System.out.println("1,2,3번을 입력해주세요");
							break;
						}
					} catch (Exception e) {//문자가 들어왔을 경우
						sc = new Scanner(System.in);
						System.out.println("숫자만 입력해주세요!");
						}
				}
			}else {
				System.out.println("영화가 없습니다.");
			}
		}
	}
	
	public void del() {
		while(true) {
			System.out.print("삭제할 영화이름 입력 : ");
			String title = sc.next();
			if(videoList.containsKey(title)) {
				videoList.remove(title);			
				System.out.println("삭제완료");
				break;
			}else {
				System.out.println("영화가 없습니다.");
			}
		}
	}
	public void lend() {
		while(true){
			System.out.print("비디오 이름 입력");
			String title = sc.next();
			if(!videoList.containsKey(title)) {
				System.out.println("등록된 비디오가 없습니다.");
				continue;
			}else {
				System.out.print("대여자 이름 입력");
				String lendName = sc.next();
				Video video = videoList.get(title);
				video.setLendName(lendName);//대여자 이름 입력
				video.setLend("Yes");//대여여부를 yes로 바꿔줌
				video.setLendDate();//현재 날짜 입력 
				videoList.put(title, video);//타이틀 영화를 대여정보를 포함해 다시 넣어준다.
				break;
			}
		}
	}
	
	public void add() {
		
		while(true) {
			System.out.print("비디오 입력 : ");
			String title = sc.next();
			if(videoList.containsKey(title)) {
				System.out.println("이미 있는 비디오입니다.");
				continue;
			}else {
				System.out.print("장르 입력 : ");
				String category = sc.next();
				Video video = new Video(title, category, "No");
				videoList.put(title, video);
				break;
			}
		}		
	}
	
}
