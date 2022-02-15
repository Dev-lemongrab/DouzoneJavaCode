package day10_collection.day14_gui.ex02.awt;
import java.awt.*;
import java.awt.event.*;
class ComponentEx1 extends Frame implements ComponentListener, ActionListener{
	TextArea ta;
	Button b;
	public ComponentEx1(String str){
		super(str);
		b = new Button("ȭ�鿡�� �����");
		b.addActionListener(this);
		add("South",b);
		ta = new TextArea();
		add("Center",ta);
		addComponentListener(this);
		setSize(300,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		try{
			this.hide(); //ȭ�鿡�� �����
			Thread.sleep(3000);	 //3�ʴ��
		}catch(InterruptedException se){
			System.out.println(se);
		}
		this.show();	//�ٽ� ���
	}
	public void componentHidden(ComponentEvent e){
		ta.append("������Ʈ�� ȭ�鿡�� ������ \n");
	}
	public void componentMoved(ComponentEvent e){
		ta.append("������Ʈ�� �̵��� \n");
	}
	public void componentResized(ComponentEvent e){
		ta.append("������Ʈ ũ�⺯�� \n");
	}
	public void componentShown(ComponentEvent e){
		ta.append("������Ʈ ȭ�鿡 ���� \n");
	}
	public static void main(String[] args) 
	{
		new ComponentEx1("������Ʈ �̺�Ʈ");
	}
}
