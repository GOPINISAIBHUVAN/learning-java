import java.util.*;
public class java_practice_sheet_5 {
    public static void main(String[] args) {
        // problem 1

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = 3; i >0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // problem 2
        int sum = 0;
        int i =1;
        int n=3;
        while(i<=n){
            sum = sum +(2*i);
            i++;
        }
        System.out.println(sum);

        //problem 3
        int n1 = 7;
        for(int i1=1;i1<=10;i1++){
            System.out.println(n1+"*"+i1+"="+(n1*i1));
        }

        // problem 4
        int n2 =10;
        for(int i2=10;i2>=1;i2--){
            System.out.printf("%d * %d = %d",n2,i2,n2*i2);
            System.out.println(" ");
        }

        // problem 5
          int multi = 1;
        int n3 = 4;
        while(n3>0){
            multi = multi * n3;
            n3--;
        }
        System.out.println(multi);

        // problem 6
        int multi1=1;
        for(int n4 =6;n4>0;n4--){
            multi1= multi1 * n4;
        }
        System.out.println(multi1);

        // problem 7
        int a = 1;
        while (a<5){
            int b = 1 ;
            while(b<=a){
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
        }

        // problem 8

        int sum1=0;
        for(int h =1;h<=10;h++){
            sum1 = sum1 + (8*h) ;
        }
        System.out.println(sum1);

        // problem 9

        int sum2 = 0;
        for(int l =1;l<=4;l++){
            sum2 = sum2 + (2*l);
        }
        System.out.println(sum2);
    }
}

