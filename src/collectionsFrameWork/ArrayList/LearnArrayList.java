package collectionsFrameWork.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LearnArrayList {

    static void linearSearch(){

        Scanner scn = new Scanner(System.in);
        List<Integer> al = new ArrayList<Integer>();

        System.out.println("Enter 4 element : ");
        for(int i = 0; i < 4; i++){
            al.add(scn.nextInt());
        }

        System.out.println("elements are "+ al);
        int indx  = -1;

        for(int i = 0; i < al.size(); i++){
            if(al.get(i).equals(3)){
                indx = i;
                break;
            }
        }

        System.out.println("index is " + indx);





    }



    public static void main(String[] args){

        //search();
        //linearSearch();
        removeAllOccurrence();
    }

    static void removeAllOccurrence(){

        List <String> al = new ArrayList<String>();

        al.add("saharsh");
        al.add("ravi");
        al.add("abhishek");
        al.add("rohit");
        al.add("apekshit");
        al.add("saharsh");
        al.add("ravi");

        System.out.println("Arraylist before removing");
        System.out.println(al);

        for(int i = 0; i < al.size(); i++){
            if(al.get(i).equals("saharsh")){
                al.remove(al.get(i));
            }

        }
        System.out.println("Arraylist after removing");
        System.out.println(al);



    }



    //hetrogenius datatype
    static void search(){
        List al = new ArrayList(); // her we have not metione data type so
        al.add(1);
        al.add(2);
        al.add(3);
        int ind = -1;
        int x  = 5;

        for(int i = 0; i < al.size(); i++){
            if(al.get(i).equals(x)){
                ind = i;
            }
        }
        System.out.println("Index is " + ind);

    }
}
