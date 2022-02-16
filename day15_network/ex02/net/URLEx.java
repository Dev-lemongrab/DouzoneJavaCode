package day15_network.ex02.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.google.com/search?q=chelsea&ei=z2wMYq_9ENGT-Aa9x7mwCA&ved=0ahUKEwjvoLe6oYP2AhXRCd4KHb1jDoYQ4dUDCA4&uact=5&oq=chelsea&gs_lcp=Cgdnd3Mtd2l6EAMyBwguELEDEEMyBQgAEIAEMgUILhCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCC4QgAQ6CAgAEIAEELEDOg4ILhCABBDHARDRAxDUAjoLCC4QxwEQ0QMQxAI6BAgAEAM6CgguEMcBENEDEAM6DgguEIAEELEDEIMBENQCOgcILhDUAhADOgsILhCABBDHARDRAzoLCAAQgAQQsQMQgwE6DgguEIAEELEDEMcBENEDOggILhCABBDUAjoHCAAQgAQQCkoECEEYAEoECEYYAFAAWMsiYK8kaANwAXgAgAG1AYgBtAiSAQMwLjiYAQCgAQGwAQDAAQE&sclient=gws-wiz");
//        BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream()));
//        String inputLine;
//        while((inputLine = br.readLine())!= null){
//            System.out.println(inputLine);
//        }
//        br.close();
        System.out.println("프로토콜 : " + url.getProtocol());
        System.out.println("호스트와 포트 : " + url.getAuthority());
        System.out.println("호스트 : " + url.getHost());
        System.out.println("포트 : " + url.getPort());
        System.out.println("경로 : " + url.getPath());
        System.out.println("질의 : " + url.getQuery());
        System.out.println("파일명 : " + url.getFile());
        System.out.println("참조 : " + url.getRef());


    }
}
