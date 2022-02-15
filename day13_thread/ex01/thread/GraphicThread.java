package day13_thread.ex01.thread;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GraphicThread extends JFrame implements Runnable {

    int num, x, y;
    Color color;
    Random random;

    public GraphicThread(int num)
    {
        this.num = num;
        this.color = Color.blue;
        random = new Random();
        this.setSize(500, 400);//프레임 크기 - 너비, 높이
        setVisible(true);//화면 보여주기
        setLocation(300, 150);//위치지정
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫기
    }
    @Override
    public void run() {//스레드 실행부(구현부)
        Rectangle rect = getBounds();//
        for(int i = 0; i < num ; i++) {
            x = random.nextInt(rect.width);
            y = random.nextInt(rect.height);

            repaint();

            try {
                Thread.sleep(100);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }//end for
    }//end run

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x,y,3,3);
    }

    public static void main(String[] args) {
        //2.
        new Thread(new GraphicThread(2000)).start();
        //1.
//        GraphicThread gframe = new GraphicThread(2000);
//        Thread t = new Thread(gframe);
//        t.start();



    }

}
