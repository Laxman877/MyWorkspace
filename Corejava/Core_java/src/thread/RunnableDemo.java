package thread;
class Sample{
	
}
class T1 extends Sample implements Runnable{
	public void run() {
		for(int i=0;i<=10;i++) {
//			try {
//				Thread.sleep(2000);
//				
//			}catch(InterruptedException e){
//				e.printStackTrace();
//			}
			System.out.println("T1 = "+i);
		}
	}
}
class T2 implements Runnable{

	public void run() {
		for(int i=0;i<=10;i++) {
//			try {
//				Thread.sleep(3000);
//				
//			}catch(InterruptedException e){
//				e.printStackTrace();
//			}
			System.out.println("T2 = "+i);
		}
	}

}
public class RunnableDemo {
	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		//t1.run();
		//t2.run();
//		t1.setName("java");
//		t2.setName("testing");
		//t1.setPriority(Thread.MAX_PRIORITY);
		//t2.setPriority(Thread.MIN_PRIORITY);
//		t1.setPriority(9);
//		t2.setPriority(7);
//		System.out.println(t1.getId()+" "+t2.getId());
//		System.out.println(t1.getName()+" "+t2.getName());
//		System.out.println(t1.getPriority()+" "+t2.getPriority());
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		th1.start();
		th2.start();
	}
}
