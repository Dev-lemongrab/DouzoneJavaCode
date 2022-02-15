package day10_collection.day14_gui.ex03.Swing;

import javax.swing.*;

public class JTableEx extends JFrame {
	
	JTable table;
	String[] fieldName = {"�й�" ,"����", "����", "����"};
	String[][] data = { {"001", "60", "70", "80"},
							{"002", "65", "85", "77"},
							{"003", "70", "90", "69"},
							{"003", "70", "90", "69"},
							{"003", "70", "90", "69"},
							{"003", "70", "90", "69"}
							};
	
	public JTableEx(String str){
		super(str);
		table = new JTable(data, fieldName);
		JScrollPane  sp = new JScrollPane(table);
		getContentPane().add(sp, "Center");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 150);
		setVisible(true);
	}//end
	
	public static void main(String[] args) {
		new JTableEx("���̺���");
	}
}
