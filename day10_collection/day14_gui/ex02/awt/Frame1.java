package day10_collection.day14_gui.ex02.awt;
import java.awt.*;
class  Frame1{
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("�޼���� ����");
		//f.setBackground(Color.blue);
		//f.setSize(400,200);  //ȭ���� ũ�� 
		//f.setLocation(300,200);//ȭ���� ��ġ
		f.setBounds(400,200,300,200);//setSize(), setLocation() �ϳ��� ���� �޼���
		f.setResizable (false); 
		f.setVisible(true);  //ȭ�� ��Ÿ����
		//show() ȭ�� ��Ÿ����
		//hide() ȭ�� ���߱�
	}
}
