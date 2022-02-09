package ex01.string;

public class StringMethod {
	public static void main(String[] args) {
		
		String s1 = "happyYunseong";
		String s2 = "SEOUL";
		
		System.out.println(s2.hashCode());
		System.out.println(s2.replace("EO", "korea"));
		System.out.println(s2);
		System.out.println(s2.hashCode());
		s2 = s2.replace("EO", "korea");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println();
		s1 = s1+s2;
		System.out.println(s1);
		System.out.println("==================");
		String s3 = new String("     ab     cd     ");
		System.out.println(s3);
		System.out.println(s3.length());//문자열 길이
		s3 = s3.trim();
		System.out.println(s3);
		System.out.println(s3.length());//문자열 길이
//		String s4 = new String("fd s fad sf ad sf");
//		String[] s5 = s4.split(" ");
		String s4 = new String("fd/s/ad/sf/ad/sf");
		String[] s5 = s4.split("/");
		for(int i = 0; i<s5.length;i++) {
			System.out.println(i+"번 문자열 : " + s5[i]);
		}
		String s6 = "123451235fdsfds 123123 dfsfds 312312 String";
		int n = s6.indexOf('5');
		System.out.println(n);
		System.out.println(s6.indexOf('r')); 
		System.out.println(s6.lastIndexOf('5'));
		
		System.out.println("=================");
		char ch = s6.charAt(24);
		System.out.println(ch);
		System.out.println(s6.charAt(21));
		
		s6 = s6.substring(3);//3번인덱스부터 끝까지 출력
		System.out.println(s6);
		
		s6 = s6.substring(5,7);//시작값 포함, 끝값 미포함
		System.out.println(s6);
		System.out.println("++++++++++++++++++++++");
		System.out.println("소문자로 출력 toLowerCase() : " + s2.toLowerCase());
		System.out.println("대문자로 출력 toUpperCase() : " + s2.toUpperCase());
		
		System.out.println(s1.length());//문자열 길이
		char[] ch2 = s1.toCharArray();
		for (int i = 0; i < ch2.length; i++) {
			System.out.println(ch2);
		}
		
//		String str = "abc";
//		System.out.println(str);
//		
//		System.out.println(str.concat("def"));
//		System.out.println(str + "def");
//		String msg = "32213312";
//		System.out.println(str+msg);
		
		
	}
}
