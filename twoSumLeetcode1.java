package TestPractice;

import java.util.Arrays;

import org.junit.Test;

public class twoSumLeetcode1 {
	
	@Test
	public void testCase1() {
		int nums[] = {2,7,11,15};
		int target =9;
		int[] twoSum = twoSum(nums,target);
		System.out.println(Arrays.toString(twoSum));
		
	}
	
	public int[] twoSum(int[] nums, int target) {
		for(int i=0; i< nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {0,0};
		
	}
	

}
