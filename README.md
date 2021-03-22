# JAVA

## day 1

* 기본적인 출력 
* [변수 할당 연습](./day1/src/day1_test/VariableTest.java)

## day 2

* [배열](./day2/src/day2/ArrayTest.java) 연습
* for반복문 
  * [구구단](./day2/src/day2/GugudanTest.java)
* [if문](./day2/src/day2/IfTest.java) 연습
* [소수](./day2/src/day2/PrimeNumberTest.java) 확인
* [별찍기](./day2/src/day2/StarTest.java)
* [Switch문](./day2/src/day2/SwitchTest.java) 연습
* [2차원 배열](./day2/src/day2/TwoArrayTest.java) 및 이중반복문
* [While](./day2/src/day2/WhileTest.java) 반복문

## day 3

* 클래스 공부
* [직원](./day3/src/day3/EmployeeTest.java) 클래스 만들고 객체 생성해보기
* 값을 반환하는 [메소드](./day3/src/day3/ReturnTypeTest.java) 연습

## day 4



## day 5

## day 6

## day 7

* 자바에서 제공하는 컬렉션 프레임워크를 사용하는 연습을 해보자

| List                   | Hash                        | Map                     |
| ---------------------- | --------------------------- | ----------------------- |
| - 순서를 유지하고 저장 | - 순서를 유지하지 않고 저장 | - 키와 값의 쌍으로 저장 |
| - 중복 저장 가능       | - 중복 저장 안됨            | - 키는 중복 저장 안됨   |



* [ArrayList](./day7/src/day7/ArrayListTest.java) 연습
* [HashSet](./day7/src/day7/HashSetTest.java) 연습
* [HashMap](./day7/src/day7/PhoneMapTest.java) 연습
* [ArrayList](./day7/src/day7/SameSentenceTest.java) 활용
* generic 타입 연습
  * [nongeneric](./day7/src/nongeneric/GenericTest.java)
  * [generic1](./day7/src/generic1/GenericTest.java)
  * [generic2](./day7/src/generic2/GenericTest.java)
* 위에 것들 [총정리](./day7/src/day7/StudentMapTest.java)

## day 8

* 중첩클래스에 대해 공부를 해보자
  * 클래스 내에서 클래스를 선언해 사용할 수 있다.
* [InnerTest1](./day8/src/day8/InnerTest1.java) 중첩클래스의 기초
  * Innerclass에는 static을 사용할 수 있다.
  * Innerclass의 종류
    * 멤버클래스로 사용되는 것
      * 인스턴스 멤버 클래스
      * 정적 멤버클래스
    * 로컬클래스로 사용되는것
* [InnerTest2](./day8/src/day8/InnerTest2.java) 
  * static클래스는 static변수에만 접근이 가능하다.
* [InnerTest3](./day8/src/day8/InnerTest3.java) 
  * 지역클래스는 지역변수에 접근이 가능하다.
  * 무명의 객체를 이용하여 코딩을 할 수 있다.
  * 람다식을 이용하여 식을 간결하게 표현할 수 있다.
* [람다식](./day8/src/day8/FunctionalTest.java) 연습
* [입출력](./day8/src/io/SystemInTest.java) 연습

|      | 1바이트<br />이미지 동영상 음향                             | 2바이트<br />문자기반                           |
| ---- | ----------------------------------------------------------- | ----------------------------------------------- |
| 입력 | InputStream<br />xxxxInputStream<br />read()<br />close()   | Reader<br />xxxReader<br />read()<br />close()  |
| 출력 | OutputStream<br />xxxOutputStream<br />write()<br />close() | Writer<br />xxxWriter<br />write()<br />close() |

* File - 파일과 디렉토리 정보 제공 클래스
  * 파일 입출력 기능 없다.

* [Scanner](./day8/src/io/ScannerTest.java) 이용 입력

* [직원메뉴](./day8/src/day8/EmployeeMenuTest.java) 실습

## day 9

* [FileClassTest](./day9/src/day9/FileClassTest.java) 파일 연습
* [파일복사](./day9/src/day9/FileCopyTest.java) 연습
* [파일](./day9/src/day9/EmployeeMenuTest.java) 이용하여 직원메뉴 저장하기
  * 파일을 이용 직원데이터를 저장
  * 파일로 저장된 데이터를 불러와 출력
  * 저장된 직원데이터를 불러와 정보를 수정 후 저장