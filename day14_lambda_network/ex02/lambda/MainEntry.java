package day14_lambda_network.ex02.lambda;

import java.util.ArrayList;
import java.util.List;

public class MainEntry {
    //(매개변수 목록) -> {실행문}
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            System.out.println("Thread Start");
            try {
                Thread.sleep(100);

            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread End");
        });
//        t.start();
//        System.out.println(t);
        System.out.println("======================");
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("spring");
        list.add("react");
//        System.out.println(list);
//        for (int i = 0; i < list.size() ; i ++) {
//            System.out.println(list.get(i));
//        }
        list.forEach((item)-> System.out.println(item));

    }
}
