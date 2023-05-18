package Fibonacci;
public class BruteForcefibonacci {
	// It's brute force 
	public static int No_memoizationFibo(int n) {
		if(n==0 || n==1) return n;
		return No_memoizationFibo(n-1)+No_memoizationFibo(n-2);  
		// problem size=n
		// time complexity = T(0)=T(1)=1 T(n-1)+T(n-2)=Theta (2^n)
		// space complexity = 0 (constant)
	}
	
	public static void main(String[] args) {
		int x=No_memoizationFibo(6);
		System.out.println(x);
		
		int y=No_memoizationFibo(20);
		System.out.println(y);
		
	}
}
