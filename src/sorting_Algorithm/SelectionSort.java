package sorting_Algorithm;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {12, 3, 52, 42, 556, 433, 42, 3};
        sort(arr, arr.length);
    }

    static void sort(int[] arr, int leng){

        for(int i = 0; i < leng - 1; i++){
            int min = i;
            for(int j = i + 1; j < leng; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }

        print(arr, leng);
    }

    static void print(int[] arr, int leng){

        for(int i = 0; i < leng; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
