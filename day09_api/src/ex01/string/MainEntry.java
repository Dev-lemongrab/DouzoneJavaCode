package ex01.string;

public class MainEntry {
    public static void main(String[] args) {
        /**
         * String 클래스란? 문자열 클래스, 참조형 클래스
         * 불변 객체 :  변하지 않는 형태  -> 이런형태 때문에 생긴 객체
         * StringBuffer , StringBuilder
         * 자동적으로 Serializable 되어서 인덱스가 생성된다.
         * */
        String str = new String("korea"); // 기본 선언
        // 기본자료형
        int x = 99;
        double y = 12.34;

        // String은 기본자료형이 아니고 객체를 생성하여 넣어줘야 되지만,
        // 특수한 형태로 직접 넣어줄 수 있다.
        // String은 불변 객체.
        // 얘는 스태틱 영역으로 들어감.
        String message = "hi!!";

        System.out.println(str);
        System.out.println(x + "," + y);
        System.out.println(message);

        //문자 배열 인수에 포함된 문자 하나 하나를 새로운 문자열로 할당할 수 있다.
        char data[] = {'a', 'b', 'c'};
        String str2 = new String(data);
        System.out.println(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
        System.out.println();
        System.out.println(str2);

        /**
         * concat() , += : 문자열 결합
         * contains(CharSequence s) :
         * getBytes() :  문자의 개수
         * isEmpty() : 비어 있는지 없는지
         * indexOf(문자열) :  해당 문자열이 몇번째 위치에 존재하는지? 앞에서부터
         * lostIndexOf(문자열) :  뒤에서 부터
         * length() : 문자열 길이
         * replace(타겟, 새로운 문자열) : 타겟을 새 문자열로 변환
         * split :  문자열 구분
         * toUpperCase() :  대문자로 변환
         * toLowerCase() : 소문자로 변환환         *
         * substring();
         * */


    }

}
