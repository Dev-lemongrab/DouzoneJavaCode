package ex02.Abstract;

public class MainEntry {
    public static void main(String[] args) {
        /**
         * 결론적 : 추상클래스를 만났다하면 자식클래스에 추상메소드를 override 하고
         * 객체를 생성 및 선언하여 사용한다.
         * 대표 : java.io > java.io.inputstream >
         * */

        /**
         * 다형성 : overlad, constructor,abstract class 로도 가능합니다.
         * */

        //3.
        // 부모로 인스턴스 생성 불가능!! 추상 클래스
        // Shape shape = new Shape();
        Shape[] shapes = new Shape[3]; // 배열 생성 및 선언
        shapes[0] = new Circle();
        shapes[1] = new Rect();
        shapes[2] = new Triangle();

        Object[] objects = {new Circle(), new Rect(), new Triangle()};
        String[] name = {"Circle", "Rect", "Triangle"};
        for (int i = 0; i < objects.length; i++) {
            // 큰 Object 에서는 작은 Shape 객체에 들어가기 위해서는 Shape으로 형 변환.
            shapes[i] = (Shape) objects[i];
            shapes[i].show(name[i]);
        }


        System.out.println("===========================");
        //2. Shape 부모 추상클래스를 이용해서 객체 생성
        Shape shape1 = new Circle();
        shape1.show("Circle Circle");

        shape1 = new Rect();
        shape1.show("Rect Rect");

        shape1 = new Triangle();
        shape1.show("Triangle Triangle");

        System.out.println("===========================");
        // 1. 각자의 클래스로 객체 생성 형태
        Circle circle = new Circle();
        circle.show("원");

        Rect rect = new Rect();
        rect.show("Rectangle");

        Triangle triangle = new Triangle();
        triangle.show("삼각형");

        /**
         * 다형성 구현 : 하나의 호출로 다양한 형태의 결과 값을 얻어 내는 성질 ->
         * print야 하면 어쩔때는 원 어쩔때는 삼각형 ...
         * */
        Shape shape = new Circle();
        shape.show("Circle");
    }
}
