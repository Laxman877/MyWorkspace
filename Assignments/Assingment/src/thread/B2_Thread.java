package thread;
//B2. W.A.J. P to create one thread by extending Thread class in another Class. 
class Y extends Thread{
	public void run() {
		System.out.println("thread is running");
	}
}
public class B2_Thread {
	public static void main(String[] args) {
		Y y= new Y();
		Thread t1 = new Thread(y);
		t1.start();
		
		
	}
}
