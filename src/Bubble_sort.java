/*
BUBBLE SORT ALGORITHM :----
-->Bubble sort algorithm is used to arrange an array in ascending or descending order..!!!
-->we use too loops in bubble sort algorithm..!!
-->first loop refers how many times sorting should be happen...!!
-->second loop compares the adjacent numbers in the array....!!
-->in second loop we run the loop up to (arr.length-i-1) because we have sorted each element after
every ith loop ...!!!
-->bubble sort acts like a floating a (largest or smallest) bubble by comparing with remaining all bubbles. we won't
consider that bubble after floating it...!!
-->bubble sort have time complexity as 0(n*n)...!!!
 */
import java.util.*;
public class Bubble_sort {
    // bubble sort code...!!!
    public static void sort_asc(int[] arr){
        System.out.println("ARRAY SORETD IN ASCENDING ORDER IS...");
        for(int i =0;i<arr.length-1;i++){
             for(int j=0;j<arr.length-i-1;j++){
                 if(arr[j]>arr[j+1]){
                     int temp = arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]= temp;
                 }
             }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void sort_des(int[] arr){
        System.out.println("ARRAY SORTED IN DESCENDING ORDER IS...");
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]< arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("ENTER ARRAY LENGTH..!!");
        int n = sc.nextInt();
        System.out.println("ENTER NUMBERS IN ARRAY...!!!");
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        sort_asc(arr);
        sort_des(arr);
}
}