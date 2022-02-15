package day10_collection.day14_gui.ex02.awt;
import java.awt.*;
class  ButtonEx1 extends Frame{
	Button b1,b2,b3;
	public ButtonEx1(String str){
		super(str);
		setLayout(new FlowLayout());
		b1 = new Button("1��");
		b2 = new Button("2��");
		b3 = new Button("3��");	
		add(b1);
		add(b2);
		add(b3);
		setSize(300,200);
		show();
	}
	public static void main(String[] args) {
		new ButtonEx1("��ư ����1");
	}
}
