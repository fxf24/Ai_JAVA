package nongeneric;

class Apple{
	String origin = "대구";
	
}
class Paper{
	String size = "A4";
}
class Box<T>{//타입 전달 - 정적 유지. 타입 파라미터
	T o;
	Box(T o){
		this.o = o;
	}
	public T getO() {
		return o;
	}
	public void setO(T o) {
		this.o = o;
	}
	
}
public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a = new Apple();
		Paper p = new Paper();
		Box<Apple> appleBox = new Box<>(a);
		
		Box<Paper> paperBox = new Box<>(p);
		System.out.println(appleBox.getO().origin);
		
		System.out.println(paperBox.getO().size);
	}

}
