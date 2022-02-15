package day13_thread.ex01.thread;

public class MainEntry {
    public static void main(String[] args) {
//        Thread t1 = new Thread()
        Thread t1 = new UserThread("t1");
        Thread t2 = new UserThread("t2");
        Thread t3 = new UserThread("t3");
        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);
        t1.start();//run()메소드를 유도한다.
        t2.start();
        t3.start();

    }
}
