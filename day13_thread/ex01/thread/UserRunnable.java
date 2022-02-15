package day13_thread.ex01.thread;

public class UserRunnable implements Runnable{
    String name;
    public UserRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() { //스레드 실행부
        //System.out.println("Runnable interface run() call");
        for (int i = 0; i <=10 ; i++) {
            if(i ==7) {
                try {
                    Thread.sleep(500); //0.5초 동안 중지상태
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
//        Runnable u1 = new UserRunnable("u1");
//        Thread t1 = new Thread(u1);
//        Thread t2 = new Thread(new UserRunnable("u2"));
//        Thread t3 = new Thread(new UserRunnable("u3"));
        new Thread(new UserRunnable("u1")).start();
        new Thread(new UserRunnable("u2")).start();
        new Thread(new UserRunnable("u3")).start();
//        t1.start();
//        t2.start();
//        t3.start();
    }

}
