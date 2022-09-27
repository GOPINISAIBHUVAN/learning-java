import java.util.*;
class arr_co_prime{
    void adj_co_prime(int[] arr ){
        int x = 0;
        for(int i=0;i<arr.length-1;i++) {
            int max = 1;
            if(arr[i]== arr[i+1]){
                max = arr[i];
            }
            if(arr[i]==0 && arr[i+1]==0) {
                x = 0;
            }
            if(arr[i]>arr[i+1]) {
                max = arr[i];
            }
            if(arr[i]<arr[i+1]){
                max = arr[i+1];
            }
            for(int j=1;j<=max;j++) {
                if (arr[i] % j == 0 && arr[i + 1] % j == 0) {
                    x = j;
                }
            }
            if (x == 1){
                System.out.println("the numbers are co prime");
            }
            else{
                System.out.println("the numbers are not co prime");
            }
        }
    }
}
public class adj_co_prime_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i < arr.length;i++){
            System.out.println("Enter array values" +  i );
            arr[i] = sc.nextInt();
        }
arr_co_prime obj = new arr_co_prime();
obj.adj_co_prime(arr);
    }
}
