package fundamentals;

public class Practice18 {
	public static void main(String[] args) {
		int sum=1;
		int c=0;
		int n=0;
		while(c<100) {
			n++;
			if(n%2!=0) {
				if(is_prime(n)) {
					sum+=n;
				}
			}
			c++;
		}
		System.out.println("\nsum of the prime numbers till 100: "+sum);
	}
	public static boolean is_prime(int n) {
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
