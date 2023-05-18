package Fibonacci;

import java.util.ArrayList;

public class DynamicProgramming {
	
	public static int nMemoryFibo(int n) {
		ArrayList<Integer> fibo = new ArrayList();
		fibo.add(0);
		fibo.add(1);
		for(int i=2;i<n+1;i++) {
			fibo.add(fibo.get(i-1)+fibo.get(i-2));
		}
		return fibo.get(n);
		// problem size=n
		// time complexity = Theta (n)
		// space complexity = n (linear)
	}
	
	public static int ConstantMemoryFibo(int n) {
		int prev1=0;
		int prev2=1;
		for(int i=1;i<n;i++) {
			int temp=prev1+prev2;
			prev1=prev2;
			prev2=temp;
		}
		return prev2;
		// problem size=n
		// time complexity = Theta (n)
		// space complexity = 2 (constant)

	}

	public static void main(String[] args) {
		int total=ConstantMemoryFibo(6);
		System.out.println(total);
		
		int total2=ConstantMemoryFibo(20);
		System.out.println(total2);
		
		System.out.println("------------");
		
		int total3=nMemoryFibo(6);
		System.out.println(total3);
		
		int total4=nMemoryFibo(20);
		System.out.println(total4);
		
		

	}

}
