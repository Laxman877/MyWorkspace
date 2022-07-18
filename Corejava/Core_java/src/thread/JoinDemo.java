package thread;
class Threadjoin extends Thread{
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(th.getName()+" : "+i);
		}
	}
}
public class JoinDemo {
	public static void main(String[] args) {
		Threadjoin t1 = new Threadjoin();
		Threadjoin t2 = new Threadjoin();
		Threadjoin t3 = new Threadjoin();
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
}
