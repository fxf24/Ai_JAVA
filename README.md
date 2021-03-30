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

* [생성자](./day4/src/day4/ConstructorTest.java) 오버로딩 연습
* [메소드](./day4/src/day4/OverloadTest.java) 오버로딩 연습
* [추상클래스](./day4/src/edu/AbstractTest.java) 연습
* 클래스[상속](./day4/src/edu/InheritanceTest.java) 연습
* [타입캐스팅](./day4/src/edu/TypeCastingTest.java) 연습

## day 5

* [인터페이스](./day5/src/day5/InterfaceTest.java) 연습 [학생](./day5/src/day5/Student.java) [선생님](./day5/src/day5/Teacher.java)
* [오브젝트](./day5/src/day5/ObjectClassTest.java) 클래스의 이해
* [예외](./day5/src/day5/ExceptionTest.java) 연습, [throw](./day5/src/day5/ThrowsTest.java) 이용 예외
* 상속을 이용한 [직원 클래스](./day5/src/day5/SalaryTest.java) 만들기 연습

## day 6

* [멀티쓰레드](./day6/src/day6/MultiThreadTest.java) 연습
* [정규식 패턴](./day6/src/day6/PatternTest.java) 연습
* [문자열](./day6/src/day6/StringTest.java) 함수 연습
* Calendar, SimpledateFormat 이용 [시간](./day6/src/day6/TimeTest.java) 나타내기
* [Runnable](./day6/src/runna/MultiThreadTest.java) 이용 멀티쓰레드 연습
* [Synchronized](./day6/src/day6/SynchronizedTest.java) 연습
* [책방](./day6/src/day6/BookStrore.java) 목록 보여주기 실습

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

* 통신 구현

| tcp 통신 구현-전화                                           | udp 통신 구현 - 이메일                                       |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| java.net.ServerSocket<br />java.net.Socket<br />1> 연결<br />2> 서버 출력 - 클라이언트 입력<br />3> 클라이언트 출력 - 서버입력<br />4> 연결해제<br /> | java.net.DatagramSocket<br />java.net.DatagramPacket<br />1> 보낸이메일 + 받는이메일 + 내용1<br />2> 보낸이메일 + 받는이메일 + 내용2<br />3> 연결x<br />4> 동시에 대량 내용 전송<br />5> 응답 필요 없는 메시지 |
| http - 웹클라이언트/서버                                     |                                                              |

## day 10

* [서버](./day10/src/server/TCPServer.java) 와 [클라이언트](./day10/src/client/TCPClient.java) 연습
* DataStream을 이용한 [서버](./day10/src/server/TCPServer_Data.java) 와 [클라이언트](./day10/src/client/TCPClient_Data.java)

| MemberServer서버                                             | MemberClient클라이언트                                       |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| 1> 클라이언트로부터 아이디와 암호를 전송받음<br />2> 아이디는 String ids[] = {}"java", "jsp", "spring"}; 중복체크한다.<br />3> 클라이언트에게전송한다.<br />중복된 아이디라면 "다른 아이디를 사용하세요" 전송한다.<br />중복되지 않았다면 클라이언트 "xxxx는 가능합니다" 전송한다. | 1> 회원아이디입력: XXX(키보드)<br />2> 암호입력 : XXX(키보드)<br />3> 서버로 전송한다.<br />아이디 암호<br />4> 서버로부터 결과를 입력받는다. |

* [MemberServer](./day10/src/server/MemberServer.java) 와 [MemberClient](./day10/src/client/MemberClient.java)

* [비정형 매개변수](./day10/src/day10/VariableArgumentTest.java)
  * [자료형... 변수명] 형식을 통해 여러개의 값을 매개변수로 넘겨줄 수 있다.

| DAO(Data Acess Object)                                       | VO(Value Object)                                             | DTO(Data Transfer Object)                                    |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 1> 데이터에 직접 접근하는 객체<br />2> 데이터를 조회, 조작하는 기능을 전담하는 객체 | 1> 데이터 교환을 위한 객체<br /><br />2> 속성과 그 속성에 접근하기위한 getter setter만 가지고 있는 객체<br />3> read only | 1> 데이터 교환을 위한 객체<br />2> 속성과 그 속성에 접근하기위한 getter setter만 가지고 있는 객체 |



* DAO/ VO/ DTO를 이용하여 [EmployeeMenu](./day10/src/template/EmployeeMenuTest.java) 만들기
  * [Controller](./day10/src/template/Controller.java)는 싱글톤 패턴을 이용하여 생성
  * [EmplyeeVO](./day10/src/template/EmplyeeVO.java) 와 [EmployeeDAO](./day10/src/template/EmployeeDAO.java) 생성
  * [InsertProcess](./day10/src/template/InserProcess.java) 와 [ViewProcess](./day10/src/template/ViewProcess.java) 생성

# DB

## jdbc

* java에 oracle db를 [연결](./jdbc/src/jdbc/ConnectionTest.java)하여 사용해본다.
* java로 oracle db에 [insert](./jdbc/src/jdbc/InsertTest.java) 연습
* java로 oracle db에 [update](./jdbc/src/jdbc/UpdateTest.java) 연습
* java로 oracle db에 [select](./jdbc/src/jdbc/SelectTest.java) 연습
* [PreparedStatement](./jdbc/src/jdbc/PreparedInsertTest.java) 연습
  * [PreparedStatement](./jdbc/src/jdbc/PreparedSelectTest.java) 연습

## Board

* DB를 이용하여 게시판을 만들어보자
* 게시판 [DTO](./board/src/board/BoardDTO.java)
* 게시판 [DAO](./board/src/board/BoardDAO.java)
* 게시판 [Insert](./board/src/board/BoardInsertView.java), [List](./board/src/board/BoardListView.java) view
* 게시판 [Main](./board/src/board/BoardMain.java)