package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args){
        //int[][] matrix = {{2,5,8},{4,0,-1}};
        int[][] matrix = {{1,2,3},{4,5,6}};
        //123654
        System.out.println(spiralMatrixRead(matrix).toString());
    }
    public static List<Integer> spiralMatrixRead(int[][] matrix){
        List<Integer> result = new ArrayList<Integer>();
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;

        while(left <= right && top <= bottom){

            //left to right
            for(int i=left;i <= right;i++){
                System.out.println("left: "+i+" right "+right);
                result.add(matrix[top][i]);
                System.out.println("left to right : "+result.toString());
            }
                top++;
            //top to bottom
            for(int i=top;i<=bottom;i++){
                System.out.println("top: "+i+" bottom "+bottom);
                result.add(matrix[i][right]);
                System.out.println("top to bottom :"+result.toString());
            }
            right--;
            //right to left
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.println("right: " + i + " left " + left);
                    result.add(matrix[bottom][i]);
                    System.out.println(result.toString());
                }
                bottom--;
            }
        //bottom to top
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.println("bottom: " + i + " top " + top);
                    result.add(matrix[i][left]);
                    System.out.println(result.toString());
                }
                left++;
            }
        }

        return result;
    }
}
