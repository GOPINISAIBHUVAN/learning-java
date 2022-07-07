public class recursions {

    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            int ease = 1;
            for (int i = 1; i <= n; i++) {
                ease *= i;
            }
            return ease;
        }
    }
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n =4;
        System.out.println("the factorial of " + n+" is :" + factorial(n));
        System.out.println(factorial_iterative(n));
    }
}
