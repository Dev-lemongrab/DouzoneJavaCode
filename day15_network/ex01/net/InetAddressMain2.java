package day15_network.ex01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain2 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("로컬 호스트 이름 : " + address.getHostName());
        System.out.println("로컬 호스트 IP주소 : " + address.getHostAddress());

        address = InetAddress.getByName("www.naver.com");
        System.out.println("로컬 호스트 이름 : " + address.getHostName());
        System.out.println("로컬 호스트 IP주소 : " + address.getHostAddress());
        byte[] addr = new byte[4];
        addr[0]= (byte)211;
        addr[1]= (byte)249;
        addr[2]= (byte)220;
        addr[3]= (byte)24;
        address = InetAddress.getByAddress(addr);
        System.out.println("daum 호스트 이름 : " + address.getCanonicalHostName());
        System.out.println("daum 호스트 이름 : " + address.getHostName());
        System.out.println("daum 호스트IP 주소 : " + address.getHostAddress());

        InetAddress[] arr;
        arr = InetAddress.getAllByName("www.google.com");
        for(InetAddress item : arr) {
            System.out.println("google 호스트 이름 : " + item.getHostName());
            System.out.println("google 호스트 IP 주소 : " +item.getHostAddress());
        }

    }
}
