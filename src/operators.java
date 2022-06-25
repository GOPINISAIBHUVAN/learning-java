public class operators {
    public static void main(String[] args) {
        // arthimetic operators +,-,*,/,%,++,--
        int a = 45;
        int b = a % 4; // gives remainder ...
        System.out.println(b);    // modulo operator
        // modulo operators can also give decimal remainder
        float a1 = 4.5f;
        float b1 =  a1 % 1.1f;
        System.out.println(b1);

        // assignment operators  +,+=
        int c = 43;
        c += 5;
        System.out.println(c);

        // comparison operators == ,>=,<=
        System.out.println(87 == 98);
        System.out.println(87 > 98);
        System.out.println(87 < 98);

        // logical operators &&,||
        System.out.println(68>23 && 68>56);
        System.out.println(78>98 || 67>56);

        // bitwise operators  & ,|
        System.out.println(1999&2000);
        System.out.println(1999|2000);
    }
}
