package day15_network.ex02.net;
import java.io.*;
import java.net.*;

public class URLEx2 {
	public static void main(String[] args) 
						throws MalformedURLException ,  IOException { //
		
		URL google = new URL("http://www.google.com");  //
		
		BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream())); //
		
		String inputLine;
		
		while( (inputLine = br.readLine() ) != null ) {  //
			System.out.println(inputLine);
		}
		
		br.close();
	}
}
