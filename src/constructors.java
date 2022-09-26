class humming{
    humming(){
        System.out.println("not given any inputs");
    }
    humming(int a) {
        System.out.println("hello world");
        System.out.println(a);
    }
    humming(int a ,int b) {
        System.out.println("hello world");
        int c =  a+b;
        System.out.println(c);
    }
    void hello (int a ){
        System.out.println(a);
    }
}
class music extends humming{
    music(int a ,int b ){
        super(a,b);

        System.out.println("bye" +b);
    }
}
public class constructors {
    public static void main(String[] args) {
        humming h = new humming(1);
        music m = new music(4 ,5);
       // h.hello(5);
    }
}
