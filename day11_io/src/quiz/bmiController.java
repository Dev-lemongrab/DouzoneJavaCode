package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class bmiController{
	
	
	public void calcPerson() {//bmi, 적정몸무게 계산
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream  oos = null;
		File f = new File("BmiList.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(f, true);  //append mode
			oos = new ObjectOutputStream(fos);
			while(true) {
				Person p = new Person();
				
				System.out.println("--------------------회원 정보 입력 하기 ------------------------------");
				System.out.print("이름 >> ");  		p.setName(br.readLine());
				System.out.print("성별 >> "); 		p.setGender(br.readLine());
				System.out.print("키 >> "); 	 		p.setHeight(Integer.parseInt(br.readLine()));
				System.out.print("몸무게 >> "); 	 	p.setWeight(Integer.parseInt(br.readLine()));
				
				
				
				// BMI = 몸무게/((키/100.0)*(키/100.0));
				p.setBmi(p.getWeight()/((p.getHeight()/100.0)*(p.getHeight()/100.0)));
				
				if(p.getGender().equalsIgnoreCase("man")) {
					p.setProperWeight((p.getHeight()-100) * 0.9);
				}else {
					p.setProperWeight((p.getHeight()-100) * 0.85);
				}
				oos.writeObject(p.getName());
				oos.writeObject(p.getGender());
				oos.writeObject(p.getHeight());
				oos.writeObject(p.getWeight());
				oos.writeObject(p.getBmi());
				oos.writeObject(p.getProperWeight());
				System.out.println(p);
				System.out.print("More Input? Y or N >> ");

				if (br.readLine().equalsIgnoreCase("N")) {
					break;
				}
				
			}
			System.out.println("BmiList.txt  save!!!");	
			
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // try end	
	
	public void ViewFIle() {
		File f = new File("BmiList.txt");
		FileInputStream  fis = null;
		ObjectInputStream bis = null;
		System.out.println("\t>> 회원 정보 << \n");
		System.out.println("이름    성별  키  몸무게  bmi  적정몸무게");
		try {
			fis = new FileInputStream(f);
			bis = new ObjectInputStream(fis);

			while (true) {
				String name = (String) bis.readObject();
				String gender = (String) bis.readObject();
				int height = (int) bis.readObject();
				int weight = (int) bis.readObject();
				double bmi = (double)bis.readObject();
				double properWeight = (double)bis.readObject();

				System.out.println();
				System.out.print(name + "  ");
				if(gender.equalsIgnoreCase("man") ) System.out.print("남자");
				else System.out.print("여자");
				System.out.printf("   %d   %d   %.2f   %.1f\n", height,  weight, bmi, properWeight);
				System.out.println();
				System.out.println("------------------------------");
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("===========================");
		} finally {
			try {
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // try end
	}
	
}
