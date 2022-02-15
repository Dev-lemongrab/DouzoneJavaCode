package day10_collection.day14_gui.ex02.awt;
import java.awt.*;
import java.awt.event.*;
class  ActionEventEx extends Frame implements ActionListener{
	Label lb;
	Button b1, b2;
	public ActionEventEx(String str){
		super(str);
		lb=new Label("��ư�� �����ּ���");
		b1 = new Button("<=��ư");
		b2 = new Button("��ư=>");
		b1.addActionListener(this);
		b2.addActionListener(this);
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		add("Center", p);
		add("South",lb);
		setSize(300,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		System.out.println(e.getActionCommand());
		if((Button)obj==b1){
			lb.setText("���� ��ư �������ϴ�.");
		}else{
			lb.setText("������ ��ư �������ϴ�.");
		}
	}
	public static void main(String[] args) {
		new ActionEventEx("Action�̺�Ʈ ");
	}
}
