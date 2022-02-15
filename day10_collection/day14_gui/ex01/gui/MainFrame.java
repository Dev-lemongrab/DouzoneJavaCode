package day10_collection.day14_gui.ex01.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    public MainFrame(){
        setTitle("test");
        setVisible(true);
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫기에 대한 작업 -> 프로그램 종료까지 한다.
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args) {
        new MainFrame();
    }
}
