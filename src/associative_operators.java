public class associative_operators {
    public static void main(String[] args) {
         /*

        precedency and associativity  property
        int a = 4*4-6/2;
        System.out.println(a);
        int b = 4/4-6*2;
        System.out.println(b);
        precedency of *,/ are same so it follows associativity property from left to right

        */
        // quick quiz
        int a = 6;
        int b = 8;
        int c = 5;
        int d = 4;
        int x = (b-a)/2;
        int y = (b*b - 4*a*c)/2*a;
        int z = b*b - a*a;
        int l = a*b-d;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(l);
    }
}
