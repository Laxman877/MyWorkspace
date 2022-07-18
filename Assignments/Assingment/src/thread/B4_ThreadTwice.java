package thread;
//B4.W.A.J.P to start the same Thread twice by calling start () method twice
class TestThreadTwice1 extends Thread{
	@Override
	public void run() {
		System.out.println("running twice...");
	}
}
public class B4_ThreadTwice {
	public static void main(String[] args) {
		TestThreadTwice1 t1 = new TestThreadTwice1();
		t1.start();
		t1.start();
	}
}
