package binarySearchAlgorithm;

public class firstOccurrence_And_LastOccurrence_In_A_Sorted_Array {
    public static void main(String[] args){
        int[] arr = { 1, 1, 2, 2, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7};
        int target = 2;
        int lastOcc = bSearch( arr, target, true);
        int firstOcc = bSearch( arr,target, false);
        System.out.println("First Occurrence " + firstOcc);
        System.out.println("Last Occurrence " + lastOcc);
    }
    static int bSearch( int[] arr, int target,boolean flag){
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while( start <= end){
            int mid = start +  ( end - start ) / 2;
            if(target == arr[mid]){
                index  = mid;
                if(flag == true ){
                    start = mid  + 1;
                }else{
                    end = mid  - 1;
                }
            }
            else if( target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return index + 1;
    }
}
