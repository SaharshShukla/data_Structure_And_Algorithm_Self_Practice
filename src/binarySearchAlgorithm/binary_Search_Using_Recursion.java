package binarySearchAlgorithm;

public class binary_Search_Using_Recursion {
    public static void main(String[] args){
        int[] arr = { 10, 20, 30, 40, 50, 60};
        int rslt = rec( arr, 0, arr.length - 1, 40);
        System.out.print("Index of target is : " + rslt);
    }
    static int rec( int[] arr, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = start + ( end  - start) / 2;
        if(target == arr[mid]){
            return mid;
        } else if(target < arr[mid]){
            return rec( arr, start, mid - 1, target);
        }else  {
            return rec( arr, mid + 1, end, target);
        }
    }
}
