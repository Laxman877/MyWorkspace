package thread;
/*I2. W.A.J.P to create 2 threads and make one thread as DaemonThread by using setDaemon () method
of Thread class and check whether the thread is set daemon or not by using isDaemon () method. */
class TestdaemonThread extends Thread{
	@Override
	public void run() {
		System.out.println("Name Of Thread: "+Thread.currentThread().getName());
		System.out.println("Daemon: "+Thread.currentThread().isDaemon());
	}
}
public class I2_DaemonThread {
	public static void main(String[] args) {
		TestdaemonThread t1 = new TestdaemonThread();
		TestdaemonThread t2 = new TestdaemonThread();
		t1.start();
		t1.setDaemon(true);
		t2.start();
	}
}
