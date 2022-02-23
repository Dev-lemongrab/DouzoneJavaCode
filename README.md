# DouzoneJavaTIL

> 💡 더존 비즈온 채용확정형 2기 자바 강의 </br>
>매일 학습한 코드들을 올리는 공간입니다. 

---

## Day1. 자바개념학습

---
<details>
<summary style="font-size: x-large">:: 👀 학습내용 확인하기 :: </summary>
<div markdown="1">

</div>
</details>

---

## Day2. DataType

---

<details>
<summary style="font-size: x-large">:: 👀 학습내용 확인하기 :: </summary>
<div markdown="1">

</div>
</details>

---

## Day3. Operator

---

<details>
<summary style="font-size: x-large">:: 👀 학습내용 확인하기 :: </summary>
<div markdown="1">


</div>
</details>

---

## Day4. controller

---

<details>
<summary style="font-size: x-large">:: 👀 학습내용 확인하기 :: </summary>
<div markdown="1">

<h2>확장 for문</h2></h2>

---

>📌 개념
>- 인덱스 없이 배열이나 컬렉션의 값을 읽어올 때 활용한다.

>📌 사용방법
>- for(자료형 변수명 : 컬렉션명 or 배열명) { 반복구문; }

</div>
</details>

---

## Day5. array

---

<details>
<summary style="font-size: x-large">:: 👀 학습내용 확인하기 :: </summary>
<div markdown="1">

---
<h2>📌 정렬</h2>



> ❗️ 선택정렬
>>- 제자리정렬 알고리즘
>>- 단순하게 사용할 수 있다.
>>- 메모리 효율이 좋다
>>- O(n^2)
>>- 방법
>>>1. 주어진 리스트 중 최소값을 찾는다</br>
>>>2. 그 값을 맨앞의 위치한 값과 교체
>>>3. 맨처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체
   
> ❗ 버블정렬
>>-   O(n^2)
>>-   방법
>>>1. 서로 인접한 두원소 크기를 검사한다.
>>>2. 인접한 두수를 계속 비교해 가장 큰 자료가 맨뒤로 가도록 한다.
   
> ❗거품정렬
>>- 단순하기 때문에 자주사용된다 
>>- 원소의 이동이 거품이 수면으로 올라오는 듯한 모습


</div>
</details>

---

## Day6. method

---

<details>
<summary style="font-size: x-large">:: 👀 학습내용 확인하기 :: </summary>
<div markdown="1">

---

<h2>📌 메소드</h2>


>❗️return 값 : 오직 한개의 데이터만 리턴
>>- 상수, 변수, 수식</br>

>❗가변길이 함수</br>
>>- 매개변수명 앞에 ...을 붙여서 가변길이의 매개변수를 받을 수 있다.</br>

> ❗활용</br>
>>- 메인함수 부담 줄이고, 반복적인 코드를 함수로 만들어서 사용하면 재사용성을 높일 수 있다.</br>
>>- 모듈화를 통해 코드의 가독성 향상</br>
>>- 기능 변경 혹은 문제 발생 시 유지보수성 향상</br>

> ❗매개변수와 리턴타입
>> 1) 매개변수없고 리턴타입 없는 경우
>> 2) 매개변수 있고 리턴타입 없는 경우
>> 3) 매개변수 없고 리턴타입 있는 경우
>> 4) 매개변수 있고 리턴타입 있는 경우

>❗메소드 종류
>>- Instance Method : 객채를 생성하고 사용해야한다.(메모리상 할당)</br>
>>- Static Method : 객체생성 없이 바로 사용가능하다.
>>>- object.methodName();</br>
>>>- ClassName.methodName();

>❗overload(중복함수)
>- 개념 : 함수명은 같고, 매개변수의 개수가 다르거나 자료형이 다른 함수
>- 다형성 구현
>>- 예시 - println()</br>
println()</br>
println(boolean x)</br>
println(char x)</br>
println(char[] x)</br>
println(double x)</br>
println(float x)</br>
println(int x)</br>
println(long x)</br>
println(Object x)</br>
println(String x)</br>

>👀 난수만들기
>>1. Math.random() - java.lang
>>   - static 메소드로 클래스 이름.메서드 형태로 사용
>>   - *N 의 형태로 0~N-1 값 추출
>>2. Random Class - java.util package
>>   - 패키지를 임포트해서 객체생성 후 사용
>>   - *N 의 형태로 0~N-1 값 추출


