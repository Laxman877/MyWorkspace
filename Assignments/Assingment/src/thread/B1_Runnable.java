package thread;
//B1. W.A.J. P to create one thread by implementing Runnable interface in Class. 
class X implements Runnable{
	public void run() {
		System.out.println("thread is running");
	}
}
public class B1_Runnable {
	public static void main(String[] args) {
		X x= new X();
		Thread t1= new Thread(x);
		t1.start();
	}

}
