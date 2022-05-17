package sorting_Algorithm;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {10, 5, 11, 4, 15, 1};
        System.out.println("----------Array before bubble sort---------");
        print(arr);
        System.out.println("\n------------Array after bubble sort----------------");
        bubbleSort(arr);
        print(arr);
    }

    static void bubbleSort(int[] arr){
        boolean isSwapped;
        int n = arr.length;

        for(int i = 0; i < (n - 1); i++){
            isSwapped = false;
            for(int j = 0; j < (n - 1 - i); j++){
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isSwapped = true;
                }
            }

            if(isSwapped == false){
                break;
            }
        }
    }

    static void print(int[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
