package quiz;

/**
 * 문제] 비만도 측정 프로그램 작성하기 - collection,file io 이용하기
 * 추가/삭제/출력/파일저장/종료 
 * 몸무게, 키를 입력 받아서 BMI 계산하기
 * BMI = 몸무게/((키/100.0)*(키/100.0));
 * 
 * 남: (신장 - 100) * 0.9
 * 여: (신장 - 100) *0.85
 * 
 * 판정 > 
 * 18.5 미만 체중부족
 * 18.5 ~ 22.9 정상 
 * 23.0 ~ 224.9 과체중
 * 25.0 이상 비만
 * */


public class Person {
	String name;
	int weight;
	int height;
	String gender;
	double bmi;
	double properWeight;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int weight, int height, String gender) {
		super();
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		this.name = name;
		
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public double getProperWeight() {
		return properWeight;
	}

	public void setProperWeight(double properWeight) {
		this.properWeight = properWeight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", height=" + height + ", gender=" + gender + ", bmi="
				+ bmi + ", properWeight=" + properWeight + "]";
	}
	
	
	
	
}
