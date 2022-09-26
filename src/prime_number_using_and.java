import java.util.*;
public class prime_number_using_and {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int num = sc.nextInt();
        if((num & 1) == 1) {
            System.out.println("num is odd");
        }
        else{
            System.out.println("num is even");
        }
    }
}



