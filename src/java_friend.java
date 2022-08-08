import java.util.*;
public class java_friend {
    public static void main(String[] args) {
        String[] array = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter fruit name :");
        for(int i=0;i<array.length;i++){
            String fruits = sc.nextLine();
            array[i]= fruits;
        }
        for(int i=0;i< array.length;i++){
            if(i==3||i==4){

                break;
            }
            System.out.println(i + "friut name is " + array[i] );

        }
        System.out.println("friut name is" );
    }
}
