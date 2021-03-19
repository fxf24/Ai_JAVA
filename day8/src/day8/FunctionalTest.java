package day8;

@FunctionalInterface
interface Math{
	public int calc(int first, int second);
//	public double cal2(double f, double s);
}
@FunctionalInterface
interface A{
	int ma();
}
@FunctionalInterface
interface B{
	int mb(int i);
}
public class FunctionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math m = (a, b) -> a * b;
		System.out.println(m.calc(10, 2));
		
//		Math m2 = (int first, int second)->{return first - second;};
		Math m2 = (i, j) -> i - j;
		System.out.println((m2.calc(10, 2)));
		
		Math m3 = (i, j) -> i + j;
		System.out.println((m3.calc(10, 2)));
		
		Math m4 = (i, j) -> i / j;
		System.out.println((m4.calc(10, 2)));
		
		A a1 = () -> 1;
		System.out.println(a1.ma());
		
		B b1 = (a) -> {
			System.out.println(" 람다식 실행");
			return a*a;
		};
		System.out.println(b1.mb(10));
	}

}
