package generic2;

class Fruit{
	String name = "과일";
}
class Apple extends Fruit{
	String origin;
	
	public Apple(String name, String origin) {
		super();
		this.origin = origin;
		this.name = name;
	}
}
class Orange extends Fruit{
	String imported;
	
	Orange(String name, String imported) {
		super();
		this.imported = imported;
		this.name = name;
	}
}
class Paper{
	String size = "A4";
}

class Box<T extends Fruit>{//타입 전달 - 정적 유지. 타입 파라미터
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

class BoxManager{
	public void test( Box<? extends Fruit> b){
		System.out.println(b.getO().name);
	}
}
public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit();
		Apple a = new Apple("사과", "대구");
		Orange o = new Orange("오렌지", "미국");
		Paper p = new Paper();
		Box<Apple> box1 = new Box<>(a);
		Box<Orange> box2 = new Box<>(o);
		Box<Fruit> box3 = new Box<>(f);
//		Box<Paper> box4 = new Box<>(p);
		
		BoxManager m = new BoxManager();
		m.test(box1);
		m.test(box2);
		m.test(box3);
//		m.test(new Box<Paper>(p));
	}

}
