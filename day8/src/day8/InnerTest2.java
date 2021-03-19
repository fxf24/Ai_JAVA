package day8;

class Outer2{
	int outervar = 10; //외부클래스 non-static 멤버변수
	static int outervar2 = 20; //외부클래스 static 멤버변수
	String name = "Outer2";
	
	class Inner{ //non-static(=인스턴스) 멤버중첩클래스
		String name = "Inner";
		void m() {
			String name = "m메소드";
			System.out.println("중첩클래스 메소드 실행");
			System.out.println(outervar);
			System.out.println(outervar2);
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Outer2.this.name);
		}
	}//inner end
	static class Inner2{ //static 멤버중첩클래스
		void m2() {
			System.out.println("중첩클래스 메소드 실행2");
//			System.out.println(outervar);
			System.out.println(outervar2);
		}
	}
	void test() {
		//지역중첩클래스
		class Inner3{
			void m3() {
				System.out.println("중첩클래스 메소드 실행3");
			}
		}
		new Inner3().m3();
	}//test end
}
public class InnerTest2 {
// 1> main 실행 이전 static(변수, 내부클래스, 메소드) 메모리 저장
// 2> new Outer2() 실행
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Outer o = new Outer();
//		o.멤버변수명 객체생성
		Outer2.Inner i = new Outer2().new Inner();
		i.m();
		
		Outer2.Inner2 i2 = new Outer2.Inner2();
		i2.m2();
		
		Outer2 o = new Outer2();
		o.test();
		
	}

}
