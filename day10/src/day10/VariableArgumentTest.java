package day10;
class A{
	int add(int... numbers) {
		System.out.println("전달매개변수 갯수=" + numbers.length);
		int result = 0;
		for(int i : numbers) {
			result += i;
		}
		
		return result;
	}
}
public class VariableArgumentTest {

	//public static void main(String[] args) {
	static public void main(String... args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		A a1 = new A();
		int result = a1.add(1,2);
		System.out.println("총합=" + result);
		result = a1.add(1,2,3,4);
		System.out.println("총합=" + result);
		result = a1.add(1,2,346,3,7,4,6);
		System.out.println("총합=" + result);
		result = a1.add(1,2,7,8,9,45,346,2);
		System.out.println("총합=" + result);
		
	}

}
