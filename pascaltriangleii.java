package TestPractice;
	//import org.testng.Assert;
	//import org.testng.annotations.Test;
	import org.junit.Test;
	import java.util.Arrays;
	import java.util.List;
	public class pascaltriangleii {
	    @Test
	    public void example1() {
	        int rowIndex = 3;
	        //int[] output = {1,3,3,1};
	        //Assert.assertEquals(getRow(rowIndex), output);
	        List<Integer> twoSum = getRow(rowIndex);			
			System.out.println(twoSum);
	    }
	    public List<Integer> getRow(int rowIndex) {
	        Integer[] arr = new Integer[rowIndex + 1];
	        Arrays.fill(arr, 0);
	        arr[0] = 1;
	        for (int i = 1; i <= rowIndex; i++) {
	            for (int j = i; j > 0; j--) {
	                arr[j] = arr[j] + arr[j - 1];
	            }
	        }
	        List<Integer> list =  Arrays.asList(arr);
	        return list;
	    }
	}

