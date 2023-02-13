package TestPractice;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

	public class arrayPartition561 {

	    @Test
	    public void example1() {
	        int[] nums = {1,4,3,2};
	        //int output = 4;
	        //Assert.assertEquals(arrayPair(nums), output);
	        int arrayPartition = arrayPair(nums);			
	   			System.out.println(arrayPartition);
	    }

	    public int arrayPair(int[] nums) {

	        int sum = 0;
	        Arrays.sort(nums);
	        for (int i = 0; i < nums.length; i += 2) {
	            sum += Math.min(nums[i], nums[i+1]);
	        }
	        return sum;
	    }
	}

