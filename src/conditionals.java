public class conditionals {
    public static void main(String[] args) {
        int a = 28;
        if(a>18){
            System.out.println("you can drive");
        }
        else{
            System.out.println("you cant drive yet");
        }
        // logical operators
        System.out.println("for logical AND.");
        boolean y = true;
        boolean n = false;
        if(y&&n){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        System.out.println("for logical OR.");
        if(y||n){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        System.out.println("for logical NOT.");
        System.out.print("not(y) is ");
        System.out.println(!y);
        System.out.print("not(n) is ");
        System.out.println(!n);
    }
}
