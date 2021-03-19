package day8;

class Outer{
	class Inner{ //non-static(=인스턴스) 멤버중첩클래스
		void m() {
			System.out.println("중첩클래스 메소드 실행");
		}
	}//inner end
	static class Inner2{ //static 멤버중첩클래스
		void m2() {
			System.out.println("중첩클래스 메소드 실행2");
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
public class InnerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Outer o = new Outer();
//		o.멤버변수명 객체생성
		Outer.Inner i = new Outer().new Inner();
		i.m();
		
		Outer.Inner2 i2 = new Outer.Inner2();
		i2.m2();
		
		Outer o = new Outer();
		o.test();
		
	}

}
