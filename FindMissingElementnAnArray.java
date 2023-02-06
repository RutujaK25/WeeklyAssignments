package week1.day2;

import java.util.Arrays;

public class FindMissingElementnAnArray {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,7,6,8,0};
		
		Arrays.sort(nums);
		
		
		
		for (int i = 0; i <nums.length; i++) {
			
			
			
		//System.out.print(nums[i] + " ");
		
		if(i!=nums[i])
		{
			System.out.print(i);
			break;
		}
		
		}
		
		
		}
	}


