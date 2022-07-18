package thread;

class CalcOperation{
	synchronized public void mul(int n) {
		Thread th = Thread.currentThread();
		for(int i=1;i<=5;i++) {
			System.out.println(th.getName()+" : "+(i*n));
		}
	}
}
class Calc extends Thread{
	CalcOperation c;
	public Calc(CalcOperation c) {
		super();
		this.c = c;
	}
	public void run() {
		c.mul(5);
	}
}
public class MethodSync {
	public static void main(String[] args) {
		CalcOperation c = new CalcOperation();
		Calc c1 = new Calc(c);
		Calc c2 = new Calc(c);
		
		c1.start();
		c2.start();
	}

}
