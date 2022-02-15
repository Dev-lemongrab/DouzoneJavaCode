package day10_collection.day14_gui.ex02.awt;
import java.awt.*;
class  MenuTest{
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(300,300);
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("����");
			MenuItem m1_1 = new MenuItem("������");
			Menu m1_2 = new Menu("����");
				MenuItem m1_11 = new MenuItem("��������");
				MenuItem m1_12 = new MenuItem("��������");
				m1_2.add(m1_11);m1_2.add(m1_12);
			MenuItem m1_3 = new MenuItem("�μ�");
			m1.add(m1_1);
			m1.addSeparator();
			m1.add(m1_2);
			m1.addSeparator();
			m1.add(m1_3);
		Menu m2 = new Menu("����");
			CheckboxMenuItem cm = new CheckboxMenuItem("����");
			m2.add(cm);
		Menu m3 = new Menu("����");
		mb.add(m1);mb.add(m2);mb.add(m3);
		f.setMenuBar(mb);
		f.show();

	}
}
