package ex01.string;

public class StringMain {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x = " + x + "\t y = " + y);
        System.out.println("x = " + x + "\t y = " + y);
        // 기본자료형 x와 y의 서로의 주소 값은 다르다. 값만 대입된다.
        // 따라서 두개의 주소 값. 주소값이 달라지지 않는다.

        x = y;
        System.out.println("x = " + x + "\t y = " + y);

        // String은 힙영역에 k o r e a \0 이런식으로 들어가게 된다.
        // 해당 힙영역에 주소값은 스택영역에 한 부분으로 들어가게 된다.
        String s1 = "korea";
        String s2 = "happy";
        System.out.println("s1 =" + s1 + "\t s2 = " + s2);
        // 각각에 할당 받은 주소의 값이 다르다.
        System.out.println("s1 hash code =" + s1.hashCode()
                + "\t s2 hash code = " + s2.hashCode());

        // 참조형 변수는 주소의 값을 공유한다.
        // 따라서 하나의 주소값이다.
        // 하지만, s1에 새로운 변수를 대입하면, 새롭게 힙영역에 메모리가 할당되서
        // s1의 스택영역에 새로운 주소번지가 기록된다.
        // s2는 그대로 s1의 주소번지를 가르킨다.
        s1 = s2;
        System.out.println("s1 =" + s1 + "\t s2 = " + s2);
        System.out.println("s1 hash code =" + s1.hashCode()
                + "\t s2 hash code = " + s2.hashCode());

        // s1의 주소가 바뀌었다.
        s1 = "jaebin";
        System.out.println("s1 =" + s1 + "\t s2 = " + s2);
        System.out.println("s1 hash code =" + s1.hashCode()
                + "\t s2 hash code = " + s2.hashCode());

        s2 = "kosa";
        System.out.println("s1 =" + s1 + "\t s2 = " + s2);
        System.out.println("s1 hash code =" + s1.hashCode()
                + "\t s2 hash code = " + s2.hashCode());

        // 결론 String 클래스는 낭비를 초래한다.
        // String은 새로운 값이 대입되면, 새로운 객체를 할당하여 주소가 달라진다.
        // 따라서 String에 대입을 하거나 새로운 연산을 하면 새롭게 메모리를 할당하기 때문에 메모리 낭비이기때문에
        // 문자열을 연산할때는 String 을 사용하지 않고 , StringBuffer나 StringBuilder를 사용한다.

        // 다시 s2를 "happy"로 바꾸면, "happy"의 주소였던 99047136이 찍힌다.
        s2 = "happy";
        System.out.println("s1 =" + s1 + "\t s2 = " + s2);
        System.out.println("s1 hash code =" + s1.hashCode()
                + "\t s2 hash code = " + s2.hashCode());

        String s3 = "happy";
        System.out.println("s3 hash code =" + s3.hashCode());
    }
}
