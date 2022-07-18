package thread;
//B5.W.A.J.P to call run() method directly without calling start() method for 2 threads. 
class TestcallRun extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("run method calling..."+i);
		}
	}
}
public class B5_Thread {
	public static void main(String[] args) {
		TestcallRun t1 = new TestcallRun();
		TestcallRun t2 = new TestcallRun();
		
		t1.run();
		t2.run();
	}
}
