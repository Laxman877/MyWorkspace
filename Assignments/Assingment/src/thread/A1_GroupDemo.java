package thread;
/*A1. W.A.J.P to to create 3 threads and make one thread group for all 3 threads and use list () method to
list all threads from group. */
class ThreadGroup1 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class A1_GroupDemo {
	public static void main(String[] args){
		ThreadGroup1 MyRunnable = new ThreadGroup1();
		
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
		
		Thread t1 = new Thread(tg1, MyRunnable,"one");
		Thread t2 = new Thread(tg1, MyRunnable,"two");
		Thread t3 = new Thread(tg1, MyRunnable,"Three");
		
		System.out.println("Thread Group name: "+tg1.getName());
		tg1.list();
		t1.start();
		t2.start();
		t3.start();
	}
}
