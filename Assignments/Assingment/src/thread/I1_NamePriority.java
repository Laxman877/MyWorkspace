package thread;
/*I1. W.A.J.P to set the user defined name, priority and get that name and priority for 2 threads using
setName (), setPriority (), getName (), getPriority () methods of Thread class.*/
class Priority extends Thread{
	@Override
	public void run() {
		System.out.println("Thread running..");
	}
}
public class I1_NamePriority {
	public static void main(String[] args) {
		Priority t1 = new Priority();
		Priority t2 = new Priority();
		t1.setName("Th1");
		t2.setName("Th2");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getName()+" "+t1.getPriority());
		System.out.println(t2.getName()+" "+t2.getPriority());
		t1.start();
		t2.start();
	}
}
