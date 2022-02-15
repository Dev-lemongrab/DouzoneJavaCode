package day13_thread.ex01.thread;

public class UserThread extends Thread{
    String name;

    public UserThread(String name) {
        this.name = name;
    }

    public UserThread() {
    }

    @Override
    public void run() {//쓰레드 실행부(구현부)
        System.out.println(name);
        for(int i = 1; i<=10 ; i++){

            if(i==7) {
                try{
                    sleep(500);//0.5초 동안
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }//end for
            System.out.print(i);
        }
    }
}
