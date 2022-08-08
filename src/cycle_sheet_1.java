import java.util.*;
public class cycle_sheet_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = n % 10;
        while(n>0){
            int p = n % 10;
            if(p != q){

            }
            n = n/10;
        }
    }
}







// problem 3
//        int[] number = new int[5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 5 numbers :");
//        for(int i=0;i<5;i++){
//            number[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for(int i=0;i<5;i++ ) {
//            if (number[i] > 0) {
//                sum = sum + number[i];
//            }
//        }
//        System.out.println(sum);
