package quiz;

public class Score {
	
	protected int kor;
	protected int eng;
	protected int com;
	protected String name;
	
	public Score() {
		
	}
	public Score(int kor, int eng, int com, String name) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
