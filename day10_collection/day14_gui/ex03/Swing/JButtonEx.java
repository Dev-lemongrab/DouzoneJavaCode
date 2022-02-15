package day10_collection.day14_gui.ex03.Swing;

import javax.swing.*;
import java.awt.*;
import java.beans.Transient;

public class JButtonEx extends JPanel {
	public JButtonEx(){
		setLayout(new GridLayout(1,2));
		AbstractButton btn = new JButton("Ȯ��");
		add(btn);
		btn = new JButton("���");
		add(btn);
	} //end

	@Override
	@Transient
	public Dimension getPreferredSize() {
		return new Dimension(400, 300);
	}
	
	public static void main(String[] args) {
		JFrame f = new JFrame("JButton sample");
		JButtonEx  pane1 = new JButtonEx();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(pane1);
		f.setSize(pane1.getPreferredSize());
		f.setVisible(true);
	}
	
}
