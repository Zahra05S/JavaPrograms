package TestPractice;

import org.junit.Test;

public class rotateImage {

    // Leetcode_ 48
    @Test
    public void example1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] output = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        rotate(matrix);
        //Assert.assertEquals(input, output);
        //int[][] rotate = rotate(matrix);
        
    }

    public void rotate(int[][] matrix) {

        for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix.length/2;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] = temp;
            }
        }
    }
}

