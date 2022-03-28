/* Simple binary search*/
package binarySearchAlgorithm;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60};
        int target = 40;
        int start = 0;
        int end = arr.length - 1;
        while( start <= end){

            int mid = start + ( end  - start) / 2;

            if(target == arr[mid]){
                System.out.print(" Index of target is " + mid);
                break;
            }else if( target > arr[mid]){
                start = mid  + 1;
            }else{
                end  = mid - 1;
            }

        }
       }
    }