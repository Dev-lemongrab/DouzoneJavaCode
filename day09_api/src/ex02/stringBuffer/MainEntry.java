package ex02.stringBuffer;

public class MainEntry {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("length / capacity");
		int len = sb.length(); int size = sb.capacity();
		System.out.println(len + "  /  " + size);
		
		sb.append("happyvirus");
		len = sb.length(); size = sb.capacity();
		System.out.println(len + "  /  " + size);//10 / 16
		
		sb.append("12345 67890");//sb = 21 /34 ?? 배로늘어날 때 널문자를 갖고 늘어나서 x배 + 2만큼 늘어난다.
		len = sb.length(); size = sb.capacity();
		System.out.println(sb.length() + "  /  " + sb.capacity());
		
		sb.append("fdsfds fds f dsf dsfdsf"); //44 / 70 68+2바이트
		System.out.println(sb.length() + "  /  " + sb.capacity());

		System.out.println(sb);		
		
		sb.trimToSize();//용량크기 조정 : 비어있는 용량을 실제 문자열길이만큼 줄여줌
		System.out.println(sb.length() + "  /  " + sb.capacity());// 44 / 44
	
		
		
		
	}
}
