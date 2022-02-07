package ex02.Abstract;

public class Rect extends Shape {
    int h = 10;

    @Override
    public double calc(double x) {
        result = x * h;
        return result;
    }

    @Override
    public void show(String name) {
        calc(5.5);
        System.out.println(result + " 크기의 " + name + " 이 그려졌습니다.");
    }
}
