package binarySearchAlgorithm;

public class search_Insert_Position_In_Sorted_array {
    public static void main(String[] args){
        int[] arr = { 1, 3, 5, 7};
        int target = 6;
        int result = search(arr, target);
        System.out.println("Missing element index is " + result);
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end ){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return  mid;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
}
