public class loops {
    public static void main(String[] args) {

        //print numbers from 100 -- 200
        int a = 100;
        while(a<=200){
            System.out.println(a);
            a++;
        }

        // while loop
        int b = 0;
        int c = 100;
        do {
            System.out.println(b);
            b++;
        }while(b<100);

        do {
            System.out.println(c);
            c++;
        }while(c<5);

        // for loop

        for(int i=0;i<45;i++){
            System.out.println(i);
        }

        for(int i=1;i<100;i+=2){
            System.out.println(i);
        }
        for(int i =11;i>0;i-=2){
            System.out.println(i);
        }
    }
}
