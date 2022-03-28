package binarySearchAlgorithm;

public class binarySearch_In_An_Infinite_Array {
    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int target = 100;
        System.out.print(infiniteArray(arr,target));
    }
    static int infiniteArray(int[] arr, int target){
        int start = 0;
        int end = 1;
        //setting condition
        while(target >= arr[end]){
            start  = end;
            end = 2 * end;

            if(end  >= arr.length - 1){
                end = arr.length;
            }
        }
         while( start <= end ){
             int mid  = start + (end - start ) / 2;
             if( target == arr[mid]){
                 return mid ;
             }else if(target > arr[mid]){
                 start = mid + 1;
             }else{
                 end = mid - 1;
             }
         }
         return -1;
    }
}
