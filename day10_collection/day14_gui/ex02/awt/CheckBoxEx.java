package day10_collection.day14_gui.ex02.awt;
import java.awt.*;
public class CheckBoxEx{
	public static void main(String[] args){
		Frame f=new Frame("üũ�ڽ� �׽�Ʈ");
		Panel p=new Panel();	
		Checkbox ck1=new Checkbox("JAVA",true);
		Checkbox ck2=new Checkbox("Servlet/JSP");	
		Checkbox ck3=new Checkbox("EJB");
		Checkbox ck4=new Checkbox("Project");	
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		p.add(ck4);	
		f.add(p);	
		f.setSize(300,100);
		f.setVisible(true);
	}
}
