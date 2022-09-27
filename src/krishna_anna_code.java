import java.util.*;
class co_prime{
    void adj_co_prime(int[]arr ){
        int x;
        for(int i=0;i<arr.length-1;i++) {

            int max = 1;
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
            }
            if(arr[i]>arr[i+1]) {
                max = arr[i];
            }
            if(arr[i]>arr[i+1]){
                max = arr[i+1];
            }

            for(int j=1;j<=max;j++) {
                if (arr[i] % j == 0 && arr[i + 1] % j == 0) {
                    x = j;
                } else {
                    x = j;
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
}
public class krishna_anna_code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i < arr.length;i++){
            System.out.println("Enter array values" +  i );
            arr[i] = sc.nextInt();
        }
co_prime obj = new co_prime();
obj.adj_co_prime(arr);
    }
}
