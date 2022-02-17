package day15_network.ex06.net.udp;


import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
    private final static int PACKSIZE = 100;

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("using : DatagramServer port number");
            return; // 제어권 넘김
        }
        try {
            int port = Integer.parseInt(args[0]);
            DatagramSocket ds = new DatagramSocket(port);
            System.out.println("The Server is ready.................");
            for (; ; ) {
                //데이터 , 데이터 조각
                DatagramPacket dp = new DatagramPacket(new byte[PACKSIZE], PACKSIZE);
                //보내기
                ds.receive(dp);
                System.out.println(dp.getAddress() + " " + dp.getPort() + " " +
                        new String(dp.getData()));
//                ds.send(dp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
