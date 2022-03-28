package binarySearchAlgorithm;

public class binarySearch_In_A_2D_Matrix {
    public static void main(String[] args){
        int[][] mat = {{ 10, 20 , 30, 40},
                {15, 25 , 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}};
        int[]rslt =  searchInMatrix(mat,45);
        for(int i = 0; i < rslt.length; i++ ){
            System.out.print("Index of target in 2-D matrix is  " + rslt[i] + " ");
        }
    }
    static int[] searchInMatrix(int[][] mat,int target){
        int row = 0;
        int col = mat[0].length - 1;
        while(row < mat.length && col >= 0){
            if(target == mat[row][col]){
                return new int[]{row,col};
            }else if(target > mat[row][col]){
                row++;
            }else{
                col --;
            }
        }
        return new int[] {-1 ,- 1};
    }
}
