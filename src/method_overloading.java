public class method_overloading {
    static int sum(int ... ar){
        int result = 0;
        for(int i=0;i<ar.length;i++) {
            result += ar[i];
        }
        return result;
    }
    static void rep(){
        System.out.println("hello");
    }
    static void rep(int a){
        System.out.println( a +" hello");
    }static void rep(int a,int b){
        System.out.println(a+b +" hello");
    }
     static void tell_a_joke(){
        System.out.println("my name is java_coder");
    }
    public static void main(String[] args) {
         tell_a_joke();
         rep();
         rep(23);
         rep(23,67);
        System.out.println(sum(45,78,98,90));
    }
}
