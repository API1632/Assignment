public class Factorial {

	int n;
	
	
	public Factorial(int n) {
		super();
		this.n = n;
	}
	int fact(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else
			return n*fact(n-1);
	}

	public static void main(String[] args) {
		int n=3;
		Factorial f = new Factorial(n);
		
		System.out.println(f.fact(n));
	}

}