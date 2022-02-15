package day10_collection.day14_gui.ex02.awt;
import java.awt.*;
import java.awt.event.*;
class  EventEx extends Frame implements ActionListener{
	public void actionPerformed(ActionEvent  e){ // �̺�Ʈ ó�� 
		System.out.println("==�߻��� �̺�Ʈ ����==");
		System.out.println("getSource() ="+e.getSource());
		System.out.println("toString() ="+e.toString());
		System.out.println("getID() ="+e.getID());
		System.out.println("paramString() ="+e.paramString());
	}
	public EventEx(String title){
		super(title);
		Button b1 = new Button("��ư"); // �̺�Ʈ �ҽ�
		b1.addActionListener(this); // �̺�Ʈ ������ ���
		add(b1);
		setSize(300,200);
		show();
	}
	public static void main(String[] args) {
		new EventEx("�̺�Ʈ");
	}
}
