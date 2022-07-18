package thread;

class First extends Thread{
	public void display(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class Second extends First{
	String msg;
	First fobj;
	public Second(First fnew, String msg) {
		this.fobj = fnew;
		this.msg=msg;
	}
	public void run() {
		synchronized(fobj) {
			fobj.display(msg);
		}
	}
}
public class A2_Synchronized {
	public static void main(String[] args) {
		First fnew = new First();
		Second ss = new Second(fnew, "Welcome");
		Second ss1 = new Second(fnew, "new");
		Second ss2 = new Second(fnew, "programmer");
		
		ss.start();
		ss1.start();
		ss2.start();
	}
}
