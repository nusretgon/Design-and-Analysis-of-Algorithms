package algorithms;

import java.util.ArrayList;

public class bruteForceCheck {
	public static boolean bruteForce(ArrayList<Integer> nums) {
		boolean isTrue=true;
		for (int i=0;i<nums.size()-1;i++) {
			for(int j=i+1;j<nums.size();j++) {
				if (nums.get(i)==nums.get(j)) {
					isTrue=false;
				}
			}
		}
		return isTrue;
	}
	
	// problem size=n
	// time complexity= Theta (n^2)
	
public static void main(String[] args) {
		ArrayList<Integer> nums= new ArrayList();
		nums.add(6);
		nums.add(1);
		nums.add(7);
		nums.add(4);
		System.out.println("Before");
		if (bruteForce(nums)) System.out.println("There is no duplicate.");
		System.out.println("After");
		nums.add(7);
		if(!bruteForce(nums)) System.out.println("There are duplicates in array.");
	
}
}

