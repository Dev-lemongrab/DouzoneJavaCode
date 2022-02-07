package ex02.Abstract;

public abstract class Shape {
    //default -> 자신의 패키지 내 에서만 사용 가능
    protected double result = 0;

    public abstract double calc(double x); // 추상 메소드
    public abstract void show(String name); // 추상 메소드
    public void view(){
        System.out.println("Super class Shape");
    }
    // 추상메소드를 구현하는 이유? 부모에서 메소드를 만들어도 자식이 가져다가 쓰지 않으면 의미가 없다.
    // 그렇기 때문에 추상메소드로 구현하여 자식에서 무조건적으로 구현하게 할 수 있다.


}
