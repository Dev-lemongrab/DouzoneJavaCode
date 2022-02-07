package quiz.Trans;

interface TransI {
	
	public abstract void start(String name);
	public abstract void stop(String name);
	public String name(String name); 
}

class BusI implements TransI{

	@Override
	public void start(String name) {
		System.out.println(name + "출발");
	}

	@Override
	public void stop(String name) {
		System.out.println(name+ "도착");
		
	}

	@Override
	public String name(String name) {
		return name;
	}
	
}
class TrainI implements TransI{

	@Override
	public void start(String name) {
		System.out.println(name + "출발");
		
	}

	@Override
	public void stop(String name) {
		System.out.println(name + "도착");
		
	}

	@Override
	public String name(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class carI implements TransI{

	@Override
	public void start(String name) {
		System.out.println(name + "출발");
		
	}

	@Override
	public void stop(String name) {
		System.out.println(name + "도착");
		
	}

	@Override
	public String name(String name) {
		return name;
	}
	
}
public class QuizInterface {
	public static void main(String[] args) {
		String[] name = {"버스","기차","자동차"};
		TransI[] trans = {new BusI(), new TrainI(), new carI()};
		for(int i = 0 ; i<trans.length; i++) {
			trans[i].start(name[i]);
			trans[i].stop(name[i]);
		}
		
	}
}