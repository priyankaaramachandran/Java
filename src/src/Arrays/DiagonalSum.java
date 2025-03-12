package Arrays;

public class DiagonalSum {
    public static void main(String[] args){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat){
        int sum = 0;
        int n = mat.length;
        for(int i =0;i<n;i++){
            //mat[i][i] gives primary diagonal
            //mat[i][n-i-1] gives secondary diagonal
            sum +=mat[i][i] + mat[i][n-i-1];
        }
        //if its an odd matrix (eg, 3*3 / 5*5) then the intersecting position need to be added only once
        if(n%2 !=0){
            sum -=mat[n/2][n/2];
        }

        return sum;
    }
}
