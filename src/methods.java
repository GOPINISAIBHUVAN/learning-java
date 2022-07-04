public class methods {
    int process(int a ,int b){
        int c;
        if(a>b){
            c = a+b;
        }
        else{
            c=(a+b)*5;
        }
    return c;
    }
    public static void main(String[] args) {

        int a1 = 45;
        int b1 = 50;
        int c1;
        methods sc = new methods();
        c1 =sc.process(a1,b1);
        System.out.println(c1);
    }
}
