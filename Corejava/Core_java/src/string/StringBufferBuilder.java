package string;

public class StringBufferBuilder {
	public static void main(String[] args) {
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for (int i=1;i<100000;i++) {
			sb.append("tech");
		}
		double endTime = System.currentTimeMillis();
		
		double  startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("tops");
		for(int i=1;i<100000;i++)
		{
			sb1.append("tech");
		}
		double endTime1 = System.currentTimeMillis();
		
		System.out.println("time taken by buffer : "+(endTime-startTime));
		System.out.println("time taken by builder : "+(endTime1-startTime1));
	}
}
