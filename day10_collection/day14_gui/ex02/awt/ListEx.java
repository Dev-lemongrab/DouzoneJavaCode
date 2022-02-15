package day10_collection.day14_gui.ex02.awt;
import java.awt.*;
public class ListEx{
	public static void main(String[] arsg){
		Frame f=new Frame("����Ʈ �׽�Ʈ");
		Panel p=new Panel();
		List list1=new List(2,false);
		list1.add("������");
		list1.add("������");
		list1.add("�����ɽ�");
		list1.add("�ҳ�ô�");	
		p.add(list1);	
		f.add(p);
		
		f.setSize(300,100);
		f.setVisible(true);
	}
}