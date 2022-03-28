package binarySearchAlgorithm;

public class ceil_And_Floor {
    public static void main(String[] args){
        int[] arr = { 10, 20, 30, 40, 50 , 60, 70, 80, 90, 100};
        int start = 0;
        int end  = arr.length;
        int floor = 0;
        int ceil = 0;
        int target = 55;
        while(start <= end){
            int mid  = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
                floor = arr[mid];
            }else if(target < arr[mid]){
                end = mid - 1;
                ceil = arr[mid];
            }else{
                ceil = arr[mid];
                floor = arr[mid];
            }
        }
        System.out.println("Floor is " + floor + " and Ceiling  is " + ceil);
    }
}
