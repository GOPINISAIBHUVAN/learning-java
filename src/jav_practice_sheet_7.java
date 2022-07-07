public class jav_practice_sheet_7 {
        // problem 1
        static void multiplication(int n){
            for(int i=1;i<=10;i++) {
                System.out.println(n + "*" + i + "=" + n * i);
            }
        }
        // problem 2
        static void pattern(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        // problem 3
        static int sum(int n){
            if(n==1){
                return 1;
            }
            else {
                return n + sum(n - 1);
            }
        }
        // problem 4
        static void pattern2(int n){
            for(int i=n;i>=1;i--){
                for(int j=i;j>=1;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        // problem 5
        static int fibonacci(int n){
            if(n==1){
                return 0;
            }
            else if (n==2){
                return 1;
            }
            else {
                return fibonacci(n-1)+fibonacci(n-2);
            }
        }
         // problem 6
        static int avg(int ... ar){
            int sum = 0;
            for(int i=0;i<ar.length;i++){
                sum += ar[i];
            }
            int average = sum/ar.length;
          return average;
        }
        // problem 7
    static void pattern_rec(int n){
                if(n>0) {
                    pattern_rec(n - 1);
                    for (int i = n; i >=1; i--) {
                        System.out.print("*");
                    }
                    System.out.println();

                }
    }
    // problem 8
    static void pattern1_rec(int n){
        if(n>0) {

            for (int i = n; i >=1; i--) {
                System.out.print("*");
            }
            System.out.println();
            pattern1_rec(n-1);
        }
    }
    // problem 9
    static float fahren(int n){
            float fah = (n * 1.8f)+32;
        System.out.println(fah);
            return fah;
    }
    // problem 10
    static int sum_itter(int n){
            int sum = 0;
            for(int i =n;i>=1;i--){
                sum += i;
            }
           return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum_itter(3));


        }
}