</div>
</details>

## Day7. oop

---

<details>
<summary style="font-size: x-large">:: 👀 학습내용 확인하기 :: </summary>
<div markdown="1">

<h2>📌객체</h2>

> ❗️개념(Object Oriented Programming)
>>- 인간중심의 프로그래밍. 현실세계를 프로그래밍으로 옮겨온 듯이 구현 하는 방법이다.
>>- 객체 생성시, 메모리 할당 -> 힙영역
 
>❗️4가지 특성
>>- 추상화
>>- 캡슐화 : 객체안의 데이터를 바로 접근할 수 있도록 정보를 은닉화 
>>  - 접근지정자
>>      - private : 같은클래스 안에서만 접근 가능
>>      - protected : 같은 패지지에서 접근하는 것이 가능 + 다른패키지에서 상속가능
>>      - default :  같은패키지안에서 접근하는것이 가능 
>>      - public : 어디에서나 접근가능
>>- 다형성 : 하나의 메소드나 클래스가 다양한 방법으로 동작하고 나타나는 성질
>>-  상속 : 동일설명 관계로 이동

> ❗클래스설계
>>- 객체를 생성하기 위한 설계도
>>-  상속(Inheritance)
>>    -   오버라이딩(Override)
>>        - 함수명, 리턴타입, 매개변수 개수가 같은 함수
>>        -  재정의 : 부모객체의 함수를 똑같이 받아와서 자식객체에 맞게 재정의
>>    - 클래스명 extends 부모객체
>>    - 단일상속만 지원
>>    - super
>>        - 상속받은 부모객체의 주소를 갖고있으며, 이것으로 부모객체에 접근한다.
>>        - super() : 부모클래스의 생성자함수
>>    - this
>>        -  객체가 생성될때 그 객체의 시작주소를 갖고 있다. 자기 자신에게 접근할 때 사용
>>        - this() : 생성자 함수의 다른이름 
>>    - 재사용 : 자주사용되는 로직을 만들어서 상속받게 되면 계속해서 사용할 수 있다.
>>    - 확장 : 공통기능을 갖고있는 클래스 하나로 여러형태의 객체를 만들 수 있다.
>>    - 형식
>>        - class Super { // 부모클래스} 
>>        - class Sub extends Super { //자식클래스 }
>>    - 생성자(Constructor)
>>        - 클래스명과 동일하다
>>        - 리턴타입이 없다
>>        - 멤버변수의 초기화를 담당한다.
>>        - 중복정의가 가능하다 (overload)
>>        - default constructor를 갖고 있다.</br>단, 사용자가 생성자 함수를 재정의 하면 디폴트 생성자 함수 기능 상실. 둘다 정의하는 것을 권장
            </br>터미널을 활용해 API문서를 생성하여 default생성자를 글로 확인할 수 있다.
            </br>cd /클래스디렉토리 후 javadoc 클래스명.java
>>    - getter/setter
>>        - 정보은닉</br>  인스턴스들을 private으로 정의해 외부에서 접근불가하게 만듦
            </br>외부에서 객체의 인스턴스에  접근하기 위한 get메서드
            </br>외부에서 객체의 인스턴스를 초기화하기 위한 set메서드
>>        - set과 생성자의 차이</br>1. set은 계속 메서드 호출로 인스턴스를 초기화 해줄 수 있다.</br>2. 생성자는 생성 당시 한번만 인스턴스들을 초기화한다.

</div>
</details>

---

## Day8. oop

---

<details>
<summary style="font-size: x-large">:: 👀 학습내용 확인하기 :: </summary>
<div markdown="1">

</div>
</details>

---

## Day9. api

---

<details>
<summary style="font-size: x-large">:: 👀 학습내용 확인하기 :: </summary>
<div markdown="1">

</div>
</details>

---

## Day10. collection

---

<details>
<summary style="font-size: x-large">:: 👀 학습내용 확인하기 :: </summary>
<div markdown="1">

</div>
</details>

## Day11. IO

---

<details>
<summary style="font-size: x-large">:: 👀 학습내용 확인하기 :: </summary>
<div markdown="1">

</div>
</details>

---