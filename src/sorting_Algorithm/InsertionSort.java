package sorting_Algorithm;

public class InsertionSort {

    static void print(int[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {10, 5, 11, 4, 15, 1};
        System.out.println("----------Array before insertion Sort--------");
        print(arr);
        System.out.println("\n------------Array after insertion Sort----------------");
        insertionSort(arr);
        print(arr);
    }

    static void insertionSort(int[] arr){

        int n = arr.length;

        for(int i = 1; i < n; i++){// sorted part
            int tmp = arr[i];
            int j = i - 1;//unsored part

            while(j >= 0 && arr[j] > tmp){
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = tmp;
        }


    }
}
