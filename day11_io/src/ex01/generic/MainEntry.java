package ex01.generic;

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str = {"abc", "kbs","dirotor"};
		t1.set(str);
		t1.print();
		System.out.println("--------------------------");
	}
}
