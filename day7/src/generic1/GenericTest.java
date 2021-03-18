package generic1;

class Apple{
	String origin = "대구";
	
}
class Paper{
	String size = "A4";
}
class Box<T, K>{//타입 전달 - 정적 유지. 타입 파라미터
	T t1;
	K k1;
	
	
	Box(T t1, K k1) {
		this.t1 = t1;
		this.k1 = k1;
	}
	
	public T getT1() {
		return t1;
	}
	public void setT1(T t1) {
		this.t1 = t1;
	}
	public K getK1() {
		return k1;
	}
	public void setK1(K k1) {
		this.k1 = k1;
	}
	
}
public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a = new Apple();
		Paper p = new Paper();
		Box<Apple, Paper> Box = new Box<>(a, p);
		
		
		System.out.println(Box.getT1().origin);
		System.out.println(Box.getK1().size);
		
	}

}
