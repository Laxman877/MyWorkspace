package oops;
class StDemo
{
	static 
	{
		System.out.println("Calling demo clas static block..");
	}
	public StDemo() {
		System.out.println("Cons calling..");
	}
}
public class OOPS15_StaticBlock {
	public static void main(String[] args) {
         System.out.println("Running main class...");
		
		{
			System.out.println("Running non static block...");
		}
		
		StDemo st = new StDemo();
	}

}
