package day13_thread.ex03.innerClass;
class OuterClass{
    static int no;
    String message = "hi~~";
    public void OuterMehtod() {
        System.out.println("outer method call~");
    }
    class InnerClass {
        int su = 99;
        public void show() {
            System.out.println(su);//내부 사용가능
            System.out.println(message);//외부클래스 멤버 사용가능
        }
        public void disp() {
            OuterMehtod();
        }
    }//innerClass end

}//OuterClass end
//*/
public class MainEntry {
    public static void main(String[] args) {
        //1.
        OuterClass oc = new OuterClass();
        OuterClass.InnerClass inner = oc.new InnerClass();
        inner.disp();
        inner.show();
        //2.
        OuterClass.InnerClass ic = new OuterClass().new InnerClass();
        ic.show();

    }
//*/

}
