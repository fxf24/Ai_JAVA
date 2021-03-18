package day7;

class Student<T>{
	T id;
	String name;
	int kor, eng, mat;
	Student(T id, String name, int kor, int eng, int mat) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = id + "-" + name + "-" + kor + eng + mat;
		return s;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		int me = kor + eng + mat;
		int other = ((Student<T>)obj).kor + ((Student<T>)obj).eng + ((Student<T>)obj).mat ;
		if(me == other) {
			return true;
		}
		return false;
	}
}
public class StudentMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student<Integer> s1 = new Student<>(100, "김자바", 100, 90, 80);
		Student<String> s2= new Student<>("200", "박지원", 100, 100, 70);
		System.out.println(s1); //id-name-총점
		System.out.println(s2);
		
		if(s1.equals(s2)) {
			//세과목 총점 같으면 true
			System.out.println(true);
		}
	}

}
