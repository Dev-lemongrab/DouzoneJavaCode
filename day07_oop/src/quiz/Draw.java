package quiz;

public class Draw {//Super class
	protected int w, h;
	protected double result;
	
	public Draw() {
		//생성자
	}
	
	public Draw(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public double getResult() {
		return result;
	}

	//toString()
	@Override
	public String toString() {
		return "Draw [w=" + w + ", h=" + h + ", result=" + result + "]";
	}
	
	public void Output() {
		System.out.println(toString());
	}
	
	public double Width() {
		return result;
	}
	
}
