public class fibonacci_recursion {
    static int fibno(int m){
        if(m==1){
            return 0;
        }
        else if(m==2){
            return 1;
        }
        else {
                int fib = fibno(m-1)+fibno(m-2);
            return fib;
        }
    }
    public static void main(String[] args) {
        for(int i = 1;i<=8;i++){
            System.out.print(fibno(i) + " ");
        }

    }
}
