package thread;
//B3. W.A.J.P to create 2 threads and execute that threads by providing sleep time as 2000ms and check the execution.
class Th1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Th1: "+i);
		}
	}
}
class Th2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Th2: "+i);
		}
	}
}
public class B3_SleepMethod {
	public static void main(String[] args) {
		Th1 t1= new Th1();
		Th2 t2= new Th2();
//		t1.run();
//		t2.run();
		t1.start();
		t2.start();
	}
}
