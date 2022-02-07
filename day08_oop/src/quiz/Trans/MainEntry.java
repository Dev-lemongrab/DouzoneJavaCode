package quiz.Trans;

abstract class Trans {
	
	public abstract void start(String name);
	public abstract void stop(String name);
	public String name(String name) {
		return name;
	}
}

class Bus extends Trans{

	@Override
	public void start(String name) {
		System.out.println(name + "출발");
	}

	@Override
	public void stop(String name) {
		System.out.println(name+ "도착");
		
	}
	
}
class Train extends Trans{

	@Override
	public void start(String name) {
		System.out.println(name + "출발");
		
	}

	@Override
	public void stop(String name) {
		System.out.println(name + "도착");
		
	}
	
}
class car extends Trans{

	@Override
	public void start(String name) {
		System.out.println(name + "출발");
		
	}

	@Override
	public void stop(String name) {
		System.out.println(name + "도착");
		
	}
	
}
public class MainEntry {
	public static void main(String[] args) {
		String[] name = {"버스","기차","자동차"};
		Trans[] trans = {new Bus(), new Train(), new car()};
		for(int i = 0 ; i<trans.length; i++) {
			trans[i].start(name[i]);
			trans[i].stop(name[i]);
		}
		
	}
}