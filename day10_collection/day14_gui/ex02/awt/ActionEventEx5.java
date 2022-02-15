package day10_collection.day14_gui.ex02.awt;
import java.awt.*;
import java.awt.event.*;
class  ActionEventEx5 extends Frame implements ActionListener{
	List list;
	Label lb;
	public ActionEventEx5(String str){
		super(str);
		list = new List(5,false);
		list.add("����");list.add("�λ�");list.add("��õ");list.add("�뱸");
		list.add("����");list.add("����");list.add("���");list.add("����");
		list.add("����");list.add("���");list.add("����");list.add("��");
		lb = new Label("        ");
		list.addActionListener(this);
		add("Center", list);
		add("South",lb);
		setSize(200,100);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		lb.setText(list.getSelectedItem());
	}
	public static void main(String[] args) 
	{
		new ActionEventEx5("Action����");
	}
}
