package algorithms;

import java.util.ArrayList;

public class transform_and_conquer_check {

	public static boolean transform_and_conquer(ArrayList<Integer> nums) {
		boolean isTrue=true;
		nums.sort(null); // presorting method.
		for (int i=0;i<nums.size()-1;i++) {
			if(nums.get(i)==nums.get(i+1)) {
				isTrue=false;
			}
		}
		return isTrue;
	}
	// problem size=n
	// time complexity= sorting (nlogn)+ (n) = Theta (nlogn)

	public static void main(String[] args) {
		ArrayList<Integer> nums= new ArrayList();
		nums.add(6);
		nums.add(1);
		nums.add(7);
		nums.add(4);
		System.out.println("Before");
		if (transform_and_conquer(nums)) System.out.println("There is no duplicate.");
		System.out.println("After");
		nums.add(7);
		if(!transform_and_conquer(nums)) System.out.println("There are duplicates in array.");
	}

	}


