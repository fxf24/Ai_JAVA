package day8;

public class InnerTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int out = 10;
		class Inner{
			public int count(){
				int cnt = 0;
				for(int i = 0; i < out; i++) {
					cnt += i;
				}//for end
				return cnt;
			}//count end
		}//class Inner end
		
		System.out.println(new Inner().count());
		//무명객체
//		interface Runnable{public void run();}
//		class RunnableSub implements Runnable{
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("실행중");
//			}
//			
//		}
		
		//지역 내부 객체 생성
//		RunnableSub sub = new RunnableSub();
		//메소드 호출
//		sub.run();
//		Thread t1 = new Thread(sub);
//		t1.start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("실행중111");
			}
		}).start();
		
		new Thread(() ->{System.out.println("실행중222");	}
		).start();
		
		myInter i = new myInter() {
			@Override
			public void mi1() {
				// TODO Auto-generated method stub
				System.out.println("mi1");
			}@Override
			public void mi2() {
				// TODO Auto-generated method stub
				System.out.println("mi1");
			}
			String name = "100";
			public void mi3() {
				System.out.println(name);
			}
		};
		
		i.mi1();
		i.mi2();
	}//main end

}

interface myInter{
	void mi1();
	void mi2();
}
