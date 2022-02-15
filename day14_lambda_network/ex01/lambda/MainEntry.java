package day14_lambda_network.ex01.lambda;
//타입을 써야하는 상황
interface Message{
    public void something(int x, int y);
}
interface Talk {
    public void something(String x, String y);
}
class Person {
    public void greeting(Message msg) {
        msg.something(1,2);
    }
    public void greeting(Talk msg) {
        msg.something("Hello", "World");
    }
}
public class MainEntry {
    public static void main(String[] args) {
        Person p = new Person();
        //람다를 이용하지 않은 방법
        p.greeting(new Message() {
            @Override
            public void something(int x, int y) {
                System.out.println("parameter value : " + x + ", " + y);
            }
        });
        System.out.println("================");
        char ch = 'A';
        //람다적용
        p.greeting((String x, String y) -> {//타입 안써도 되고, 괄호도 생략가능
            System.out.println("parameter value : " + x + ", " + y);
            //ch = 'B'; 람다에서는 값 변경 할 수 없다.
            num = 2222;//static 변수값은 변경 가능함
        });
    }//end main
    static int num = 999;
}
//parameter multi 예제
/*/
interface Message{
    public int something(int x, int y);
}
class Person {
    public void greeting(Message msg) {
        int su=msg.something(1,2);
        System.out.println("Number is " + su);
    }
}
public class MainEntry {
    public static void main(String[] args) {
        Person p = new Person();
        //람다를 이용하지 않은 방법
        p.greeting(new Message(){
            @Override
            public int something(int x, int y) {
                System.out.println("parameter예제");
                System.out.println("parameter value : " + x + ", " + y);
                return 30;
            }
        });
        System.out.println("================");
        //람다적용
        p.greeting((x, y)->{//타입 안써도 되고, 괄호도 생략가능
            System.out.println("parameter value : " + x);
            return 20;
        });

    }
}
//*/
//parameter예제
/*/
interface Message{
    public int something(int x);

}
class Person {
    public void greeting(Message msg) {
        int su=msg.something(88);
        System.out.println("Number is " + su);
    }
}
public class MainEntry {
    public static void main(String[] args) {
        Person p = new Person();
        //람다를 이용하지 않은 방법
        p.greeting(new Message(){
            @Override
            public int something(int x) {
                System.out.println("parameter예제");
                System.out.println("parameter value : " + x);
                return 30;
            }
        });
        System.out.println("================");
        //람다적용
        p.greeting((x)->{//타입 안써도 되고, 괄호도 생략가능
            System.out.println("parameter value : " + x);
            return 20;
        });

    }
}
//*/
//return type 예제
/*/
interface Message{
    public int something();

}
class Person {
    public void greeting(Message msg) {
        int su=msg.something();
        System.out.println("Number is " + su);
    }
}
public class MainEntry {
    public static void main(String[] args) {
        Person p = new Person();
        //람다를 이용하지 않은 방법
        p.greeting(new Message(){
            @Override
            public int something() {
                return 2;
            }
        });
        System.out.println("================");
        //람다적용
        p.greeting(()->{
            return 20;
        });

    }
}
//*/
