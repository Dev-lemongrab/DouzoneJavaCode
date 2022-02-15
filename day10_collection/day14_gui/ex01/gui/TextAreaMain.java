package day10_collection.day14_gui.ex01.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextAreaMain extends Frame {
    TextArea ta;
    Button btn;
    public TextAreaMain(String str){
//        setTitle("First Frame");
        setBackground(Color.pink);
        setVisible(true);
        setBounds(500,300,500,300);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        btn = new Button("Button1");
        ta = new TextArea("문장을 넣으세요", 5, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
        this.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
                System.out.println(e.getSource());
            }
        });


    }



    public static void main(String[] args) {
        new TextAreaMain("새창 띄우기");
    }


}
